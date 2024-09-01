package com.bies.planeta;

public abstract EnteVivoDecorador extends EnteVivo {
  private EnteVivo ente;

  public EnteVivoDecorador (EnteVivo e) {
    ente = e;
  }

  protected EnteVivo getEnte () {
    return ente;
  }

  protected void setEnte(EnteVivo nuevoEnte) {
    this.ente = nuevoEnte;
  }
  
  public String movilizarse();
}
