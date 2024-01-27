package models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;

@Getter
@Setter
@Entity
public class Rivista extends Pubblicazione {
    @Column
    private Periodicita periodicita;
}
