package piotr.skoczylas.pl.training.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import piotr.skoczylas.pl.training.repository.BbRepository;

@Service
public class BbService {
    private final BbRepository bbRepository;

    @Autowired
    public BbService(BbRepository aaRepository) {
        this.bbRepository = aaRepository;
    }
}
