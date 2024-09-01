package com.bies.planeta;

import java.util.Random;

public class CaminanteYVolardor extends EnteVivoDecorador {
    private int patas;
    private int alas;
    private static final Random random = new Random();

    public CaminanteYVolardor(EnteVivo ente, int patasIniciales, int alasIniciales) {
        super(ente);
        this.patas = patasIniciales;
        this.alas = alasIniciales;
    }

    @Override
    public String movilizarse() {
        StringBuilder result = new StringBuilder();
        
        if (patas > 2) {
            if (random.nextDouble() < 1.0 / patas) {
                patas--;
                result.append("El ser vivo ha perdido una pata. Patas restantes: ").append(patas).append(". ");
            } else {
                result.append("El ser vivo se mueve con ").append(patas).append(" patas. ");
            }
        } else {
            setEnte(new Carroña(getEnte()));
            return "El ser vivo no puede caminar porque no tiene patas. Ahora es carroña.";
        }

        if (alas > 2) {
            if (random.nextDouble() < 1.0 / alas) {
                alas--;
                result.append("El ser vivo ha perdido un ala. Alas restantes: ").append(alas).append(".");
            } else {
                result.append("El ser vivo vuela con ").append(alas).append(" alas.");
            }
        } else {
            setEnte(new Carroña(getEnte()));
            return "El ser vivo no puede volar porque no tiene alas. Ahora es carroña.";
        }

        return result.toString();
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
        return getEnte().toString() + " (Caminar y volar con " + patas + " patas y " + alas + " alas)";
    }
}
