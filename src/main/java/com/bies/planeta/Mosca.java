package com.bies.planeta;

public class Mosca extends Insecto {


    public Mosca(){ //Strategy
        alimentarse = new AlimentarseDeCarrona();
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
        return super.toString() + " una Mosca.";
    }

}
