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
public class g3_3_largoPalabra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        String palabra;
              
        do {
            palabra = leer.next();
            if (palabra.length() == 8 ) {
                System.out.println("Correcto" + " ("+ palabra.length() + ")");                
            }else {
                System.out.println("Incorrecto" + " ("+ palabra.length() + ")" );
            }
        } while (!palabra.equals("salir"));   
        
               
    }
    
}
