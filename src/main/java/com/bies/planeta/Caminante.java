package com.bies.planeta;

public class Caminante extends EnteVivoDecorador {
    private int patas;
    private static final Random random = new Random();
  
  @Override
  public String movilizarse() {
     if (patas > 2) {
            if (random.nextDouble() < 1.0 / patas) {
                patas--;
                return "El ser vivo ha perdido una pata. Patas restantes: " + patas;
            }
        } else {
            
            return "El ser vivo no puede caminar porque no tiene patas.";
        }
  }
}
