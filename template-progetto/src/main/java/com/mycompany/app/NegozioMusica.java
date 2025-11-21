package com.mycompany.app;

import java.util.ArrayList;

public class NegozioMusica {
    private int patrimonio = 0;
    private ArrayList<StrumentoMusicale> inventario;
    private ArrayList<Transazione> transazioni;

    public NegozioMusica() {
        inventario = new ArrayList<StrumentoMusicale>();
        transazioni = new ArrayList<Transazione>();
    }

    public void aggiungiStrumento(StrumentoMusicale str) {
        inventario.add(str);
    }

    public void vendere(StrumentoMusicale strumento) {
        if (StrumentoMusicale.isContained(strumento, inventario)) {
            inventario.remove(strumento);
            patrimonio += strumento.calcValore();
            transazioni.add(new Transazione(strumento.calcValore(), "VENDUTO " + strumento.getMarca() + " " + strumento.getModello() + " "  + strumento.getColore() + " "  + strumento.getAnnoProduzione()));
        }
    }

    public int calcValoreInventario() {
        int valoreInventario = 0;

        for (StrumentoMusicale strumento : inventario) {
            valoreInventario += strumento.calcValore();
        }
        return valoreInventario;
    }

    public ArrayList<StrumentoMusicale> getInventario() {
        return inventario;
    }

    public int getPatrimonio() {
        return patrimonio;
    }

    public ArrayList<Transazione> getTransazioni() {
        return transazioni;
    }
}

