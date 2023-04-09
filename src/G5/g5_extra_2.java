/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package G5;

import java.util.Random;
import java.util.Scanner;



/**
 *
 * @author jonak
 */
public class g5_extra_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Random rnd = new Random();
        Scanner leer = new Scanner(System.in);

        String vectorAtxt = "";
        String vectorBtxt = "";

        System.out.println("Ingrese tam...:");
        int tam = leer.nextInt();

        int[] vectorA = new int[tam];
        int[] vectorB = new int[tam];

        for (int i = 0; i < tam; i++) {
            vectorA[i] = rnd.nextInt(10);
            vectorB[i] = rnd.nextInt(10);

            vectorAtxt = vectorAtxt + "["+vectorA[i] + "]";
            vectorBtxt = vectorBtxt + "["+vectorB[i] + "]";

            System.out.println(vectorAtxt);
            System.out.println(vectorBtxt);
            
            if (vectorA[i] != vectorB[i]) {
                System.out.println("Vectores NO! son iguaes");
                break;

            }

        }

    }

}
