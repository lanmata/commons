/*
 *  @(#)LocalDateTimeConverter.java
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
package com.prx.commons.converter;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Optional;

/**
 * LocalDateTimeConverter.
 *
 * @author <a href="mailto:luis.antonio.mata@gmail.com">Luis Antonio Mata.</a>
 * @version 1.0.3, 29-09-2020
 */
@Converter(autoApply = true)
public class LocalDateTimeConverter implements AttributeConverter<LocalDateTime, Timestamp> {

    /**
     * Default constructor.
     */
    public LocalDateTimeConverter() {
        //Default constructor
    }

    @Override
    public Timestamp convertToDatabaseColumn(LocalDateTime x) {
        return Optional.ofNullable(x).map(Timestamp::valueOf).orElse(null);
    }

    @Override
    public LocalDateTime convertToEntityAttribute(Timestamp y) {
        return Optional.ofNullable(y).map(Timestamp::toLocalDateTime).orElse(null);
    }

}
