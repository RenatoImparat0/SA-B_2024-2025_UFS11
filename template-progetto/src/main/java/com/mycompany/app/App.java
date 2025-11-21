package com.mycompany.app;

public class App 
{
    public static void main( String[] args )
    {
        NegozioMusica n = new NegozioMusica();
        Pianoforte piano1 = new Pianoforte("Yamaha", "S5X", "Nero lucido", 2013, 6090005);
        Chitarra chitarra1 = new Chitarra("Yamaha", "C40", "Legno chiaro", 2024, 15000);

        piano1.suono();
        System.out.println(piano1.calcValore()/100f);

        chitarra1.suono();
        System.out.println(chitarra1.calcValore()/100f);

        System.out.println("valore inventario: " + n.calcValoreInventario());

        n.aggiungiStrumento(piano1);
        n.aggiungiStrumento(chitarra1);

        System.out.println(n.getInventario());
        System.out.println("valore inventario: " + n.calcValoreInventario()/100f);

        n.vendere(piano1);
        System.out.println(n.getInventario());
        System.out.println("valore inventario: " + n.calcValoreInventario()/100f);
        System.out.println(n.getTransazioni());

        n.vendere(chitarra1);
        System.out.println(n.getInventario());
        System.out.println("valore inventario: " + n.calcValoreInventario()/100f);
        System.out.println(n.getTransazioni());
    }
}
