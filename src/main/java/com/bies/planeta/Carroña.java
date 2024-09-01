package com.bies.planeta;

public class Carroña extends EnteVivoDecorador {
  @Override
  public String movilizarse() {
     return "Ya no puedo movilizarme porque soy carroña";
  }
}
