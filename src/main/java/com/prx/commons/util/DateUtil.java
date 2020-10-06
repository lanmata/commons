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

    private static final String STR_DDMMYY = "dd/MM/yyyy";
    public static final SimpleDateFormat SIMPLE_DATE_FORMAT_DDMMYY = new SimpleDateFormat(STR_DDMMYY, Locale.ROOT);
    private static final String PATTERN_DATE = "yyyy-MM-dd";
    public static final SimpleDateFormat SIMPLE_DATE_FORMAT = new SimpleDateFormat(PATTERN_DATE, Locale.ROOT);
    public static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern(PATTERN_DATE, Locale.ROOT);
    private static final String PATTERN_DATE_TIME = "yyyy-MM-dd HH:mm:ss";
    public static final SimpleDateFormat SIMPLE_DATE_TIME_FORMAT = new SimpleDateFormat(PATTERN_DATE_TIME, Locale.ROOT);
    private static final String PATTERN_DATE_TIME_T = "yyyy-MM-dd'T'HH:mm:ss";
    public static final SimpleDateFormat SIMPLE_DATE_TIME_FORMAT_T = new SimpleDateFormat(PATTERN_DATE_TIME_T,
        Locale.ROOT);
    private static final String PATTERN_DATE_TIME_MIL = "yyyy-MM-dd HH:mm:ss.SSS";
    public static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern(PATTERN_DATE_TIME_MIL,
        Locale.ROOT);
    public static final SimpleDateFormat SIMPLE_DATE_TIME_FORMAT_MIL = new SimpleDateFormat(PATTERN_DATE_TIME_MIL,
        Locale.ROOT);

    /**
     * Constructor privado para no permitir creacion de objeto por instancia
     */
    private DateUtil() {
    }

    /**
     * Convierte una fecha contenida en un String a un objeto Calendar
     *
     * @param strDateMail Fecha de corrreo
     * @param simpleDateFormat Formato de fecha
     * @param timeDefault Hora por defecto
     * @return Retorna un objeto de tipo Calendar
     * @throws ParseException Lanza una excepcion de tipo ParseException
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
