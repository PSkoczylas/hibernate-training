package piotr.skoczylas.pl.training.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter

public class Aa {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long id;

    @OneToOne
//    @PrimaryKeyJoinColumn
    private Bb bb;
}
