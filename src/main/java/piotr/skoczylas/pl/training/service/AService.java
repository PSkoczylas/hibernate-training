package piotr.skoczylas.pl.training.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import piotr.skoczylas.pl.training.repository.ARepository;

@Service
public class AService {
    private final ARepository aRepository;

    @Autowired
    public AService(ARepository aRepository) {
        this.aRepository = aRepository;
    }

    public String contextLoads(Long id) {
        if (aRepository.existsById(id)) {
            return "good";
        } else
            return "bad";
        //assertNotNull(aRepository);
    }

   // public B associationID(Long id) {
    //    return aRepository.findById(id).get().getB();
    //}
}
