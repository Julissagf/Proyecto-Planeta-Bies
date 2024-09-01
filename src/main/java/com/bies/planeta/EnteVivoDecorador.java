package com.bies.planeta;

public abstract EnteVivoDecorador extends EnteVivo {
  private EnteVivo ente;

  public EnteVivoDecorador (EnteVivo e) {
    ente = e;
  }

  protected EnteVivo getEnte () {
    return ente;
  }
  
  public String movilizarse();
}
