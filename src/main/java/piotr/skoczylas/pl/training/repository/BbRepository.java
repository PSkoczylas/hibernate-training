package piotr.skoczylas.pl.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import piotr.skoczylas.pl.training.model.Bb;

import java.util.Optional;

@Repository
public interface BbRepository extends JpaRepository<Bb, Long> {
    Optional<Bb> findById(Long id);
}
