package Ru.store.online.model;



import Ru.store.online.model.enumeration.Status;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Order {

    private LocalDateTime orderDate;

    private User user;
    private Address address;
    private BigDecimal totalPrice;

    private Status status;

    private CarItem[] carItemsArray;




    public LocalDateTime orderDate() {
        return orderDate;
    }

    public Order setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
        return this;
    }

    public User user() {
        return user;
    }

    public Order setUser(User user) {
        this.user = user;
        return this;
    }

    public Address address() {
        return address;
    }

    public Order setAddress(Address address) {
        this.address = address;
        return this;
    }

    public BigDecimal totalPrice() {
        return totalPrice;
    }

    public Order setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
        return this;
    }

    public Status status() {
        return status;
    }

    public Order setStatus(Status status) {
        this.status = status;
        return this;
    }

    public CarItem[] carItemsArray() {
        return carItemsArray;
    }

    public Order setCarItemsArray(CarItem[] carItemsArray) {
        this.carItemsArray = carItemsArray;
        return this;
    }
}
