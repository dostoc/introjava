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
public class While {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una nota de 0 a 10");
        
       int nota = -1;
        
        while (nota < 0 || nota > 10) {
            nota = leer.nextInt();
            if   (nota < 0 || nota > 10) {
                System.out.println("ERROR Fuera de rango");
            }
                         
            
        }
        System.out.println("Nota obtenida ...: " + nota );
    }
    
}
