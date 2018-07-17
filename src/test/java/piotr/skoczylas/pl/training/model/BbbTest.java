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
public class BbbTest {
    @Autowired
    AaaRepository aaaRepository;

    @Autowired
    BbbRepository bbbRepository;

    @Test
    public void shouldReturnAssociatedRecordA() {
        Aaa aaa = new Aaa();
        Bbb bbb = new Bbb();
        Bbb bbbSaved = bbbRepository.save(bbb);
        bbbSaved.setAaa(aaa);
        assertEquals(bbbSaved.getAaa(), aaa);
    }

}