package pe.edu.i202223255.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class CountryLanguagePK implements Serializable {

    @Column(name = "CountryCode")
    private String countryCode;
    @Column(name = "Language")
    private String language;
    // Getters, setters, equals y hashCode
    public String getCountryCode() {
        return countryCode;
    }
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
    public String getLanguage() {
        return language;
    }
    public void setLanguage(String language) {
        this.language = language;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CountryLanguagePK that = (CountryLanguagePK) o;
        return countryCode.equals(that.countryCode) && language.equals(that.language);
    }

    @Override
    public int hashCode() {
        return 31 * countryCode.hashCode() + language.hashCode();
    }
}
