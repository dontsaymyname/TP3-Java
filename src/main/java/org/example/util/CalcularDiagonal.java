package org.example.util;

import org.example.exception.ComprimentoInvalidoException;

public class CalcularDiagonal {

    public double calcularDiagonalQuadrado(int lado) {

        if (lado <= 0) {
            throw new ComprimentoInvalidoException("O comprimento do lado deve ser maior que 0.");
        }
        return lado * Math.sqrt(2);
    }
}
