package com.bies.planeta;

public class Volador extends EnteVivoDecorador {
    private int alas;
    private static final Random random = new Random();

    public Volador(EnteVivo ente, int alasIniciales) {
        super(ente);
        this.alas = alasIniciales;
    }

    @Override
    public String movilizarse() {
        if (alas > 2) {
            if (random.nextDouble() < 1.0 / alas) {
                alas--;
                return "El ser vivo ha perdido un ala. Alas restantes: " + alas;
            } else {
                return "El ser vivo vuela con " + alas + " alas.";
            }
        } else {
            return "El ser vivo no puede volar porque no tiene alas. Ahora es carroña.";
        }
    }

    @Override
    public void setAlimentarse(Alimentarse a) {
        getEnte().setAlimentarse(a);
    }
    
    @Override
    public String comer() {
        return getEnte().comer();
    }

    @Override
    public String toString() {
        return getEnte().toString() + " (Volador con " + alas + " alas)";
    }
}
