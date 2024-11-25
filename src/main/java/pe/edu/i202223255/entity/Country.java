package pe.edu.i202223255.entity;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "country")
public class Country {

    @Id
    @Column(name = "Code")
    private String code;

    @Column(name = "Name")
    private String name;

    @Column(name = "Continent")
    private String continent;

    @Column(name = "Region")
    private String region;

    @Column(name = "SurfaceArea")
    private double surfaceArea;

    @Column(name = "IndepYear")
    private Integer independenceYear;


    @Column(name = "Population")
    private int population;

    @Column(name = "LifeExpectancy")
    private double lifeExpectancy;

    @Column(name = "GNP")
    private double gnp;

    @Column(name = "GNPOld")
    private double gnpOld;

    @Column(name = "LocalName")
    private String localName;

    @Column(name = "GovernmentForm")
    private String governmentForm;

    @Column(name = "HeadOfState")
    private String headOfState;

    @Column(name = "Capital")
    private Integer capital;
    @OneToMany(mappedBy = "country", fetch = FetchType.LAZY)  // Relación bidireccional con City
    private List<City> cities;
    // Getters y Setters
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getContinent() {
        return continent;
    }
    public void setContinent(String continent) {
        this.continent = continent;
    }
    public String getRegion() {
        return region;
    }
    public void setRegion(String region) {
        this.region = region;
    }
    public double getSurfaceArea() {
        return surfaceArea;
    }
    public void setSurfaceArea(double surfaceArea) {
        this.surfaceArea = surfaceArea;
    }
    public Integer getIndependenceYear() {
        return independenceYear;
    }
    public void setIndependenceYear(Integer independenceYear) {
        this.independenceYear = independenceYear;
    }
    public int getPopulation() {
        return population;
    }
    public void setPopulation(int population) {
        this.population = population;
    }
    public double getLifeExpectancy() {
        return lifeExpectancy;
    }
    public void setLifeExpectancy(double lifeExpectancy) {
        this.lifeExpectancy = lifeExpectancy;
    }
    public double getGnp() {
        return gnp;
    }
    public void setGnp(double gnp) {
        this.gnp = gnp;
    }
    public double getGnpOld() {
        return gnpOld;
    }
    public void setGnpOld(double gnpOld) {
        this.gnpOld = gnpOld;
    }
    public String getLocalName() {
        return localName;
    }
    public void setLocalName(String localName) {
        this.localName = localName;
    }
    public String getGovernmentForm() {
        return governmentForm;
    }

    public void setGovernmentForm(String governmentForm) {
        this.governmentForm = governmentForm;
    }

    public String getHeadOfState() {
        return headOfState;
    }

    public void setHeadOfState(String headOfState) {
        this.headOfState = headOfState;
    }

    public Integer getCapital() {
        return capital;
    }

    public void setCapital(Integer capital) {
        this.capital = capital;
    }

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }
}