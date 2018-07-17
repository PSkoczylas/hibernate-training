package piotr.skoczylas.pl.training.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import piotr.skoczylas.pl.training.repository.BbbRepository;

@Service
public class BbbService {
    private final BbbRepository bbbRepository;

    @Autowired
    public BbbService(BbbRepository bbbRepository) { this.bbbRepository = bbbRepository; }

}
