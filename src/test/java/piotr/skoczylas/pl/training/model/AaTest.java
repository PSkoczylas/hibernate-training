package piotr.skoczylas.pl.training.model;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.Test;
import piotr.skoczylas.pl.training.repository.AaRepository;
import piotr.skoczylas.pl.training.repository.BbRepository;

import static org.junit.Assert.assertEquals;

//@ContextConfiguration
//@ActiveProfiles("dev")
//@TestExecutionListeners({Aa.class, AaRepository.class})
//@TestComponent
//@TestConfiguration
//@ComponentScan(basePackages = "piotr.skoczylas.pl.training.model")

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=SpringBootTest.WebEnvironment.RANDOM_PORT)
public class AaTest {
    @Autowired
    AaRepository aaRepository;

    @Autowired
    BbRepository bbRepository;

    @Test
    public void shouldReturnAssociatedRecordB() {
        Aa aa = new Aa();
        Bb bb = new Bb();
        Aa aaSaved = aaRepository.save(aa);
        aaSaved.setBb(bb);
//        bbRepository.save(bb);
        //bb.setAa(aa);

        assertEquals(aaSaved.getBb(), bb);
       // assertEquals(bb.getAa(), aa);
    }

}
