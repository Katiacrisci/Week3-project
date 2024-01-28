package models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "prestiti")
@Getter
@Setter
public class Prestito {
    @Id
    @GeneratedValue
    private Long id;
    @JoinColumn
    @OneToOne
    private Pubblicazione elementoPrestato;
    @Column
    private LocalDateTime dataInizioPrestito;
    @Column
    private LocalDateTime dataRestituzionePrevista;
    @Column
    private LocalDateTime restituzioneEffettiva;
    @JoinColumn
    @OneToOne
    private User user;
}
