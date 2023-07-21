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

package com.prx.commons.converter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

/**
 * LocalDateTimeConverterTest.
 *
 * @author Luis Antonio Mata
 * @version 1.0.0, 20-10-2020
 */
class LocalDateTimeConverterTest {
    @InjectMocks
    LocalDateTimeConverter localDateTimeConverter;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    /**
     * Method under test: default or parameterless constructor of {@link LocalDateTimeConverter}
     */
    @Test
    void testConstructor() {
        // TODO: Complete this test.
        //   Reason: R002 Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   There are no fields that could be asserted on.

        new LocalDateTimeConverter();
    }

    /**
     * Method under test: {@link LocalDateTimeConverter#convertToDatabaseColumn(LocalDateTime)}
     */
    @Test
    void testConvertToDatabaseColumn() {
        LocalDateTimeConverter localDateTimeConverter = new LocalDateTimeConverter();
        localDateTimeConverter.convertToDatabaseColumn(LocalDate.of(1970, 1, 1).atStartOfDay());
        assertNull(localDateTimeConverter.convertToEntityAttribute(null));
    }

    /**
     * Method under test: {@link LocalDateTimeConverter#convertToEntityAttribute(Timestamp)}
     */
    @Test
    void testConvertToEntityAttribute() {
        LocalDateTimeConverter localDateTimeConverter = new LocalDateTimeConverter();
        Timestamp y = mock(Timestamp.class);
        LocalDate ofResult = LocalDate.of(1970, 1, 1);
        when(y.toLocalDateTime()).thenReturn(ofResult.atStartOfDay());
        LocalDateTime actualConvertToEntityAttributeResult = localDateTimeConverter.convertToEntityAttribute(y);
        LocalDate toLocalDateResult = actualConvertToEntityAttributeResult.toLocalDate();
        assertSame(ofResult, toLocalDateResult);
        assertEquals("1970-01-01", toLocalDateResult.toString());
        assertEquals("00:00", actualConvertToEntityAttributeResult.toLocalTime().toString());
        verify(y).toLocalDateTime();
    }

    @Test
    void convert() {
        Assertions.assertNotNull(localDateTimeConverter.convertToDatabaseColumn(
                LocalDateTime.now(ZoneId.systemDefault())));
        Assertions.assertNotNull(localDateTimeConverter.convertToEntityAttribute(
                Timestamp.from(Instant.ofEpochMilli(System.currentTimeMillis()))));
    }

}
