package piotr.skoczylas.pl.rentoffice.service;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import piotr.skoczylas.pl.rentoffice.repository.ARepository;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

public class AServiceTest {

    AService aService;

    @Mock
    private ARepository aRepository;

    @Before
    public void setup() {
        initMocks(this);
        aService = new AService(aRepository);
    }


    @Test
    public void shouldReturnGoodIfRecordExists() {
        //given
        Long id = 1L;
        String expectedTest = "good";

        //and
        when(aRepository.existsById(id)).thenReturn(true);

        //when
        String text = aService.contextLoads(id);

        //then
        assertEquals(expectedTest, text);
    }

    @Test
    public void shouldReturnBadIfRecordNotExists() {
        //given
        Long id = 1L;
        String expectedTest = "bad";

        //and
        when(aRepository.existsById(id)).thenReturn(false);

        //when
        String text = aService.contextLoads(id);

        //then
        assertEquals(expectedTest, text);
    }


}
