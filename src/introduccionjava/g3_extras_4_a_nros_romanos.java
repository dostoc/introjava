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
public class g3_extras_4_a_nros_romanos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
       int numero = 0;
       
        System.out.println("Nro comunacho (1 a 10)..:");
        do {            
            numero = leer.nextInt();
            if (numero >10) {
                System.out.print("Ese no... muy alto");                
            }
        } while (numero > 10);
        
        
        
        // Version bien pedorra....
        
        switch (numero) {
            case 10: System.out.println("X");
                break;
            case 9: System.out.println("IX");
                break;
            case 8: System.out.println("VIII");
                break;
            case 7: System.out.println("VII");
                break;
            case 6: System.out.println("VI");
                break;
            case 5: System.out.println("V");
                break;
            case 4: System.out.println("IV");
                break;
            case 3: System.out.println("III");
                break;
            case 2: System.out.println("II");
                break;
            case 1: System.out.println("I");
                break;
        }
        
        
        
    }
    
}
