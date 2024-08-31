package com.bies.planeta;

public class Mariposa extends Insecto {

    public Mariposa(){ //Strategy
        alimentarse = new AlimentarseDeMiel();
    }

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
        return super.toString() + " una mariposa.";
    }
}
