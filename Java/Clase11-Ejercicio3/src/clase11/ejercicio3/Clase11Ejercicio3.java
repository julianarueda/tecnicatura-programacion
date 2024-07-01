/*
Leer 2 números;
Si son iguales que los multiplique
Si el primero es mayor que el segundo que los reste 
y si no que los sume
 */
package clase11.ejercicio3;

import java.util.Scanner;

public class Clase11Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double num1, num2, resultado;
        
        System.out.print("Digite dos números: ");
        num1 = scanner.nextDouble();
        num2 = scanner.nextDouble();
        if (num1 == num2) {
            resultado = num1 * num2;
        } else if (num1 > num2) {
            resultado = num1 - num2;
        } else {
            resultado = num1 + num2;
        }
        System.out.println("El resultado es: " + resultado);
    }
    
}
