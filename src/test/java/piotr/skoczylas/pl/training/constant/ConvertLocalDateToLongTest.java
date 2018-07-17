package piotr.skoczylas.pl.training.constant;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ConvertLocalDateToSQLLongTest {
    @Test
    public void converLongToLocalDate() {
        ConvertLocalDateToLong convertLocalDateToSQLLong = new ConvertLocalDateToLong();
        assertEquals(convertLocalDateToSQLLong.convertToDatabaseColumn(new Long(19951218)), LocalDate.of(1995, 12, 18));
    }

    @Test
    // TODO
    public void convertLocalDateToLong() {
        Long num = new Long(19991123);
        ConvertLocalDateToLong convertLocalDateToLong = new ConvertLocalDateToLong();
        LocalDate localDate = LocalDate.parse("1999-11-23");
        assertEquals(convertLocalDateToLong.convertToEntityAttribute(localDate), num);
        //assertEquals(convertLocalDateToLong.convertToEntityAttribute(new LocalDate()));
    }
}
