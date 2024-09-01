package com.bies.planeta;

public class Caminante extends EnteVivoDecorador {
    private int patas;
    private static final Random random = new Random();

    public Caminante(EnteVivo ente, int patasIniciales) {
        super(ente);
        this.patas = patasIniciales;
    }

    @Override
    public String movilizarse() {
        if (patas > 2) {
            if (random.nextDouble() < 1.0 / patas) {
                patas--;
                return "El ser vivo ha perdido una pata. Patas restantes: " + patas;
            } else {
                return "El ser vivo se mueve con " + patas + " patas.";
            }
        } else {
            setEnte(new Carroña(getEnte()));
            return "El ser vivo no puede caminar porque no tiene patas. Ahora es carroña.";
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
        return getEnte().toString() + " (Caminante con " + patas + " patas)";
    }
}
