package piotr.skoczylas.pl.training.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Service;
import piotr.skoczylas.pl.training.repository.BRepository;

@Service
@Configurable
public class BService {
    private final BRepository bRepository;

    @Autowired
    public BService(BRepository bRepository) {
        this.bRepository = bRepository;
    }
}
