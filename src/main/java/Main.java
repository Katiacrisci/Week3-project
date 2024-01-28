import dao.PubblicazioneDao;
import models.Libro;
import models.Periodicita;
import models.Rivista;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("catalogo_bibliografico");

    public static void main(String[] args) {
        EntityManager entityManager = emf.createEntityManager();

        PubblicazioneDao pubblicazioneDao = new PubblicazioneDao(entityManager);

        creaLibriRiviste(pubblicazioneDao);

        System.out.println(pubblicazioneDao.getByAutore("De Amicis"));

        pubblicazioneDao.delete(1L);
        System.out.println(pubblicazioneDao.getByAutore("De Amicis"));




    }

    private static void creaLibriRiviste(PubblicazioneDao pubblicazioneDao) {
        pubblicazioneDao.save(new Libro(1L, "Cuore", 1997, 200, "De Amicis", "storico"));
        pubblicazioneDao.save(new Libro(2L, "Twilight", 2010, 300, "Meyer", "Drammatico"));
        pubblicazioneDao.save(new Libro(3L, "The picture of Dorian Gray", 1838, 300, "Oscar Wilde", "Thriller"));
        pubblicazioneDao.save(new Libro(4L, "1984", 1948, 300, "Orwell", "Drammatico"));
        pubblicazioneDao.save(new Rivista(6L, "Vogue", 2023, 30, Periodicita.SETTIMANALE));
        pubblicazioneDao.save(new Rivista(7L, "Vanity fair", 2023, 40, Periodicita.SETTIMANALE));
        pubblicazioneDao.save(new Rivista(8L, "Chi", 2023, 30, Periodicita.MENSILE));
        pubblicazioneDao.save(new Rivista(9L, "Tv, sorrisi e canzoni", 2024, 50, Periodicita.MENSILE));
    }


}
