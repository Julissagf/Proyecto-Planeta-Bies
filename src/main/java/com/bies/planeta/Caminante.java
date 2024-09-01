package com.bies.planeta;

public class Caminante extends EnteVivoDecorador {
    private int patas;
    private static final Random random = new Random();

    public Caminante (EnteVivo ente) {
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
        getEnte().comer();
    }

    @Override
    public String toString() {
        getEnte().toString();
    }
  
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
