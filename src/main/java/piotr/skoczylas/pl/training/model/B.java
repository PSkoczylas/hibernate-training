package piotr.skoczylas.pl.rentoffice.model;
import javax.persistence.*;

@Entity
public class B {
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
