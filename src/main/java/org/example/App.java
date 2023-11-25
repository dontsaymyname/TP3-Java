package org.example;




import org.example.util.CalcularDiagonal;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;


/**
 * Hello world!
 *
 */
public class App 
{
    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

    public static void main( String[] args )
    {
        LOGGER.info("Iniciou");
        CalcularDiagonal calcularDiagonal = new CalcularDiagonal();
        System.out.println("Digite o valor do lado de um quadrado: ");
        Scanner scanner = new Scanner(System.in);
        int comprimento = scanner.nextInt();
        System.out.println("Diagonal do quadrado: " + calcularDiagonal.calcularDiagonalQuadrado(comprimento));
        LOGGER.info("Terminou");
    }
}
