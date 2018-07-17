package piotr.skoczylas.pl.training.model;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class B {
    @GeneratedValue
    @Id
    private long id;

    public B() {}

    //@OneToOne(cascade = CascadeType.ALL)
    //@JoinColumn(id = "a_id")
    //public A getA() {
    //    return a;
    //}

    @Override
    public String toString() {
        return String.format(
                "B Entity, id: %d", id
        );

    }
}
