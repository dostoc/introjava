/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package introduccionjava;

import java.util.Scanner;

/**
 Ejercicio 11
Escribir un programa que procese una secuencia de caracteres ingresada por teclado
* y terminada en punto, y luego codifique la palabra o frase ingresada de la siguiente
* manera: cada vocal se reemplaza por el carácter que se indica en la tabla y el resto
* de los caracteres (incluyendo a las vocales acentuadas) se mantienen sin cambios.

 */
public class g4_teoria_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String palabra;
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Palabra");
        
        palabra = leer.nextLine();
        String convertida = leepalabra(palabra);
        
        System.out.println(convertida);
         
        
    }
    
    public static String leepalabra(String palabra) {
    
        int cantcarac;
        String convertida = "";
        String auxiliar;
        
        cantcarac = palabra.length();
        
        
        for (int i = 0; i < cantcarac; i++) {
            auxiliar = palabra.substring(i,i+1);
            switch (auxiliar) {
                case "a":
                        auxiliar = "@";
                    break;
                case "e":
                        auxiliar = "#";
                    break;
                case "i":
                        auxiliar = "$";
                    break;
                case "o":
                        auxiliar = "%";
                    break;
                case "u":
                        auxiliar = "*";
                    break;
                default:
                    break;
                    //throw new AssertionError();
            }
           convertida = convertida.concat(auxiliar);
        }return convertida;
            
        }
}