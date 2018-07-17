package piotr.skoczylas.pl.training.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import piotr.skoczylas.pl.training.model.C;

import java.util.Collection;
import java.util.List;

@Repository
public interface CRepository extends JpaRepository<C, Long> {
    @Query(value = "SELECT  COUNT(*) FROM C", nativeQuery = true)
    int countRows();

    @Query(value = "SELECT COUNT(*) FROM C WHERE C.name = 'ASDF'", nativeQuery = true)
    int countASDF();

    @Query(value = "SELECT * FROM C WHERE C.name = 'ASDF'", nativeQuery = true)
    List<C> getRecordsWithASDF();

    List<C> findByName(String name);
}
