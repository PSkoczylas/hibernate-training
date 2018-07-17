package piotr.skoczylas.pl.training.model;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import piotr.skoczylas.pl.training.model.Aa;
import piotr.skoczylas.pl.training.model.Bb;
import piotr.skoczylas.pl.training.repository.AaRepository;
import piotr.skoczylas.pl.training.repository.BbRepository;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=SpringBootTest.WebEnvironment.RANDOM_PORT)
public class BbTest {
    @Autowired
    AaRepository aaRepository;

    @Autowired
    BbRepository bbRepository;

    @Test
    public void shouldReturnAssociatedRecordA() {
        Aa aa = new Aa();
        Bb bb = new Bb();
        Bb bbSaved = bbRepository.save(bb);
        bbSaved.setAa(aa);
//        bbRepository.save(bb);
        //bb.setAa(aa);

        assertEquals(bbSaved.getAa(), aa);
        // assertEquals(bb.getAa(),
        // aa);
    }

}