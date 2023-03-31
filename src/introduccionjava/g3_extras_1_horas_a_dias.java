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
public class g3_extras_1_horas_a_dias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese minutos:");
        int minutos = leer.nextInt();
        System.out.println(".........................................");
        
        int dias = (int)(minutos/(60*24));
        minutos = (minutos%(60*24));
        int horas = (int)(minutos/60);
        minutos = minutos%60;
        
        System.out.println(dias +" dias");
        System.out.println(horas +" horas");
        System.out.println(minutos +" minutos");
        
        
        
        
    }
    
}
