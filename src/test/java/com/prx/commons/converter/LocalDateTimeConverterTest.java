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

import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

/**
 * LocalDateTimeConverterTest.
 *
 * @author Luis Antonio Mata
 * @version 1.0.0, 20-10-2020
 */
@RunWith(MockitoJUnitRunner.class)
class LocalDateTimeConverterTest {
    @InjectMocks
    LocalDateTimeConverter localDateTimeConverter;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void convert(){
        assertNotNull(localDateTimeConverter.convertToDatabaseColumn(
            LocalDateTime.now(ZoneId.systemDefault())));
        assertNotNull(localDateTimeConverter.convertToEntityAttribute(
            Timestamp.from(Instant.ofEpochMilli(System.currentTimeMillis()))));
    }

}