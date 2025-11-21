package com.mycompany.app;

public class Chitarra extends StrumentoMusicale{

        public Chitarra(String marca, String modello, String colore, int annoProduzione, int prezzo) {
            super(marca, modello, colore, annoProduzione, prezzo);
        }

        @Override
        public void suono() {
            System.out.println("*suono chitarra*");
        }
    }
