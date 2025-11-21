package com.mycompany.app;

public class Pianoforte extends StrumentoMusicale{

    public Pianoforte(String marca, String modello, String colore, int annoProduzione, int prezzo) {
        super(marca, modello, colore, annoProduzione, prezzo);
    }

    @Override
    public void suono() {
        System.out.println("*suono pianoforte*");
    }
}
