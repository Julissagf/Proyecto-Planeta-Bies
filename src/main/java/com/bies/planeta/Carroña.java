package com.bies.planeta;

public class Carroña extends EnteVivoDecorador {
  public Carroña (EnteVivo ente) {
    super(ente);
  }
  
  @Override
  public String movilizarse() {
     return "Ya no puedo movilizarme porque soy carroña";
  }

  @Override
  public void setAlimentarse(Alimentarse a);

  @Override
  public String comer();

  @Override
  public String toString();
}
