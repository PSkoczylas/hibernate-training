package piotr.skoczylas.pl.training.model;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import piotr.skoczylas.pl.training.repository.ARepository;
import piotr.skoczylas.pl.training.repository.BRepository;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ATest {
    @Autowired
    private ARepository aRepository;

    @Autowired
    private BRepository bRepository;

    @Test
    public void shouldReturnAssociatedRecordB() {
        A a = new A();
        B b = new B();
        a.setB(b);
        assertEquals(a.getB(), b);
    }
}