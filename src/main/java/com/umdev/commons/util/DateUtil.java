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

package com.umdev.commons.util;

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
 * Clase utilitaria para gesti&oacute;n y formato de fechas
 *
 * @author <a href='mailto:luis.antonio.mata@gmail.com'>Luis Antonio Mata.</a>
 * @version 1.0.3, 29-09-2020
 */
public final class DateUtil {

    /**
     * Formato de fecha yyyy/MM/dd, Por ejemplo: 2000/01/30
     */
    public static final ThreadLocal<SimpleDateFormat> SIMPLE_DATE_FORMAT_WITH_SEPARATOR_DDMMYY;
    /**
     * Formato de fecha yyyy-MM-dd HH:mm:ss.SSS, Por ejemplo: 2000-01-30 12:30:25.369
     */
    public static final ThreadLocal<SimpleDateFormat> SIMPLE_DATE_TIME_FORMAT_MIL;
    /**
     * Patr&oacute;n para fecha yyyy-MM-ddTHH:mm:ss, Por ejemplo: 2000-01-30T12:30:25
     */
    public static final ThreadLocal<SimpleDateFormat> SIMPLE_DATE_TIME_FORMAT_T;
    /**
     * Patr&oacute;n para fecha yyyyMMdd, Por ejemplo: 20000130
     */
    public static final ThreadLocal<SimpleDateFormat> SIMPLE_DATE_FORMAT_DDMMYY;
    /**
     * Patr&oacute;n para fecha yyyyMMdd, Por ejemplo: 20000130
     */
    public static final ThreadLocal<SimpleDateFormat> SIMPLE_DATE_TIME_FORMAT;
    /**
     * Patr&oacute;n para fecha yyyy-MM-dd, Por ejemplo: 2000-01-30
     */
    public static final ThreadLocal<SimpleDateFormat> SIMPLE_DATE_FORMAT;
    /**
     * Patr&oacute;n para fecha yyyy-MM-dd HH:mm:ss.SSS, Por ejemplo: 2000-01-30 12:30:25.369
     */
    public static final DateTimeFormatter DATE_TIME_FORMATTER;
    /**
     * Patr&oacute;n para fecha yyyy-MM-dd, Por ejemplo: 2000-01-30
     */
    public static final DateTimeFormatter DATE_FORMATTER;
    /**
     * Patr&oacute;n para fecha yyyy-MM-dd HH:mm:ss.SSS, Por ejemplo: 2000-01-30 12:30:25.369
     */
    public static final String PATTERN_DATE_TIME_MIL = "yyyy-MM-dd HH:mm:ss.SSS";
    /**
     * Patr&oacute;n para fecha yyyy-MM-dd HH:mm:ss.S, Por ejemplo: 2024-01-23 10:25:33.000000
     */
    public static final String PATTERN_DATE_TIME_SHORTLY_MILLISECONDS = "yyyy-MM-dd HH:mm:ss.S";
    /**
     * Patr&oacute;n para fecha yyyy-MM-ddTHH:mm:ss, Por ejemplo: 2000-01-30T12:30:25
     */
    public static final String PATTERN_DATE_TIME_T = "yyyy-MM-dd'T'HH:mm:ss";
    /**
     * Patr&oacute;n para fecha yyyyMMddHHmmss, Por ejemplo: 20200130123025
     */
    public static final String PATTERN_DATETIME_YYYYMMDDHHMMSS = "yyyyMMddHHmmss";
    /**
     * Patr&oacute;n para fecha yyyy-MM-dd HH:mm:ss, Por ejemplo: 2000-01-30 12:30:25
     */
    public static final String PATTERN_DATE_TIME = "yyyy-MM-dd HH:mm:ss";
    /**
     * Patr&oacute;n para fecha yyMMddHHmmss, Por ejemplo: 200130123025
     */
    public static final String PATTERN_DATETIME_YYMMDDHHMMSS = "yyMMddHHmmss";
    /**
     * Patr&oacute;n para fecha yyyy-MM-dd, Por ejemplo: 2000-01-30
     */
    public static final String PATTERN_DATE = "yyyy-MM-dd";
    /**
     * Patr&oacute;n para fecha yyyyMMdd, Por ejemplo: 20000130
     */
    public static final String PATTERN_DDMMYY = "ddMMyyyy";
    /**
     * Patr&oacute;n para fecha yyyy/MM/dd, Por ejemplo: 2000/01/30
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
     * Constructor privado para no permitir creacion de objeto por instancia
     */
    private DateUtil() {
        throw new UnsupportedOperationException();
    }

    /**
     * Convierte una fecha contenida en un {@link String} a un objeto {@link Calendar}
     *
     * @param strDateMail Fecha de corrreo, objeto de tipo {@link String}
     * @param simpleDateFormat Formato de fecha, objeto de tipo {@link SimpleDateFormat}
     * @param timeDefault Hora por defecto, objeto de tipo {@link boolean}
     * @return Retorna un objeto de tipo {@link Calendar}
     * @throws ParseException Lanza una excepci&oacute;n de tipo {@link ParseException}
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
     * Compara dos fechas, retorna true en caso de ser igual  o false en caso de ser distintas.
     *
     * @param now Objeto de tipo {@link LocalDateTime}
     * @param dateTime Objeto de tipo {@link LocalDateTime}
     * @return Objeto de tipo {@code boolean}
     */
    public static boolean validateDate(LocalDate now, LocalDate dateTime) {
        return now.isEqual(dateTime);
    }

    /**
     * Transforma un objeto de tipo {@link LocalDateTime} a tipo {@link Date}
     *
     * @param localDateTime Objeto de tipo {@link LocalDateTime}
     * @return Objeto de tipo {@link Date}
     */
    public static Date toDate(LocalDateTime localDateTime) {
        return Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
    }

}
