package piotr.skoczylas.pl.training.constant;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

@Converter
public class ConvertLocalDateToSQLLong implements AttributeConverter<Long, LocalDate> {


    @Override
    public LocalDate convertToDatabaseColumn(Long attribute) {
        Date date = new Date(attribute);
        Instant instant = date.toInstant();
        LocalDate localDate =  instant.atZone(ZoneId.systemDefault()).toLocalDate();
        return localDate;
    }

    @Override
    public Long convertToEntityAttribute(LocalDate dbData) {
        long longDate = ((long) dbData.getYear()) * 10000 + dbData.getMonthValue() * 100 + dbData.getDayOfMonth();
        return new Long(longDate);
    }
}