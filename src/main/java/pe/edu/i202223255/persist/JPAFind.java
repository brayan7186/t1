package pe.edu.i202223255.persist;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.i202223255.entity.City;
import pe.edu.i202223255.entity.Country;

import java.util.List;

public class JPAFind {

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("worldPersistenceUnit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Country country = entityManager.find(Country.class, "PER");

        if (country != null) {
            List<City> cities = country.getCities();
            cities.stream()
                    .filter(city -> city.getPopulation() > 700000)
                    .map(City::getName)
                    .forEach(System.out::println);
        } else {
            System.out.println("El país con el código 'PER' no fue encontrado.");
        }

        entityManager.close();
        entityManagerFactory.close();
    }
}
