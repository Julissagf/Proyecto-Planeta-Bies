package com.bies.planeta;
import java.util.ArrayList;

public abstract class EnteVivo extends Ente{
    Alimentarse alimentarse;
    ArrayList<EnteVivoDecorador> decorators = new ArrayList<>();

    @Override
    public abstract void setAlimentarse(Alimentarse a);

    @Override
    public abstract String comer();

    @Override
    public abstract String toString();

    public void addDecorator(EnteVivoDecorador e) { decorators.add(e); }

    public String movilizarse() {
        String retStr = "";
        for (EnteVivoDecorador e : decorators) {
            retStr += e.movilizarse();
        }
        return retStr;
    }




}
