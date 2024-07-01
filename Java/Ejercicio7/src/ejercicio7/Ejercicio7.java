/*
 * Una compañia de venta de carros usados, paga a su personal de ventas un salario de $1000 mensuales
 * más una comisión de $150 por cada carro vendido, más el 5% del valor de venta por carro.
 * Cada mes el capturista de la empresa ingresa en la computadora los datos pertinentes.
 * 
 * Hacer un programa que calcule e imprima el salario mensual de un vendedor dado.
 * El salario de 1000 lo vamos a manejar como un dato constante, para asignarlo debemos usar la palabra reservada "final"
 * 
 */
package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final int salario = 1000;
        int comision = 150, venta;
        float salarioMensual, ventaCarro, porcVenta, totalPrecio;
        
        System.out.print("Digite la cantidad de carros vendidos: ");
        venta = Integer.parseInt(entrada.nextLine());
        System.out.print("Digite el precio de un carro: ");
        ventaCarro = Float.parseFloat(entrada.nextLine());
        
        comision *= venta;
        totalPrecio = ventaCarro * venta;
        porcVenta = totalPrecio * 0.05f;
        salarioMensual = salario + comision + porcVenta;
        
        System.out.println("\nEl salario mensual es: " + salarioMensual);
    }
    
}
