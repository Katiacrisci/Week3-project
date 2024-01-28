package models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class Rivista extends Pubblicazione {
    @Column
    @Enumerated(EnumType.STRING)
    private Periodicita periodicita;

    public Rivista(Long codiceISBN, String title, Integer annoPubblicazione, Integer numeroPagine, Periodicita periodicita) {
        super(codiceISBN, title, annoPubblicazione, numeroPagine);
        this.periodicita = periodicita;
    }
}
