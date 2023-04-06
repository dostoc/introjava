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
public class g4_3_cambio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String moneda;
        double cantidad = 0;

        System.out.println("Ingrese cant $ :");
        cantidad = leer.nextDouble();

        System.out.println("Elija moneda a cambiar");
        System.out.println("(D)olares - (Y)enes - (L)ibras ");
        moneda = leer.next();
        moneda = moneda.toUpperCase();

        convertir(cantidad, moneda);
        
        
    }
    public static void convertir(double cantidad, String moneda) {

        switch (moneda) {
            case "D":
                System.out.println("DOLARES: " + cantidad * 1.28611);
                break;
            case "Y":
                System.out.println("YENES: " + cantidad * 0.86);
                break;
            case "L":
                System.out.println("LIBRAS: " + cantidad * 129.852);
                break;
        }

    }

}


