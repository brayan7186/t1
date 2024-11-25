package pe.edu.i202223255.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "countrylanguage")
public class CountryLanguage {

    @EmbeddedId
    private CountryLanguagePK id;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("countryCode")
    @JoinColumn(name = "CountryCode", referencedColumnName = "Code")
    private Country country;

    @Column(name = "Language")
    private String language;

    @Column(name = "IsOfficial")
    private boolean isOfficial;

    @Column(name = "Percentage")
    private double percentage;

    // Getters y Setters
    public CountryLanguagePK getId() {
        return id;
    }

    public void setId(CountryLanguagePK id) {
        this.id = id;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public boolean isOfficial() {
        return isOfficial;
    }

    public void setOfficial(boolean isOfficial) {
        this.isOfficial = isOfficial;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }
}
