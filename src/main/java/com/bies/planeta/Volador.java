package com.bies.planeta;

public class Volador extends EnteVivoDecorador {
    private int alas;
    private static final Random random = new Random();

    public Volador (EnteVivo ente) {
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
                return "El ser vivo ha perdido un ala. Alas restantes: " + alas;
            }
        } else {
            
            return "El ser vivo no puede volar porque no tiene patas.";
        }
    }
}
