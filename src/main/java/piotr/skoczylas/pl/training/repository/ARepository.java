package piotr.skoczylas.pl.rentoffice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import piotr.skoczylas.pl.rentoffice.model.A;

import java.util.Optional;

@Repository
public interface ARepository extends JpaRepository<A, Long> {
    Optional<A> findById(Long id);

}
