package dao;

import models.User;

import javax.persistence.EntityManager;

public class UserDao {
    private EntityManager entityManager;

    public UserDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void save(User user ) {
        entityManager.getTransaction().begin();
        entityManager.persist(user);
        entityManager.getTransaction().commit();

    }
}
