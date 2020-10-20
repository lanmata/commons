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
package com.prx.commons.util;

import static com.prx.commons.util.DateUtil.SIMPLE_DATE_FORMAT;
import static com.prx.commons.util.DateUtil.SIMPLE_DATE_FORMAT_DDMMYY;
import static com.prx.commons.util.DateUtil.SIMPLE_DATE_TIME_FORMAT;
import static com.prx.commons.util.DateUtil.SIMPLE_DATE_TIME_FORMAT_MIL;
import static com.prx.commons.util.DateUtil.SIMPLE_DATE_TIME_FORMAT_T;
import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

/**
 * DateUtilTest.
 *
 * @author &lt;a href='mailto:luis.antonio.mata@gmail.com'&gt;Luis Antonio Mata&lt;/a&gt;
 * @version 1.0.0, 14-10-2020
 */
class DateUtilTest {

    @Test
    void constructor() throws NoSuchMethodException {
        final var constructor = DateUtil.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        assertThrows(InvocationTargetException.class, constructor::newInstance);
    }

    @Test
    void validateDate() {
        assertTrue(DateUtil.validateDate(LocalDate.now(ZoneId.systemDefault()),
            LocalDate.now(ZoneId.systemDefault())));
    }

    @Test
    void toDate() {
        assertNotNull(DateUtil.toDate(LocalDateTime.now(ZoneId.systemDefault())));
    }

    @Test
    void convertStringToCalendar() throws ParseException {
        assertNotNull(DateUtil.convertStringToCalendar("2020-10-23 23:10:45", SIMPLE_DATE_TIME_FORMAT.get(),true));
        assertNotNull(DateUtil.convertStringToCalendar("2020-10-23", SIMPLE_DATE_FORMAT.get(),true));
        assertNotNull(DateUtil.convertStringToCalendar("23/10/2020", SIMPLE_DATE_FORMAT_DDMMYY.get(),false));
        assertNotNull(DateUtil.convertStringToCalendar(null, SIMPLE_DATE_TIME_FORMAT_T.get(),true));
        assertNotNull(DateUtil.convertStringToCalendar("", SIMPLE_DATE_TIME_FORMAT_MIL.get(),true));
        assertNotNull(DateUtil.convertStringToCalendar("2020-10-23", SIMPLE_DATE_FORMAT.get(),false));

    }

}