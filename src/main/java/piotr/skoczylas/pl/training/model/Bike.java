package piotr.skoczylas.pl.training.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Getter
@Setter
public class Bike extends Vehicle {
    @Column(unique = true)
    Long number;
}
