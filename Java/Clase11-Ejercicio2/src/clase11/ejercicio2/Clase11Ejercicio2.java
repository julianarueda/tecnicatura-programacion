/*
En un almacén se hace un 20 MOD de descuento a los clientes cuya compra supere los $100. 
¿Cuál será la cantidad que pagará una persona por su compra?
 */
package clase11.ejercicio2;

import java.util.Scanner;

public class Clase11Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double compra, descuento, precio_final;

        System.out.print("Digite la cantidad a pagar: ");
        compra = scanner.nextDouble();

        if (compra > 100) {
            descuento = compra*0.2;
        }
        else{
            descuento = 0;
        }
        
        precio_final = compra-descuento;
        System.out.printf("El precio a pagar es: $%.2f%n", precio_final);
    }
    
}
