package models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Pubblicazione {
    @Id
    private Long codiceISBN;
    @Column
    private String title;
    @Column
    private Integer annoPubblicazione;
    @Column
    private Integer numeroPagine;
}
