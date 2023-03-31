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
public class g1_Impresion_bucleForanidado_v2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 4 numeros");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        int num3 = leer.nextInt();
        int num4 = leer.nextInt();
       
        // num1
        System.out.println("");
        System.out.print( num1 +":  ");
        for (int i = 0; i < num1; i++) {
            System.out.print("*");
        }
        // num2
        System.out.println("");
        System.out.print( num2 +":  ");
        for (int i = 0; i < num2; i++) {
            System.out.print("*");
        }// num3
        System.out.println("");
        System.out.print( num3 +":  ");
        for (int i = 0; i < num3; i++) {
            System.out.print("*");
        }
        // num4
        System.out.println("");
        System.out.print( num4 +":  ");
        for (int i = 0; i < num4; i++) {
            System.out.print("*");
        }
        System.out.println("");
        
    }
    
}
