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

public class User {
    @Id
    private Long numeroTessera;
    @Column
    private String nome;
    @Column
    private String cognome;
    @Column
    private LocalDateTime dataNascita;

}
