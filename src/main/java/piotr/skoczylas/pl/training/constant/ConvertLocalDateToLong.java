package piotr.skoczylas.pl.training.constant;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Converter(autoApply = true)
public class ConvertLocalDateToLong implements AttributeConverter<LocalDate, Long> {

    @Override
    public LocalDate convertToEntityAttribute(Long attribute) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
        return (attribute == null ? null : LocalDate.parse(attribute.toString(), formatter));

    }

    @Override
    public Long convertToDatabaseColumn (LocalDate dbData) {
        if (dbData == null) return null;
        long longDate = ((long) dbData.getYear()) * 10000 + dbData.getMonthValue() * 100 + dbData.getDayOfMonth();
        return new Long(longDate);
    }
}