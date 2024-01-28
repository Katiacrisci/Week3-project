package dao;

import models.Pubblicazione;

import javax.persistence.EntityManager;

public class PubblicazioneDao {
    private EntityManager entityManager;


    public PubblicazioneDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void save(Pubblicazione pubblicazione) {
        entityManager.getTransaction().begin();
        entityManager.merge(pubblicazione);
        entityManager.getTransaction().commit();
    }

    public Pubblicazione getByCodiceISBN(Long codiceISBN) {
       return entityManager.find(Pubblicazione.class, codiceISBN);

    }
    public void delete(Long codiceISBN) {
        entityManager.getTransaction().begin();
        entityManager.remove(getByCodiceISBN(codiceISBN));
        entityManager.getTransaction().commit();
    }
}
