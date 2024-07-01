/*
Ejercicio 1: Construir un programa que, dado un número total de
horas, devuelve el número de semanas, días y horas equivalentes.
Por ejemplo dado un total de 1000 horas debe mostrar 5 semanas,
6 días y 16 horas.
 */
package clase12.ejercicio1;

import java.util.Scanner;

public class Clase12Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número total de horas: ");
        int totalHoras = scanner.nextInt();
        
        // Convertir horas a semanas, días y horas
        int semanas = totalHoras / (7 * 24);
        int dias = (totalHoras % (7 * 24)) / 24;
        int horas = totalHoras % 24;
        
        System.out.println(totalHoras + " horas son equivalentes a:");
        System.out.println(semanas + " semanas, " + dias + " días y " + horas + " horas.");
        
    }
    
}
