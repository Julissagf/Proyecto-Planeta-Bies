package com.bies.planeta;
import java.util.ArrayList;

public abstract class EnteVivo {
    Alimentarse alimentarse;
    ArrayList<EnteVivoDecorador> decorators = new ArrayList<>();

    public abstract void setAlimentarse(Alimentarse a);
    public abstract String comer();
    public abstract String toString();

    public void addDecorator(EnteVivoDecorador e) { decorators.add(e); }
}
