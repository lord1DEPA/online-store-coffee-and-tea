package Ru.store.online.model;

import Ru.store.online.model.enumeration.Country;
import Ru.store.online.model.enumeration.Manufacture;
import Ru.store.online.model.enumeration.Package;

import java.math.BigDecimal;

public abstract class Drink {
    private String name;

    private BigDecimal price;

    private float weight;

    private Manufacture manufacture;

    private Country country;

    private Package aPackage;





    public String name() {
        return name;
    }

    public Drink setName(String name) {
        this.name = name;
        return this;
    }

    public BigDecimal price() {
        return price;
    }

    public Drink setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public float weight() {
        return weight;
    }

    public Drink setWeight(float weight) {
        this.weight = weight;
        return this;
    }

    public Manufacture manufacture() {
        return manufacture;
    }

    public Drink setManufacture(Manufacture manufacture) {
        this.manufacture = manufacture;
        return this;
    }

    public Country country() {
        return country;
    }

    public Drink setCountry(Country country) {
        this.country = country;
        return this;
    }

    public Package aPackage() {
        return aPackage;
    }

    public Drink setaPackage(Package aPackage) {
        this.aPackage = aPackage;
        return this;
    }
}
