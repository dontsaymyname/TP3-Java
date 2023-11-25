package org.example;

import junit.framework.TestCase;
import org.example.exception.ComprimentoInvalidoException;
import org.example.util.CalcularDiagonal;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalcularDiagonalTest extends TestCase {

    @Test
    public void testaDiagonalQuadrado(){
        final CalcularDiagonal calcularDiagonal = new CalcularDiagonal();
        double quadrado = calcularDiagonal.calcularDiagonalQuadrado(7);
        assertEquals(9.9, quadrado, 0.1);
        assertThrows(ComprimentoInvalidoException.class, ()->{
            assertEquals(9.9, calcularDiagonal.calcularDiagonalQuadrado(-4), 0.1);
        });
    }
}
