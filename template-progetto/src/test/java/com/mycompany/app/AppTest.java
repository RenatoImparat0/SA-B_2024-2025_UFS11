package com.mycompany.app;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest 
{
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void testInventario() {
        NegozioMusica nm = new NegozioMusica();
        Pianoforte piano1 = new Pianoforte("Yamaha", "S5X", "Nero lucido", 2013, 6090005);
        assertEquals("Yamaha", piano1.getMarca());
    }
}
