package org.example;

import org.example.util.CalcularDiagonal;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        CalcularDiagonal calcularDiagonal = new CalcularDiagonal();
        System.out.println(calcularDiagonal.calcularDiagonalQuadrado(7));
    }
}
