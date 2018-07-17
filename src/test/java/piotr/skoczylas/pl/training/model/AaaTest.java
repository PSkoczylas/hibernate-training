package piotr.skoczylas.pl.training.model;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import piotr.skoczylas.pl.training.repository.AaaRepository;
import piotr.skoczylas.pl.training.repository.BbbRepository;

import java.util.ArrayList;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=SpringBootTest.WebEnvironment.RANDOM_PORT)
public class AaaTest {
    @Autowired
    AaaRepository aaaRepository;

    @Autowired
    BbbRepository bbbRepository;

    @Test
    public void shouldReturnAssociatedRecordsB() {
        Aaa aaa = new Aaa();
        Bbb bbb1 = new Bbb();
        Bbb bbb2 = new Bbb();
        Bbb bbb3 = new Bbb();
        Aaa aaaSaved = aaaRepository.save(aaa);
        ArrayList bbbList = new ArrayList(asList(bbb1, bbb2, bbb3));
        aaaSaved.setBbb(bbbList);
        assertEquals(aaaSaved.getBbb().size(), 3);
        assertEquals(aaaSaved.getBbb().get(0), bbb1);
    }

}