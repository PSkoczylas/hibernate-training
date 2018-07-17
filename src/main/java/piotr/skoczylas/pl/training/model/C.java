package piotr.skoczylas.pl.training.model;

import lombok.Getter;
import lombok.Setter;
import piotr.skoczylas.pl.training.constant.Color;
import piotr.skoczylas.pl.training.constant.ConvertLocalDateToLong;
import piotr.skoczylas.pl.training.constant.ConvertLocalDateToSQLDate;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
public class C {

//    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long id;

    // Enumerated nie wiem czy trzeba w moim wypadku
    @Column(nullable = false)
    @Enumerated
    private Color color;

    @Column(nullable =  false)
    Long number;

    @Column(nullable = false)
    @Convert(converter = ConvertLocalDateToSQLDate.class)
    LocalDate myDate;

    // tu na dole jest gdzies blad
    @Column(nullable = false)
    @Convert(converter = ConvertLocalDateToLong.class)
    LocalDate myDate2;

    @Column(nullable = false)
    String name;

    public C() {
    }

    public C(Color color, Long number, LocalDate myDate, LocalDate myDate2, String name) {
        this.color = color;
        this.number = number;
        this.myDate = myDate;
        this.myDate2 = myDate2;
        this.name = name;
    }
}
