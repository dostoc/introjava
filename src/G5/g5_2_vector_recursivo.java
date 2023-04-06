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
public class g5_2_vector_recursivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// TODO code application logic here
        int[] vector = new int[100];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = i + 1;

        }
        for (int i = vector.length - 1; i >= 0; i--) {
            System.out.print(vector[i] + " - ");

        }

    }

}
