/*
 * @(#)${NAME}.java.
 *
 * Copyright (c) Luis Antonio Mata Mata. All rights reserved.
 *
 * All rights to this product are owned by Luis Antonio Mata Mata and may only
 * be used under the terms of its associated license document. You may NOT
 * copy, modify, sublicense, or distribute this source file or portions of
 * it unless previously authorized in writing by Luis Antonio Mata Mata.
 * In any event, this notice and the above copyright must always be included
 * verbatim with this file.
 *
 */

package com.prx.commons.enums.types;

import java.util.Arrays;
import static org.hibernate.validator.internal.util.Contracts.assertNotNull;
import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.Test;

/**
 * ContactTypeTest.
 *
 * @author Luis Antonio Mata
 * @version 1.0.0, 20-10-2020
 */
class ContactTypeTest {

    @Test
    void keys() {
        for (final var tp : ContactType.values()) {
            assertTrue(Arrays.asList(ContactType.values()).contains(tp));
            assertNotNull(ContactType.getConctactType(tp.ordinal()));
        }
    }

}