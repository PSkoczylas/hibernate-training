package piotr.skoczylas.pl.training.model;

import lombok.Getter;
import lombok.Setter;
import piotr.skoczylas.pl.training.constant.Color;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public abstract class Vehicle {
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Id
    private long id;

    String name;

    Color myColor;
}
