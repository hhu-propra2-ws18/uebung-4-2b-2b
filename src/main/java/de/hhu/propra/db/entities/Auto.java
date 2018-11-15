package de.hhu.propra.db.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Auto{
    @Id
    @GeneratedValue
    private long id;

    String marke;
    String farbe;
    Integer hubraum;
}
