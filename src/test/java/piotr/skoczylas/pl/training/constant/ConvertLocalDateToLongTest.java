package piotr.skoczylas.pl.training.constant;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ConvertLocalDateToLongTest {
    ConvertLocalDateToLong convertLocalDateToSQLLong;
    @Before
    public void setUp() {
        convertLocalDateToSQLLong = new ConvertLocalDateToLong();
    }

    @Test
    public void convertLongToLocalDate() {
        assertEquals(convertLocalDateToSQLLong.convertToEntityAttribute(new Long(19951218)), LocalDate.of(1995, 12, 18));
        assertEquals(convertLocalDateToSQLLong.convertToEntityAttribute(null), null);
    }

    @Test
    public void convertLocalDateToLong() {
        Long num = new Long(19991123);
        ConvertLocalDateToLong convertLocalDateToLong = new ConvertLocalDateToLong();
        LocalDate localDate = LocalDate.parse("1999-11-23");
        assertEquals(convertLocalDateToLong.convertToDatabaseColumn(localDate), num);
        assertEquals(convertLocalDateToSQLLong.convertToDatabaseColumn(null), null);
    }
}
