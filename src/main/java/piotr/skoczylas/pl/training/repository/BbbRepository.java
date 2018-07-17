package piotr.skoczylas.pl.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import piotr.skoczylas.pl.training.model.Bbb;

@Repository
public interface BbbRepository extends JpaRepository<Bbb, Long> {
}
