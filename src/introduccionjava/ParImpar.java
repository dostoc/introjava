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
public class ParImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese nro...:");
        int numero = leer.nextInt();
        String paridad = "";
        if ( numero % 2 == 0 ) {
            paridad = "PAR";
                        
        } else {
            paridad = "IMPAR";
        }
        
        System.out.println("El numero es..." + paridad );
        
        
    }
    
}
