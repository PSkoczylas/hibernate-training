package piotr.skoczylas.pl.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import piotr.skoczylas.pl.training.model.Aa;

import java.util.Optional;

@Repository
public interface AaRepository extends JpaRepository<Aa, Long> {
    Optional<Aa> findById(Long id);

}
