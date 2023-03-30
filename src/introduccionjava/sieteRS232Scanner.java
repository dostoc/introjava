/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package introduccionjava;

import java.util.Scanner;

/**
 *
 * @author jonak
 */
public class sieteRS232Scanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String clave = "";
        int clavesValidas = 0;
        int clavesInvalidas = 0;

        do {
            System.out.print("Clave  (X) <-->(O)...:");
               
            clave = leer.nextLine();
            
            if (clave.equals("&&&&&")) {
                break;
            }
            // LEER CANT CARACTERES
            int cantCarac = clave.length();
          
            if  ((cantCarac <= 5 ) && ((clave.substring(0, 1).equalsIgnoreCase("x")
                    && (clave.substring(cantCarac-1, cantCarac).equalsIgnoreCase("o"))))) {
                clavesValidas ++;
                
            }else {clavesInvalidas ++;
                
            }
            
        } while(!clave.equals("&&&&&"));
        
        System.out.println("VALIDAS.....: " + clavesValidas);
        System.out.println("INVALIDAS...: " + clavesInvalidas);
        
        }
}
          


            
            
            