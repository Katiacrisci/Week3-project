package models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table
@Getter
@Setter
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@NoArgsConstructor
public abstract class Pubblicazione {
    @Id
    @GeneratedValue
    private Long codiceISBN;
    @Column
    private String title;
    @Column
    private Integer annoPubblicazione;
    @Column
    private Integer numeroPagine;

    public Pubblicazione(Long codiceISBN, String title, Integer annoPubblicazione, Integer numeroPagine) {
        this.codiceISBN = codiceISBN;
        this.title = title;
        this.annoPubblicazione = annoPubblicazione;
        this.numeroPagine = numeroPagine;
    }
}

