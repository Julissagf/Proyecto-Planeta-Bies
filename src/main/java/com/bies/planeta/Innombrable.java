package com.bies.planeta;

public class Innombrable extends EnteVivo{
    @Override
    public void setAlimentarse(Alimentarse a){
        alimentarse = a;
    }

    @Override
    public String comer(){
        return alimentarse.alimentarse();
    }

    @Override
    public String toString(){
        return "Soy un innombrable.";
    }

}
