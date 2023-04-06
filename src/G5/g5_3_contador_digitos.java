/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package G5;

import java.util.Scanner;

/**
 *
 * @author Jona
 */
public class g5_3_contador_digitos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here3
        Scanner leer = new Scanner(System.in);
        
        int cantUno = 0;
        int cantDos = 0;
        int cantTres = 0;
        int cantCuatro = 0;
        int cantCinco = 0;
        int numN = 0;
        
        
        System.out.println("N numeros: ");
        numN = leer.nextInt();
       
        
       int[] vectorN = new int[numN];
       
        for (int i = 0; i < numN-1; i++) {
           vectorN[i]=(int)(Math.random()*100000);
        }
        
       
        for (int i = 0; i < numN-1; i++) {
            
            switch (cantDigitos(vectorN[i])) {
                case 1:
                    cantUno++;
                break;
               case 2:
                    cantDos++;
                break;
                case 3:
                    cantTres++;
                break;
                case 4:
                    cantCuatro++;
                break;
                case 5:
                    cantCinco++;
                break;
            }
                   
            
        }
        System.out.println("Numeros con..:  1 digito  :" + cantUno );
        System.out.println("Numeros con..:  2 digitos :" + cantDos );
        System.out.println("Numeros con..:  3 digitos :" + cantTres );
        System.out.println("Numeros con..:  4 digitos :" + cantCuatro);
        System.out.println("Numeros con..:  5 digitos :" + cantCinco );
        
    }
    public static int  cantDigitos(int numeroVector) {
        int cantDigitos = 0;
        for (int i = 0; i < 10; i++) {
            cantDigitos++;
            numeroVector = (int)(numeroVector/10);
            if (numeroVector<1) {
                break;
            }
        }
        return cantDigitos;
    }
    
    
}
