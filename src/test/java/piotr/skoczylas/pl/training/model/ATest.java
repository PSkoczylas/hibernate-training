package piotr.skoczylas.pl.rentoffice.model;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import piotr.skoczylas.pl.rentoffice.repository.ARepository;
//import piotr.skoczylas.pl.rentoffice.repository.BRepository;

import static org.junit.Assert.assertEquals;

public class ATest {
    //@Autowired
    //private ARepository aRepository;

    //@Autowired
    //private BRepository bRepository;

    @Test
    public void shouldReturnAssociatedRecordB() {
        A a = new A();
        B b = new B();
        //a.setB(b);
        //assertEquals(a.getB(), b);
    }
}