package leccion2;

import java.util.Scanner;

public class Leccion2 {
    public static void main(String[] args) {
//         var condicion = false;
//         if(condicion){
//             System.out.println("Condicion Verdadera"); //condicion simple
//         }
//         else{
//             System.out.println("Condicion Falsa"); // condicion doble
//         }
        
//        var numero = 2;
//        var numeroTexto = "Número desconocido";
//        if(numero == 1){
//            numeroTexto = "Número uno";
//        }
//        else if(numero == 2){
//            numeroTexto = "Número dos";
//        }
//        else if(numero == 3){
//            numeroTexto = "Número tres";
//        }
//        else if(numero == 4){
//            numeroTexto = "Número cuatro";
//        }
//        else{
//            numeroTexto = "Número no encontrado";
//        }
//        System.out.println("numeroTexto = " + numeroTexto);
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite un número del 1 al 4: ");
        var numero = Integer.parseInt(entrada.nextLine());
        var numeroTexto = "Número desconocido";
        switch(numero){
            case 1:
                numeroTexto = "Número uno";
                break;
            case 2:
                numeroTexto = "Número dos";
                break;
            case 3:
                numeroTexto = "Número tres";
                break;
            case 4:
                numeroTexto = "Número cuatro";
                break;
            default:
                numeroTexto = "Caso no encontrado";
                break;
        }
        System.out.println("numeroTexto = " + numeroTexto);
        
    }
    
}
