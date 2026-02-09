/*
 *  @(#)DateUtil.java
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

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * Utility class for date/time formatting and conversions.
 *
 * <p>Provides thread-safe date formatters and helpers to convert between
 * {@link java.time} types and legacy {@link java.util.Date}/{@link Calendar}.
 *
 * @author <a href='mailto:luis.antonio.mata@gmail.com'>Luis Antonio Mata.</a>
 * @version 1.0.3, 29-09-2020
 */
public final class DateUtil {

    /**
     * Date pattern yyyy/MM/dd, example: 2000/01/30
     */
    public static final ThreadLocal<SimpleDateFormat> SIMPLE_DATE_FORMAT_WITH_SEPARATOR_DDMMYY;
    /**
     * Date-time pattern yyyy-MM-dd HH:mm:ss.SSS, example: 2000-01-30 12:30:25.369
     */
    public static final ThreadLocal<SimpleDateFormat> SIMPLE_DATE_TIME_FORMAT_MIL;
    /**
     * Pattern for datetime with 'T' separator yyyy-MM-ddTHH:mm:ss, example: 2000-01-30T12:30:25
     */
    public static final ThreadLocal<SimpleDateFormat> SIMPLE_DATE_TIME_FORMAT_T;
    /**
     * Pattern for date yyyyMMdd, example: 20000130
     */
    public static final ThreadLocal<SimpleDateFormat> SIMPLE_DATE_FORMAT_DDMMYY;
    /**
     * Pattern for datetime without milliseconds yyyy-MM-dd HH:mm:ss
     */
    public static final ThreadLocal<SimpleDateFormat> SIMPLE_DATE_TIME_FORMAT;
    /**
     * Pattern for date yyyy-MM-dd, example: 2000-01-30
     */
    public static final ThreadLocal<SimpleDateFormat> SIMPLE_DATE_FORMAT;
    /**
     * DateTimeFormatter for PATTERN_DATE_TIME_MIL
     */
    public static final DateTimeFormatter DATE_TIME_FORMATTER;
    /**
     * DateTimeFormatter for PATTERN_DATE
     */
    public static final DateTimeFormatter DATE_FORMATTER;
    /**
     * Pattern: yyyy-MM-dd HH:mm:ss.SSS
     */
    public static final String PATTERN_DATE_TIME_MIL = "yyyy-MM-dd HH:mm:ss.SSS";
    /**
     * Pattern: yyyy-MM-dd HH:mm:ss.S (short milliseconds)
     */
    public static final String PATTERN_DATE_TIME_SHORTLY_MILLISECONDS = "yyyy-MM-dd HH:mm:ss.S";
    /**
     * Pattern: yyyy-MM-ddTHH:mm:ss
     */
    public static final String PATTERN_DATE_TIME_T = "yyyy-MM-dd'T'HH:mm:ss";
    /**
     * Pattern: yyyyMMddHHmmss
     */
    public static final String PATTERN_DATETIME_YYYYMMDDHHMMSS = "yyyyMMddHHmmss";
    /**
     * Pattern: yyyy-MM-dd HH:mm:ss
     */
    public static final String PATTERN_DATE_TIME = "yyyy-MM-dd HH:mm:ss";
    /**
     * Pattern: yyMMddHHmmss
     */
    public static final String PATTERN_DATETIME_YYMMDDHHMMSS = "yyMMddHHmmss";
    /**
     * Pattern: yyyy-MM-dd
     */
    public static final String PATTERN_DATE = "yyyy-MM-dd";
    /**
     * Pattern: ddMMyyyy
     */
    public static final String PATTERN_DDMMYY = "ddMMyyyy";
    /**
     * Pattern: dd/MM/yyyy
     */
    public static final String PATTERN_WIT_SEPARATOR_DDMMYY = "dd/MM/yyyy";
    static {
        DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern(PATTERN_DATE_TIME_MIL, Locale.ROOT);
        DATE_FORMATTER = DateTimeFormatter.ofPattern(PATTERN_DATE, Locale.ROOT);
        SIMPLE_DATE_TIME_FORMAT_T = ThreadLocal.withInitial(() -> new SimpleDateFormat(PATTERN_DATE_TIME_T,
            Locale.ROOT));
        SIMPLE_DATE_TIME_FORMAT_MIL = ThreadLocal.withInitial(() -> new SimpleDateFormat(PATTERN_DATE_TIME_MIL,
            Locale.ROOT));
        SIMPLE_DATE_TIME_FORMAT = ThreadLocal.withInitial(() -> new SimpleDateFormat(PATTERN_DATE_TIME, Locale.ROOT));
        SIMPLE_DATE_FORMAT = ThreadLocal.withInitial(() -> new SimpleDateFormat(PATTERN_DATE, Locale.ROOT));
        SIMPLE_DATE_FORMAT_DDMMYY = ThreadLocal.withInitial(() -> new SimpleDateFormat(PATTERN_DDMMYY, Locale.ROOT));
        SIMPLE_DATE_FORMAT_WITH_SEPARATOR_DDMMYY =
            ThreadLocal.withInitial(() -> new SimpleDateFormat(PATTERN_WIT_SEPARATOR_DDMMYY, Locale.ROOT));
    }

    /**
     * Private constructor to prevent instantiation.
     */
    private DateUtil() {
        throw new UnsupportedOperationException();
    }

    /**
     * Converts a date string to a {@link Calendar} using the supplied {@link SimpleDateFormat}.
     *
     * @param strDateMail date string to parse
     * @param simpleDateFormat formatter to use
     * @param timeDefault when true, resets hour/minute/second/millisecond to zero
     * @return parsed {@link Calendar}
     * @throws ParseException when parsing fails
     */
    public static Calendar convertStringToCalendar(String strDateMail, SimpleDateFormat simpleDateFormat,
        boolean timeDefault) throws ParseException {
        Calendar dateCartola;

        dateCartola = Calendar.getInstance();
        if (null != strDateMail && !strDateMail.isEmpty()) {
            dateCartola.setTime(simpleDateFormat.parse(strDateMail));
        }
        if (timeDefault) {
            dateCartola.set(Calendar.HOUR_OF_DAY, 0);
            dateCartola.set(Calendar.MINUTE, 0);
            dateCartola.set(Calendar.SECOND, 0);
            dateCartola.set(Calendar.MILLISECOND, 0);
        }

        return dateCartola;
    }

    /**
     * Compares two LocalDate instances for equality.
     *
     * @param now current date
     * @param dateTime date to compare
     * @return {@code true} when both dates are equal
     */
    public static boolean validateDate(LocalDate now, LocalDate dateTime) {
        return now.isEqual(dateTime);
    }

    /**
     * Converts a {@link LocalDateTime} to a legacy {@link Date} instance.
     *
     * @param localDateTime local date-time to convert
     * @return corresponding {@link Date}
     */
    public static Date toDate(LocalDateTime localDateTime) {
        return Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
    }

}
