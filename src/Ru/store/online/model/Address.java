package Ru.store.online.model;

import Ru.store.online.model.enumeration.Country;

public class Address {

    private Country country;

    private String city;

    private  String region;

    private String  street;

    private String house;

    private  String apartment;

    private String index;





    public Country country() {
        return country;
    }

    public Address setCountry(Country country) {
        this.country = country;
        return this;
    }

    public String city() {
        return city;
    }

    public Address setCity(String city) {
        this.city = city;
        return this;
    }

    public String region() {
        return region;
    }

    public Address setRegion(String region) {
        this.region = region;
        return this;
    }

    public String street() {
        return street;
    }

    public Address setStreet(String street) {
        this.street = street;
        return this;
    }

    public String house() {
        return house;
    }

    public Address setHouse(String house) {
        this.house = house;
        return this;
    }

    public String apartment() {
        return apartment;
    }

    public Address setApartment(String apartment) {
        this.apartment = apartment;
        return this;
    }

    public String index() {
        return index;
    }

    public Address setIndex(String index) {
        this.index = index;
        return this;
    }
}
