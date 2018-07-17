package piotr.skoczylas.pl.training.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import piotr.skoczylas.pl.training.model.C;
import piotr.skoczylas.pl.training.repository.CRepository;

import java.util.List;

@Service
@Transactional
public class CService {
    private final CRepository cRepository;

    @Autowired
    public CService(CRepository cRepository) {
        this.cRepository = cRepository;
    }

    private List<C> findByName(String name) {
        return cRepository.findByName(name);
    }
}
