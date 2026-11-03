/*
 * @(#)CiSettingsHygieneTest.java
 *
 * Copyright (c) Luis Antonio Mata Mata. All rights reserved.
 *
 * All rights to this product are owned by Luis Antonio Mata Mata and may only
 * be used under the terms of its associated license document. You may NOT
 * copy, modify, sublicense, or distribute this source file or portions of
 * it unless previously authorized in writing by Luis Antonio Mata Mata.
 * In any event, this notice and the above copyright must always be included
 * verbatim with this file.
 */

package com.umdc.commons.build;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.regex.Pattern;

import org.junit.jupiter.api.Test;

/**
 * Guards {@code ci_settings.xml} of the commons module: the Maven repository credentials must be read from the environment
 * ({@code ${env.REPSY_ACCOUNT_USER}} and {@code ${env.REPSY_ACCOUNT_PASSWORD}}), never written in clear text,
 * because the file is versioned.
 */
class CiSettingsHygieneTest {

    private static final Path CI_SETTINGS = Path.of("ci_settings.xml");

    /** A username or password element whose content is not an {@code ${env.*}} reference. */
    private static final Pattern LITERAL_CREDENTIAL =
            Pattern.compile("<(username|password)>\\s*(?!\\$\\{env\\.)[^<\\s][^<]*</\\1>");

    @Test
    void credentialsComeFromTheEnvironment() throws IOException {
        String xml = Files.readString(CI_SETTINGS);

        assertFalse(LITERAL_CREDENTIAL.matcher(xml).find(), "ci_settings.xml carries a literal username or password");
        assertTrue(xml.contains("<username>${env.REPSY_ACCOUNT_USER}</username>"));
        assertTrue(xml.contains("<password>${env.REPSY_ACCOUNT_PASSWORD}</password>"));
    }

    @Test
    void detectorFlagsLiteralCredentialsAndAcceptsEnvironmentReferences() {
        List<String> literal = List.of("<username>someone</username>", "<password> secret </password>");
        List<String> safe = List.of("<username>${env.REPSY_ACCOUNT_USER}</username>", "<password></password>");

        literal.forEach(xml -> assertTrue(LITERAL_CREDENTIAL.matcher(xml).find(), xml));
        safe.forEach(xml -> assertFalse(LITERAL_CREDENTIAL.matcher(xml).find(), xml));
        assertEquals(2, literal.size());
    }
}
