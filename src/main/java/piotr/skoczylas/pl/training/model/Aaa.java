package piotr.skoczylas.pl.training.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Aaa {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long id;

    @OneToMany(mappedBy = "aaa")
    private List<Bbb> bbb = new ArrayList<>();
}
