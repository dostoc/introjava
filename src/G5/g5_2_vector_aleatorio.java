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
public class g5_2_vector_aleatorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        
        int contador = 0;
        int numeroBuscado;
        String posicion = "";
        
        
        
        int[] vector = new int[100];
                
        for (int i = 0; i < vector.length; i++) {
                vector[i]= (int)(Math.random()*10+1);
        }
        System.out.print("Numero Buscado...:");
        numeroBuscado = leer.nextInt();
        
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == numeroBuscado) {
                contador++;
                posicion = posicion + " - " + i;
                
            }
            
        }
        System.out.println("Encontrado...:" + contador);
        System.out.println("En....:" + posicion);
    }
    
}
