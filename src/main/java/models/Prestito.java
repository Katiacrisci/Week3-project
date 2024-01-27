package models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Prestito {
    @Id
    private Long id;
    @Column
    private Pubblicazione elementoPrestato;
    @Column
    private LocalDateTime dataInizioPrestito;
    @Column
    private LocalDateTime dataRestituzionePrevista;
    @Column
    private LocalDateTime restituzioneEffettiva;
    @Column
    private User user;
}
