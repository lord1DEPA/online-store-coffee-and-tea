package Ru.store.online.model;

import Ru.store.online.model.enumeration.CoffeeType;
import Ru.store.online.model.enumeration.Roasting;

public class Coffee {

    private CoffeeType coffeeType;

    private Roasting roasting;




    public CoffeeType coffeeType() {
        return coffeeType;
    }

    public Coffee setCoffeeType(CoffeeType coffeeType) {
        this.coffeeType = coffeeType;
        return this;
    }

    public Roasting roasting() {
        return roasting;
    }

    public Coffee setRoasting(Roasting roasting) {
        this.roasting = roasting;
        return this;
    }
}
