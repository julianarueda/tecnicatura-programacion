/*
Determinar si un alumno aprueba o reprueba un curso, 
sabiendo que aprobará si su promedio de tres 
calificaciones es mayor o igual a 70 reprueba en caso contrario.
*/

package clase11.ejercicio1;

import java.util.Scanner;

public class Clase11Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nota1, nota2, nota3, promedio;

        // Solicitar las tres calificaciones del alumno
        System.out.print("Digite las 3 calificaciones: ");
        nota1 = scanner.nextDouble();
        nota2 = scanner.nextDouble();
        nota3 = scanner.nextDouble();
        
        promedio = (nota1 + nota2 + nota3) / 3;
        
        // Determinar si el alumno aprueba o reprueba
        if (promedio >= 70) {
            System.out.println("El alumno esta aprobado con: " + promedio);
        } else {
            System.out.println("El alumno esta desaprobado con: " + promedio);
        }
    }
    
}
