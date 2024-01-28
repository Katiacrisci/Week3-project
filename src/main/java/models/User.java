package models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor

public class User {
    @Id
    @GeneratedValue
    private Long numeroTessera;
    @Column
    private String nome;
    @Column
    private String cognome;
    @Column
    private LocalDateTime dataNascita;

    public User(Long numeroTessera, String nome, String cognome, LocalDateTime dataNascita) {
        this.numeroTessera = numeroTessera;
        this.nome = nome;
        this.cognome = cognome;
        this.dataNascita = dataNascita;
    }
}
