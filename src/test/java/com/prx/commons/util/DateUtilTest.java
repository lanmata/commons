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

import static com.prx.commons.util.DateUtil.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.text.SimpleDateFormat;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

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

    /**
     * Method under test: {@link DateUtil#validateDate(LocalDate, LocalDate)}
     */
    @Test
    void testValidateDate() {
        LocalDate now = LocalDate.of(1970, 1, 1);
        assertTrue(DateUtil.validateDate(now, LocalDate.of(1970, 1, 1)));
    }

    /**
     * Method under test: {@link DateUtil#validateDate(LocalDate, LocalDate)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testValidateDate2() {
        // TODO: Complete this test.
        //   Reason: R031 Method may be time-sensitive.
        //   Diffblue Cover was only able to write tests that are time-sensitive.
        //   The assertions don't pass when run at an alternate date, time, and
        //   timezone. Try refactoring the method to take a java.time.Clock instance so
        //   that the time can be parameterized during testing.
        //   See https://diff.blue/R031 for details.

        LocalDate now = LocalDate.now();
        DateUtil.validateDate(now, LocalDate.of(1970, 1, 1));
    }

    /**
     * Method under test: {@link DateUtil#validateDate(LocalDate, LocalDate)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testValidateDate3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "java.time.LocalDate.isEqual(java.time.chrono.ChronoLocalDate)" because "now" is null
        //       at com.prx.commons.util.DateUtil.validateDate(DateUtil.java:154)
        //   See https://diff.blue/R013 to resolve this issue.

        DateUtil.validateDate(null, LocalDate.of(1970, 1, 1));
    }

    @Test
    void validateDate() {
        assertTrue(DateUtil.validateDate(LocalDate.now(ZoneId.systemDefault()),
                LocalDate.now(ZoneId.systemDefault())));
    }

    /**
     * Method under test: {@link DateUtil#toDate(LocalDateTime)}
     */
    @Test
    void testToDate() {
        // TODO: Complete this test.
        //   Diffblue AI was unable to find a test

        DateUtil.toDate(LocalDate.of(1970, 1, 1).atStartOfDay());
    }

    @Test
    void toDate() {
        assertNotNull(DateUtil.toDate(LocalDateTime.now(ZoneId.systemDefault())));
    }

    @Test
    void convertStringToCalendar() throws ParseException {
        assertNotNull(DateUtil.convertStringToCalendar("2020-10-23 23:10:45", SIMPLE_DATE_TIME_FORMAT.get(), true));
        assertNotNull(DateUtil.convertStringToCalendar("2020-10-23", SIMPLE_DATE_FORMAT.get(), true));
        assertNotNull(DateUtil.convertStringToCalendar("23102020", SIMPLE_DATE_FORMAT_DDMMYY.get(), false));
        assertNotNull(DateUtil.convertStringToCalendar("23/10/2020", SIMPLE_DATE_FORMAT_WITH_SEPARATOR_DDMMYY.get(),
                false));
        assertNotNull(DateUtil.convertStringToCalendar(null, SIMPLE_DATE_TIME_FORMAT_T.get(), true));
        assertNotNull(DateUtil.convertStringToCalendar("", SIMPLE_DATE_TIME_FORMAT_MIL.get(), true));
        assertNotNull(DateUtil.convertStringToCalendar("2020-10-23", SIMPLE_DATE_FORMAT.get(), false));

    }

    /**
     * Method under test: {@link DateUtil#convertStringToCalendar(String, SimpleDateFormat, boolean)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testConvertStringToCalendar() throws ParseException {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.text.ParseException: Unparseable date: "2020-03-01"
        //       at java.text.DateFormat.parse(DateFormat.java:399)
        //       at com.prx.commons.util.DateUtil.convertStringToCalendar(DateUtil.java:134)
        //   See https://diff.blue/R013 to resolve this issue.

        DateUtil.convertStringToCalendar("2020-03-01", new SimpleDateFormat(), true);
    }

    /**
     * Method under test: {@link DateUtil#convertStringToCalendar(String, SimpleDateFormat, boolean)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testConvertStringToCalendar2() throws ParseException {
        // TODO: Complete this test.
        //   Reason: R031 Method may be time-sensitive.
        //   Diffblue Cover was only able to write tests that are time-sensitive.
        //   The assertions don't pass when run at an alternate date, time, and
        //   timezone. Try refactoring the method to take a java.time.Clock instance so
        //   that the time can be parameterized during testing.
        //   See https://diff.blue/R031 for details.

        DateUtil.convertStringToCalendar(null, new SimpleDateFormat(), false);
    }

    /**
     * Method under test: {@link DateUtil#convertStringToCalendar(String, SimpleDateFormat, boolean)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testConvertStringToCalendar3() throws ParseException {
        // TODO: Complete this test.
        //   Reason: R031 Method may be time-sensitive.
        //   Diffblue Cover was only able to write tests that are time-sensitive.
        //   The assertions don't pass when run at an alternate date, time, and
        //   timezone. Try refactoring the method to take a java.time.Clock instance so
        //   that the time can be parameterized during testing.
        //   See https://diff.blue/R031 for details.

        DateUtil.convertStringToCalendar("", new SimpleDateFormat(), true);
    }

}
