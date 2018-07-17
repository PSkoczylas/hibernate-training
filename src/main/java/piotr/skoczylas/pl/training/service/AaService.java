package piotr.skoczylas.pl.training.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import piotr.skoczylas.pl.training.repository.AaRepository;

@Service
public class AaService {
    private final AaRepository aaRepository;

    @Autowired
    public AaService(AaRepository aaRepository) {
        this.aaRepository = aaRepository;
    }
}
