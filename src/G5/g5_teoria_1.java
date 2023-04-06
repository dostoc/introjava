/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package G5;

import java.util.Scanner;

/**
 * 0 1 2 3
 * 0 2 3 2
 *
 * @author jonak
 */
public class g5_teoria_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] Equipo = new String[7];
        Scanner leer = new Scanner(System.in);

        for (int i = 0; i < Equipo.length; i++) {
            System.out.println("Ingrese Nombre: " + i + " : ");
            Equipo[i] = leer.nextLine();

        }

        for (int i = 0; i < Equipo.length; i++) {
            System.out.print(Equipo[i] + " - ");

        }

    }

}
