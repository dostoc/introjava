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
public class g3_4_primer_caracter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        do {            
            String palabra = leer.next();
            if (palabra.substring(0, 1).equals("A")) {
                System.out.println("CORRECTO");
                
            } else {System.out.println("INCORRECTO");
            }
            
            if (palabra.equals("salir")) {
                System.out.println("Saliendo ...");
                break;
            }
        } while (true);
        
                
    }
    
}
