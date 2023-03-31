/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package introduccionjava;

import java.util.Scanner;

/**
 *
 * @author Jona
 */
public class g3_6_Calculadora {

    /**
     * @param args the command line arguments
     */    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int opcion = 0;
        int auxA, auxB;
        float resultado;
        String salir = "n";
        
        
        do {
        System.out.print("Ingrese Valor A...:");
        auxA = leer.nextInt();
         } while (auxA<= 0);
        
        do {
        System.out.print("Ingrese Valor B...:");
        auxB = leer.nextInt();
        } while (auxB<= 0);
               
        
        do {            
        System.out.println("MENU:");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        System.out.println("Elija opción");
        
        opcion = leer.nextInt();
        
            switch (opcion) {
                case 1:
                    resultado = auxA + auxB;
                    System.out.println("perro = " + resultado);
                    break;
                case 2:
                    resultado = auxA - auxB;
                    System.out.println("Resultado = " + resultado);
                    break;
                    case 3:
                     resultado = auxA * auxB;
                    System.out.println("Resultado = " + resultado);
                    break;
                    case 4:
                    double divi = (double) (auxA / auxB);
                    System.out.println("Resultado = " + divi);
                    break;
                    case 5:
                        System.out.println("¿Desea salir del programa s/n?");
                        salir = leer.next();
                        if (salir.equalsIgnoreCase("s")) {
                            break;                            
                        }
                    break;                
             
            }
            System.out.println("Enter para continuar");
            
            leer.nextLine();
            leer.nextLine();
                
            } while (salir.equalsIgnoreCase("n"));
        
        
        
        
    }
    
}
