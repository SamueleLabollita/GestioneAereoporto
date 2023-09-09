package it.paleocapa.labollita;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class ClienteTest {
    private Cliente cliente;

    @Before
    public void setUp() {
        cliente = new Cliente("Labollita", "Samuele", "Italia", "Bergamo", "1990-03-11");
    }

    @Test
    public void testCostruttore() {
        assertEquals("Labollita", cliente.getCognome());
        assertEquals("Samuele", cliente.getNome());
        assertEquals("Italia", cliente.getNazioneDiNascita());
        assertEquals("Bergamo", cliente.getCittaDiNascita());
        assertEquals("1990-03-11", cliente.getDataDiNascita());
        assertNotNull(cliente.getCodiceCliente());
    }

    @Test
    public void testModificaDati() {
        cliente.modificaDati("Loda", "Matilde", "Italia", "Brescia", "2006-07-30");
        assertEquals("Loda", cliente.getCognome());
        assertEquals("Matilde", cliente.getNome());
        assertEquals("Italia", cliente.getNazioneDiNascita());
        assertEquals("Brescia", cliente.getCittaDiNascita());
        assertEquals("2006-07-30", cliente.getDataDiNascita());
    }
}

