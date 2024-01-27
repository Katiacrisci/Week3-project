package models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Getter
@Setter
public class Libri extends Pubblicazione{
    @Column
    private String autore;
    @Column
    private String genere;
}
