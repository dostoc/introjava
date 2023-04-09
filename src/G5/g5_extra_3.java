/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package G5;

import java.util.Scanner;

/**
 *
 * @author jonak
 */
public class g5_extra_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] vectorOrigen = new int[5];
        int[] vectorDestino = new int[5];
        String vectorOrigenTXT = "";
        String vectorDestinoTXT = "";
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese vector 5 nro enteros :");
        for (int i = 0; i < vectorOrigen.length; i++) {
            vectorOrigen[i] = leer.nextInt();
            vectorOrigenTXT = vectorOrigenTXT +" [" +vectorOrigen[i] + "] ";
        }
        System.out.println(vectorOrigenTXT);

        vectorDestino = puentevector(vectorOrigen);

        for (int i = 0; i < vectorDestino.length; i++) {
            vectorDestinoTXT = vectorDestinoTXT +" [" + vectorDestino[i] + "] ";
        }
        System.out.println(vectorDestinoTXT);
    }

    
    public static int[] puentevector(int[] vector) {
        int[] puentevector = new int[vector.length];
        for (int i = 0; i < vector.length; i++) {
            puentevector[i] = vector[i];
            
        }
     return puentevector;   
    }

}
