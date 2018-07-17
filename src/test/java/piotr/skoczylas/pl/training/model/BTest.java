package piotr.skoczylas.pl.training.model;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import piotr.skoczylas.pl.training.repository.BRepository;

import java.util.Optional;
import java.util.logging.Logger;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=SpringBootTest.WebEnvironment.RANDOM_PORT)
public class BTest {

    @Autowired
    private BRepository bRepository;

    private final static Logger LOG = Logger.getLogger(BTest.class.getName());

    @Test
    public void shouldCreateTwoObjects() {
        B b1 = new B();
        bRepository.save(b1);
        int s1 = bRepository.findAll().size();
        B b2 = new B();
        bRepository.save(b2);
        assertEquals(bRepository.findAll().size() - s1, 1);
        Optional<B> repo = bRepository.findById(b1.getId());
    }
}
