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
public class g3_extras_3_buscarVocal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String carac;
        boolean esVocal;

        do {
            carac = leer.next();
            if (carac.equalsIgnoreCase("a")
                    || carac.equalsIgnoreCase("e")
                    || carac.equalsIgnoreCase("i")
                    || carac.equalsIgnoreCase("o")
                    || carac.equalsIgnoreCase("u")) {
                esVocal = true;
            } else {
                esVocal = false;
            }
            System.out.println(esVocal);

        } while (!carac.equals("jjj"));

    }

}
