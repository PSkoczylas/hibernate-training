package piotr.skoczylas.pl.training.model;

import org.apache.tomcat.jni.Local;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.engine.spi.SessionFactoryDelegatingImpl;
import org.hibernate.engine.spi.SessionFactoryImplementor;
import org.hibernate.internal.SessionFactoryImpl;
import org.hibernate.internal.SessionImpl;
import org.hibernate.loader.custom.sql.SQLQueryParser;
import org.hibernate.sql.ordering.antlr.Factory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.postgresql.core.NativeQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import piotr.skoczylas.pl.training.constant.Color;
import piotr.skoczylas.pl.training.repository.CRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.math.BigInteger;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CTest {
    @Autowired
    CRepository cRepository;

    @PersistenceContext
    EntityManager entityManager;

    C c1, c2, c3;
    @Before
    public void setUpASDFobjects() {
        cRepository.deleteAll();
        c1 = new C(Color.RED, 5L, LocalDate.now(), LocalDate.now(), "ASDF");
        c2 = new C(Color.BLUE, 11L, LocalDate.of(2012, 12, 12), LocalDate.of(2011, 11, 23), "ASDF");
        c3 = new C(Color.BLUE, 11L, LocalDate.of(1999, 10, 22), LocalDate.now(), "ASDF2");
        cRepository.save(c1);
        cRepository.save(c2);
        cRepository.save(c3);
    }

    @Test
    public void compareMyDateWithMyDate2() {
        C c = new C(Color.RED, 5L, LocalDate.now(), LocalDate.now(), "Zdzich");
        C cSaved = cRepository.save(c);
        Assert.assertEquals(cSaved.getMyDate(), cSaved.getMyDate2());
    }

    @Test
    public void compareObjectsByRepository() {
        Assert.assertEquals(3, cRepository.findAll().size());
    }

    final String QUERY_COUNT_ROWS = "SELECT  COUNT(*) FROM C";

    @Test
    public void compareObjectsByNativeQueryEntityManager() {
        Assert.assertEquals(entityManager.createNativeQuery(QUERY_COUNT_ROWS).getSingleResult(),new BigInteger(String.valueOf(3)));
    }

    @Test
    public void compareObjectsByNativeQueryRepository() {
        Assert.assertEquals(3, cRepository.countRows() );
    }

    @Test
    public void createNativeQueryToCountASDF() {
        Assert.assertEquals(2, cRepository.countASDF());
    }

    @Test
    public void createNativeQueryToGetASDF() {
        Assert.assertEquals(2, cRepository.getRecordsWithASDF().size());
    }

    @Test
    public void findASDFByName() {
        Assert.assertEquals(2, cRepository.findByName("ASDF").size());
    }


}

