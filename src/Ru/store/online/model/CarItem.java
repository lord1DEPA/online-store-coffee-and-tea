package Ru.store.online.model;

public class CarItem {

    private Drink drink;

    private Short count;




    public Drink drink() {
        return drink;
    }

    public CarItem setDrink(Drink drink) {
        this.drink = drink;
        return this;
    }

    public Short count() {
        return count;
    }

    public CarItem setCount(Short count) {
        this.count = count;
        return this;
    }
}
