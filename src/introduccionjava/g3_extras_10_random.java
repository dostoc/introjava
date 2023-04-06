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
public class g3_extras_10_random {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String otro = "s";

        int num1, num2, aleatorio;
        boolean primo = false;
        Scanner leer = new Scanner(System.in);

        aleatorio = (int) (Math.random() * 10 + 1);
        System.out.println("<" + aleatorio + ">");

        System.out.println("Ingrese un numero....: ");

        do {
            System.out.print("1: ");
            num1 = leer.nextInt();

            System.out.print("2: ");
            num2 = leer.nextInt();

            if (aleatorio - (num1 * num2) == 0) {
                System.out.println("Correcto");

            } else {
                System.out.println("Incorrecto");
            }

            System.out.print("¿Otro s/n? :");
            otro = leer.next();
        } while (otro.equals("s"));

    }

    

}
