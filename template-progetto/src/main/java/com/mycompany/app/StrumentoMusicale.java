package com.mycompany.app;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class StrumentoMusicale {
    private String marca, modello, colore;
    private int annoProduzione, prezzo;

    public StrumentoMusicale(String marca, String modello, String colore, int annoProduzione, int prezzo) {
        this.marca = marca;
        this.modello = modello;
        this.colore = colore;
        this.annoProduzione = annoProduzione;
        this.prezzo = prezzo;
    }

    public abstract void suono();

    public int calcValore() {
        int annoCorrente = LocalDate.now().getYear();
        int anniPassati = annoCorrente - annoProduzione;

        if (annoCorrente == annoProduzione) {
            return prezzo;
        }

        float valore = prezzo/100f;

        if (anniPassati > 20) {
            for (int i = 0; i < 20; i++) {
                valore *= 0.95f;
            }
            for (int i = 0; i < anniPassati-20; i++) {
                valore *= 1.05f;
            }
            valore = (Math.round(valore * 100.0f) / 100.0f) * 100f;
            return (int)valore;
        }
        else {
            for (int i = 0; i < anniPassati; i++) {
                valore *= 0.95f;
            }
            valore = (Math.round(valore * 100.0f) / 100.0f) * 100f;
            return (int)valore;
        }
    }

    public static boolean isContained(StrumentoMusicale strumento, ArrayList<StrumentoMusicale> inventario) {
        for (StrumentoMusicale strInventario : inventario) {
            if (strumento.toString().equals(strInventario.toString())) {
                return true;
            }
        }
        return false;
    }

    public String getMarca() {
        return marca;
    }

    public String getModello() {
        return modello;
    }

    public String getColore() {
        return colore;
    }

    public int getAnnoProduzione() {
        return annoProduzione;
    }

    public int getPrezzo() {
        return prezzo;
    }

    @Override
    public String toString() {
        return marca + " " + modello + " " + colore + " " + annoProduzione + " " + (float)prezzo/100 + "€";
    }
}
