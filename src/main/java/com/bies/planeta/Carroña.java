package com.bies.planeta;

public class Carroña extends EnteNoVivo {


  public Carroña () {
    super();
  }


  public String movilizarse() {
      return "Ya no puede movilizarse porque es carroña";
   }

  @Override
  public String toString() {
    return "El ente es carroña";
  }
}
