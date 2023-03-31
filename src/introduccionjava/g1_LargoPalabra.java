/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package introduccionjava;

import java.util.Scanner;

/**
 Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java.
 */
public class g1_LargoPalabra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        String palabra = null;
        do {
            System.out.print("Palabra..:");
            palabra = leer.nextLine();
            if (palabra.equals("xxx")) {
                System.out.println("Saliendo ...");
                break;            }
            System.out.println("CantCarac: " + palabra.length());
        } while (!palabra.equals("xxx"));
        
      
    }
    
}
