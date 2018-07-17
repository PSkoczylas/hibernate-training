package piotr.skoczylas.pl.rentoffice.model;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class A {
    @Id
    private long id;

    //@OneToOne
    //private B b;

    //@OneToMany(mappedBy = "A")
    //private List<B> b = new ArrayList<>();

    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getId(int id) {
        return id;
    }

    public A() {}

    @Override
    public String toString() {
        return String.format(
                "A Entity, id: %d", id
        );

    }
}
