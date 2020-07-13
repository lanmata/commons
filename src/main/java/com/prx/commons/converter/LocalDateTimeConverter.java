package com.prx.commons.converter;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Optional;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

/**
 *
 * @author Luis Antonio Mata <luis.antonio.mata@gmail.com>
 */
@Converter(autoApply = true)
public class LocalDateTimeConverter implements AttributeConverter<LocalDateTime, Timestamp> {

    @Override
    public Timestamp convertToDatabaseColumn(LocalDateTime x) {
        return Optional.ofNullable(x).map(Timestamp::valueOf).orElse(null);
    }

    @Override
    public LocalDateTime convertToEntityAttribute(Timestamp y) {
        return Optional.ofNullable(y).map(Timestamp::toLocalDateTime).orElse(null);
    }

}
