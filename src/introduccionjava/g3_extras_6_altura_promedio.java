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
public class g3_extras_6_altura_promedio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int cont160= 0;
        double promedio160 = 0;
        double promedio = 0;
        Scanner leer = new Scanner(System.in);
        System.out.print("Nro de personas....................: ");
        int cantP = leer.nextInt();
        
       for (int i = 0; i < cantP; i++) {
           System.out.print("Altura ................................: ");
           int altura = leer.nextInt();
           if (altura < 160) {
               cont160++;
               promedio160 = promedio160 + altura;
           }
           promedio = promedio + altura;
            
            
        }
        System.out.println("Promedio de altura de personas.........: " + promedio/cantP ); 
        System.out.println("Cantidad de personas de estatura baja..: " +cont160 ); 
        System.out.println("Promedio altura de personas bajas .....:" + promedio160/cont160 ); 
       
        
    }
   
}
