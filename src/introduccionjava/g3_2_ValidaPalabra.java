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
public class g3_2_ValidaPalabra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String palabrabuscada = "eureka";
        
        Scanner leer = new Scanner(System.in);
        boolean verdadero = false;
        
        while (verdadero == false) {
                String palabra = leer.nextLine();
                verdadero = palabrabuscada.equals(palabra);
                if (verdadero) { 
                    System.out.println("La palabra introducida es correcta");
                    verdadero = true;
                    break;
                 }else {
                    System.out.println("NO VALIDA");                
   
        }
        
        
        
    }
    
}
}
