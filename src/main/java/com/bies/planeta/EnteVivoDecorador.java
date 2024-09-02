package com.bies.planeta;

public abstract class EnteVivoDecorador extends EnteVivo {
  private EnteVivo ente;

  public EnteVivoDecorador(EnteVivo e) {
      this.ente = e;
  }

  protected EnteVivo getEnte() {
      return ente;
  }

  protected void setEnte(EnteVivo nuevoEnte) {
      this.ente = nuevoEnte;
  }
}
