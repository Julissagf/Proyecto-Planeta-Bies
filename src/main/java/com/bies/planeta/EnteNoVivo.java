package com.bies.planeta;

public abstract class EnteNoVivo extends Ente {

   
    @Override
    public abstract String toString();

    @Override
    public String comer(){ return "No puedo comer, porque soy un ente no vivo"; }

    @Override
    public void setAlimentarse(Alimentarse s){ }

 
    
}
