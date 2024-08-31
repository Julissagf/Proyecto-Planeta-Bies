package com.bies.planeta;

public class Arana extends Insecto {


    public Arana(){ //Strategy
        alimentarse = new AlimentarseDeHongo();
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
        return super.toString() + " una Araña.";
    }

}
