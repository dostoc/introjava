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
public class g3_extras_7_ValorMaxMin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.print("Cantidad de Valores :  ");
        int cantValores = leer.nextInt();
        int ValorMax;
        int ValorMin;
        int auxiliar;
        int cont = 0;
        double promedio = 0;

        auxiliar = leer.nextInt();
        ValorMax = auxiliar;
        ValorMin = auxiliar;
        

        do {
            cont++;
            promedio = promedio + auxiliar;
            if (cont >= 1) {
                auxiliar = leer.nextInt();
            }

            if (ValorMax < auxiliar) {
                ValorMax = auxiliar;

            }
            if (ValorMin > auxiliar) {
                ValorMin = auxiliar;
            }

        } while (cont + 1 != cantValores);

        promedio = promedio/cont;
        System.out.println( "Minimo: " + ValorMin + "  Maximo : " + ValorMax + " Promedio : " + promedio);
        

        cont = 0;
        promedio = 0;

        while (cont < cantValores) {
            cont++;
            auxiliar = leer.nextInt();
            promedio = promedio + auxiliar;
            if (cont == 1) {
                ValorMax = auxiliar;
                ValorMin = auxiliar;
            }
            if (ValorMax < auxiliar) {
                ValorMax = auxiliar;

            }
            if (ValorMin > auxiliar) {
                ValorMin = auxiliar;
            }

        }
        promedio = promedio/cont;
        System.out.println( "Minimo: " + ValorMin + "  Maximo : " + ValorMax + " Promedio : " + promedio);
        
    }
}
