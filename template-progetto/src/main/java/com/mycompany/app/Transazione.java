package com.mycompany.app;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Transazione {
    private int valore;
    private String descrizione;
    private LocalDateTime data = LocalDateTime.now();
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd | HH:mm:ss");

    public Transazione(int valore, String descrizione) {
        this.valore = valore;
        this.descrizione = descrizione;
    }

    @Override
    public String toString() {
        return "{" + data.format(formatter) + " | " + descrizione + " " + valore/100 + "€" + "}";
    }
}