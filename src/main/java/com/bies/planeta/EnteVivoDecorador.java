package com.bies.planeta;

public abstract class EnteVivoDecorador extends EnteVivo {
    private Ente ente;

    public EnteVivoDecorador(EnteVivo e) {
        this.ente = e;
    }

    protected Ente getEnte() {
        return ente;
    }

    protected void setEnte(Ente nuevoEnte) {
        this.ente = nuevoEnte;
    }

    void degradacionMotora(){
        setEnte(new Carroña());
    }

}
