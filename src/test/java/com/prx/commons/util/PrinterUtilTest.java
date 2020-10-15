/*
 *  @(#)PrinterUtilTest.java
 *
 *  Copyright (c) Luis Antonio Mata Mata. All rights reserved.
 *
 *  All rights to this product are owned by Luis Antonio Mata Mata and may only
 *  be used under the terms of its associated license document. You may NOT
 *  copy, modify, sublicense, or distribute this source file or portions of
 *  it unless previously authorized in writing by Luis Antonio Mata Mata.
 *  In any event, this notice and the above copyright must always be included
 *  verbatim with this file.
 */
package com.prx.commons.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.test.util.ReflectionTestUtils;

/**
 * PrinterUtilTest.
 *
 * @author &lt;a href='mailto:luis.antonio.mata@gmail.com'&gt;Luis Antonio Mata&lt;/a&gt;
 * @version 1.0.0, 15-10-2020
 */
class PrinterUtilTest {

    @Test
    void print() {
        final var printerUtil = new PrinterUtil();
        Logger logger = LogManager.getLogger(this.toString());
        assertDoesNotThrow(() ->  printerUtil.print("Valores de trazas", logger, true));
        assertDoesNotThrow(() ->  printerUtil.print("Valores de trazas en false", logger, false));
    }

    @Test
    void testPrint() {
        final var printerUtil = new PrinterUtil();
        ReflectionTestUtils.setField(printerUtil, "isDebug", true);
        Logger logger = LogManager.getLogger(this.toString());
        assertDoesNotThrow(() ->  printerUtil.print("Valores de trazas", logger));
        ReflectionTestUtils.setField(printerUtil, "isDebug", false);
        assertDoesNotThrow(() ->  printerUtil.print("Valores de traza en false", logger));
    }

}