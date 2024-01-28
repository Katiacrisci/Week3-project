package models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Libro extends Pubblicazione {
    @Column
    private String autore;
    @Column
    private String genere;

    public Libro(Long codiceISBN, String title, Integer annoPubblicazione, Integer numeroPagine, String autore, String genere) {
        super(codiceISBN, title, annoPubblicazione, numeroPagine);
        this.autore = autore;
        this.genere = genere;
    }
}
