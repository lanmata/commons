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
package com.umdev.commons.util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class DateUtilTest {

    @Test
    @DisplayName("Convert valid string to calendar with default time")
    void convertValidStringToCalendarWithDefaultTime() throws ParseException {
        Calendar calendar = DateUtil.convertStringToCalendar("2020-10-23", DateUtil.SIMPLE_DATE_FORMAT.get(), true);
        assertEquals(2020, calendar.get(Calendar.YEAR));
        assertEquals(Calendar.OCTOBER, calendar.get(Calendar.MONTH));
        assertEquals(23, calendar.get(Calendar.DAY_OF_MONTH));
        assertEquals(0, calendar.get(Calendar.HOUR_OF_DAY));
        assertEquals(0, calendar.get(Calendar.MINUTE));
        assertEquals(0, calendar.get(Calendar.SECOND));
        assertEquals(0, calendar.get(Calendar.MILLISECOND));
    }

    @Test
    @DisplayName("Convert valid string to calendar without default time")
    void convertValidStringToCalendarWithoutDefaultTime() throws ParseException {
        Calendar calendar = DateUtil.convertStringToCalendar("2020-10-23 23:10:45", DateUtil.SIMPLE_DATE_TIME_FORMAT.get(), false);
        assertEquals(2020, calendar.get(Calendar.YEAR));
        assertEquals(Calendar.OCTOBER, calendar.get(Calendar.MONTH));
        assertEquals(23, calendar.get(Calendar.DAY_OF_MONTH));
        assertEquals(23, calendar.get(Calendar.HOUR_OF_DAY));
        assertEquals(10, calendar.get(Calendar.MINUTE));
        assertEquals(45, calendar.get(Calendar.SECOND));
    }

    @Test
    @DisplayName("Convert null string to calendar")
    void convertNullStringToCalendar() throws ParseException {
        Calendar calendar = DateUtil.convertStringToCalendar(null, DateUtil.SIMPLE_DATE_FORMAT.get(), true);
        assertNotNull(calendar);
    }

    @Test
    @DisplayName("Convert empty string to calendar")
    void convertEmptyStringToCalendar() throws ParseException {
        Calendar calendar = DateUtil.convertStringToCalendar("", DateUtil.SIMPLE_DATE_FORMAT.get(), true);
        assertNotNull(calendar);
    }

    @Test
    @DisplayName("Validate equal dates")
    void validateEqualDates() {
        LocalDate date = LocalDate.of(2020, 10, 23);
        assertTrue(DateUtil.validateDate(date, date));
    }

    @Test
    @DisplayName("Validate different dates")
    void validateDifferentDates() {
        LocalDate date1 = LocalDate.of(2020, 10, 23);
        LocalDate date2 = LocalDate.of(2021, 10, 23);
        assertFalse(DateUtil.validateDate(date1, date2));
    }

    @Test
    @DisplayName("Convert LocalDateTime to Date")
    void convertLocalDateTimeToDate() {
        LocalDateTime localDateTime = LocalDateTime.of(2020, 10, 23, 10, 10, 10);
        Date date = DateUtil.toDate(localDateTime);
        assertNotNull(date);
    }
}
