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
public class numMayores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Ingrese dos numeros enteros:");
        Scanner leer = new Scanner(System.in);
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        
        if (num1 > 25 && num2 > 25) {
            System.out.println("Ambos numeros mayores a 25");
            
        } else if (num1 > 25 || num2 > 25) {
        System.out.println("uno de ellos es mayor a 25");
        
        } else {
        System.out.println("Ninguno de ellos es mayor a 25");
          }
    }
    
}
