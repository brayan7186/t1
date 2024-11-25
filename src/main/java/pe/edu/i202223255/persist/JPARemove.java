package pe.edu.i202223255.persist;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import pe.edu.i202223255.entity.Country;


public class JPARemove {

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("worldPersistenceUnit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Country country = entityManager.find(Country.class, "XY");

        if (country != null) {
            entityManager.getTransaction().begin();
            entityManager.remove(country);
            entityManager.getTransaction().commit();
        } else {
            System.out.println("no fue encontrado  el pais.");
        }

        entityManager.close();
        entityManagerFactory.close();
    }
}
