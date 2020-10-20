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
 * Clase utilitaria para gestion y formato de fechas
 *
 * @author &lt;a href='mailto:luis.antonio.mata@gmail.com'&gt;Luis Antonio Mata&lt;/a&gt;
 * @version 1.0.3, 29-09-2020
 */
public final class DateUtil {

    public static final ThreadLocal<SimpleDateFormat> SIMPLE_DATE_TIME_FORMAT_T;
    public static final ThreadLocal<SimpleDateFormat> SIMPLE_DATE_FORMAT_DDMMYY;
    public static final ThreadLocal<SimpleDateFormat> SIMPLE_DATE_TIME_FORMAT;
    public static final ThreadLocal<SimpleDateFormat> SIMPLE_DATE_FORMAT;
    public static final ThreadLocal<SimpleDateFormat> SIMPLE_DATE_TIME_FORMAT_MIL;
    public static final DateTimeFormatter DATE_TIME_FORMATTER;
    public static final DateTimeFormatter DATE_FORMATTER;
    private static final String PATTERN_DATE_TIME_MIL = "yyyy-MM-dd HH:mm:ss.SSS";
    private static final String PATTERN_DATE_TIME_T = "yyyy-MM-dd'T'HH:mm:ss";
    private static final String PATTERN_DATE_TIME = "yyyy-MM-dd HH:mm:ss";
    private static final String PATTERN_DATE = "yyyy-MM-dd";
    private static final String STR_DDMMYY = "dd/MM/yyyy";
    static {
        DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern(PATTERN_DATE_TIME_MIL, Locale.ROOT);
        DATE_FORMATTER = DateTimeFormatter.ofPattern(PATTERN_DATE, Locale.ROOT);
        SIMPLE_DATE_TIME_FORMAT_T = ThreadLocal.withInitial(() -> new SimpleDateFormat(PATTERN_DATE_TIME_T,
            Locale.ROOT));
        SIMPLE_DATE_TIME_FORMAT_MIL =ThreadLocal.withInitial(() -> new SimpleDateFormat(PATTERN_DATE_TIME_MIL,
            Locale.ROOT));
        SIMPLE_DATE_TIME_FORMAT = ThreadLocal.withInitial(() -> new SimpleDateFormat(PATTERN_DATE_TIME, Locale.ROOT));
        SIMPLE_DATE_FORMAT = ThreadLocal.withInitial(() -> new SimpleDateFormat(PATTERN_DATE, Locale.ROOT));
        SIMPLE_DATE_FORMAT_DDMMYY = ThreadLocal.withInitial(() -> new SimpleDateFormat(STR_DDMMYY, Locale.ROOT));
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
     * @throws ParseException Lanza una excepcion de tipo {@link ParseException}
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
