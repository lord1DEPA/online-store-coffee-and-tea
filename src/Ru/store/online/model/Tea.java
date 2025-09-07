package Ru.store.online.model;

import Ru.store.online.model.enumeration.Aroma;
import Ru.store.online.model.enumeration.TeaType;

public class Tea extends Drink{
    private TeaType teaType;

    private Aroma aroma;

    public TeaType teaType() {
        return teaType;
    }

    public Tea setTeaType(TeaType teaType) {
        this.teaType = teaType;
        return this;
    }

    public Aroma aroma() {
        return aroma;
    }

    public Tea setAroma(Aroma aroma) {
        this.aroma = aroma;
        return this;
    }
}
