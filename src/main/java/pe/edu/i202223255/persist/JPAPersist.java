package pe.edu.i202223255.persist;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.i202223255.entity.City;
import pe.edu.i202223255.entity.Country;
import pe.edu.i202223255.entity.CountryLanguage;
import pe.edu.i202223255.entity.CountryLanguagePK;



public class JPAPersist {

    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("worldPersistenceUnit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Country country = new Country();
        country.setCode("XY");
        country.setName("Landtopia");
        country.setContinent("Fantasy");
        country.setRegion("Fiction");
        country.setSurfaceArea(1500.0);
        country.setIndependenceYear(2024);
        country.setPopulation(1000000);
        country.setLifeExpectancy(80.0);
        country.setGnp(5000.0);
        country.setGnpOld(4500.0);
        country.setLocalName("Landtopia");
        country.setGovernmentForm("Republic");
        country.setHeadOfState("President X");
        country.setCapital(1);

        // Crear ciudades y asociarlas con el país
        City city1 = new City();
        city1.setName("CityOne");
        city1.setDistrict("District A");
        city1.setPopulation(300000);
        city1.setCountry(country);

        City city2 = new City();
        city2.setName("CityTwo");
        city2.setDistrict("distrito B");
        city2.setPopulation(250000);
        city2.setCountry(country);

        City city3 = new City();
        city3.setName("CityThree");
        city3.setDistrict("District C");
        city3.setPopulation(450000);
        city3.setCountry(country);

        // Crear los lenguajes nativos
        CountryLanguage countryLanguage1 = new CountryLanguage();
        CountryLanguagePK languagePK1 = new CountryLanguagePK();
        languagePK1.setCountryCode(country.getCode());
        languagePK1.setLanguage("Langtopia");
        countryLanguage1.setId(languagePK1);
        countryLanguage1.setCountry(country);
        countryLanguage1.setLanguage("Langtopia");
        countryLanguage1.setOfficial(true);
        countryLanguage1.setPercentage(80.0);

        CountryLanguage countryLanguage2 = new CountryLanguage();
        CountryLanguagePK languagePK2 = new CountryLanguagePK();
        languagePK2.setCountryCode(country.getCode());
        languagePK2.setLanguage("Fictish");
        countryLanguage2.setId(languagePK2);
        countryLanguage2.setCountry(country);
        countryLanguage2.setLanguage("Fictish");
        countryLanguage2.setOfficial(false);
        countryLanguage2.setPercentage(20.0);

        entityManager.getTransaction().begin();
        entityManager.persist(country);
        entityManager.persist(city1);
        entityManager.persist(city2);
        entityManager.persist(city3);
        entityManager.persist(countryLanguage1);
        entityManager.persist(countryLanguage2);
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
    }
}
