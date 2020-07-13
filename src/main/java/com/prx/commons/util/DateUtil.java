package com.prx.commons.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

/**
 * Clase utilitaria para gestion y formato de fechas
 *
 * @author Luis A. Mata <luis.antonio.mata@gmail.com>
 */
public class DateUtil implements Cloneable {

    /* Constructor privado para no permitir creacion de objeto por instancia */
    private DateUtil() {
    }

    private static final String STR_DDMMYY = "dd/MM/yyyy";
    private static final String PATTERN_DATE = "yyyy-MM-dd";
    private static final String PATTERN_DATE_TIME = "yyyy-MM-dd HH:mm:ss";
    private static final String PATTERN_DATE_TIME_T = "yyyy-MM-dd\'T\'HH:mm:ss";
    private static final String PATTERN_DATE_TIME_MIL = "yyyy-MM-dd HH:mm:ss.SSS";
    public static final SimpleDateFormat SIMPLE_DATE_FORMAT = new SimpleDateFormat(PATTERN_DATE);
    public static final SimpleDateFormat SIMPLE_DATE_FORMAT_DDMMYY = new SimpleDateFormat(STR_DDMMYY);
    public static final SimpleDateFormat SIMPLE_DATE_TIME_FORMAT = new SimpleDateFormat(PATTERN_DATE_TIME);
    public static DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern(PATTERN_DATE_TIME_MIL);
    public static final SimpleDateFormat SIMPLE_DATE_TIME_FORMAT_T = new SimpleDateFormat(PATTERN_DATE_TIME_T);
    public static final SimpleDateFormat SIMPLE_DATE_TIME_FORMAT_MIL = new SimpleDateFormat(PATTERN_DATE_TIME_MIL);

    /**
     * Convierte una fecha contenida en un String a un objeto Calendar
     *
     * @param strDateMail Fecha de corrreo
     * @param simpleDateFormat Formato de fecha
     * @param timeDefault Hora por defecto
     * @return Retorna un objeto de tipo Calendar
     * @throws ParseException Lanza una excepcion de tipo ParseException
     */
    public static Calendar convertStringToCalendar(String strDateMail, SimpleDateFormat simpleDateFormat, Boolean timeDefault) throws ParseException {
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

    public static boolean validateDate(LocalDate now, LocalDate dateTime) {
        return (now.isEqual(dateTime));
    }

    public static Date toDate(LocalDateTime localDateTime){
        return Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
    }

    /**
     * Sobre escritura de metodo clone para garantizar un solo objeto en ejecucion
     **/
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return this;
    }
}
