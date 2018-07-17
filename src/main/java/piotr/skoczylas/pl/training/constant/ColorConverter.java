package piotr.skoczylas.pl.training.constant;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class ColorConverter implements AttributeConverter<Color, String> {

    @Override
    public String convertToDatabaseColumn(Color color) {
        return color.getShortName();
    }

    @Override
    public Color convertToEntityAttribute(String dbData) {
        return Color.fromShortName(dbData);
    }
}
