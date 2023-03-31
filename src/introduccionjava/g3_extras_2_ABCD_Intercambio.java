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
public class g3_extras_2_ABCD_Intercambio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        System.out.print("A:");
        int valorA = leer.nextInt(); 
        //
        System.out.print("B:");
        int valorB = leer.nextInt(); 
        //
        System.out.print("C:");
        int valorC = leer.nextInt(); 
        //
        System.out.print("D:");
        int valorD = leer.nextInt(); 
        //
        
        System.out.println("VALORES ORIGINALES:");
        System.out.println("A: [" + valorA +"]" + "  B: [" + valorB +"]" + "  C: [" + valorC +"]" + "  D: [" + valorD +"]");
        
        // PASES
        int aux;
        aux = valorA;
                valorA = valorD;
                valorD = valorB;
                valorB = valorC;
                valorC = aux;  
                
        System.out.println("VALORES PASES:");
        System.out.println("A: [" + valorA +"]" + "  B: [" + valorB +"]" + "  C: [" + valorC +"]" + "  D: [" + valorD +"]");
        
                
    }
    
}
