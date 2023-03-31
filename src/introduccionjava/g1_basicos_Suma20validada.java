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
public class g1_basicos_Suma20validada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 20 numeros");
        int nota;
        int cont = 0;
        int suma = 0;

        do {

            nota = leer.nextInt();
            ++cont;
            if (nota == 0) {
                System.out.println("Se capturó el numero cero");
                break;

            }
            if (nota > 0) {
                suma = suma + nota;

            }
            // System.out.println("contador = " + cont);
        } while (cont < 20);
        System.out.println("La sumatoria de los numeros ingresados es: " + suma);

    }
}
