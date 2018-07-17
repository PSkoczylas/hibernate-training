package piotr.skoczylas.pl.training.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import piotr.skoczylas.pl.training.repository.AaaRepository;

@Service
public class AaaService {
    private final AaaRepository aaaRepository;

    @Autowired
    public AaaService(AaaRepository aaaRepository) { this.aaaRepository = aaaRepository; }

}
