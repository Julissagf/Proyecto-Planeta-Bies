package com.bies.planeta;

public abstract class EnteVivo {
    Alimentarse alimentarse;

    public abstract void setAlimentarse(Alimentarse a);
    public abstract String comer();
    public abstract String toString();
}
