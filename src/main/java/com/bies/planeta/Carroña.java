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
  public void setAlimentarse(Alimentarse a) {
    getEnte().setAlimentarse(a);
  }

  @Override
  public String comer() {
    return "Ya no puede comer el ente porque es carroña";
  }

  @Override
  public String toString() {
    return "El ente es carroña";
  }
}
