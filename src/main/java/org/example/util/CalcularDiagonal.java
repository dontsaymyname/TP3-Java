package org.example.util;

import org.example.App;
import org.example.exception.ComprimentoInvalidoException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CalcularDiagonal {

    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

    public double calcularDiagonalQuadrado(int lado) {
        LOGGER.debug("Comprimento do lado do quadrado: " + lado);
        if (lado <= 0) {
            LOGGER.error("Programa encerrado por valor inválido.");
            throw new ComprimentoInvalidoException("O comprimento do lado deve ser maior que 0.");
        }
        return lado * Math.sqrt(2);
    }
}
