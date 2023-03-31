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
public class g3_extra_2_ABCD_v2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int A,B,C,D,aux;
        System.out.println("Ingrese el valor de A:");
        A = leer.nextInt();
        System.out.println("Ingrese el valor de B:");
        B = leer.nextInt();
        System.out.println("Ingrese el valor de C:");
        C = leer.nextInt();
        System.out.println("Ingrese el valor de D:");
        D = leer.nextInt();
        System.out.println("Valores iniciales");
        System.out.println("\nA: "+A+"\nB: "+B+"\nC: "+C+"\nD: "+D);
        aux=B;
        B=C;
        C=A;
        A=D;
        D=aux;
        System.out.println("Los nuevos valores son: ");
        System.out.println("\nA: "+A+"\nB: "+B+"\nC: "+C+"\nD: "+D);
    }
    
}
