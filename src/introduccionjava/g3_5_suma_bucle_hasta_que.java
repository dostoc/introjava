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
public class g3_5_suma_bucle_hasta_que {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Limite de suma (TOPE)");
        int tope = leer.nextInt();
        boolean pasaTope = false;
        int suma = 0;
        int auxiliar;
        
        System.out.println("Ingrese valores hasta que la suma no supere el TOPE");
        do {
            auxiliar = leer.nextInt();
            if ((auxiliar + suma) <= tope) {
                suma = suma + auxiliar;                
            }else {pasaTope = true;}         
                    
        } while (!pasaTope);
        
        System.out.println("SUMATORIA...: " + suma);
        System.out.println("Valor fuera de rango...: " + auxiliar);
        System.out.println("Tope establecido...: " + tope);
        
        
    }
    
}
