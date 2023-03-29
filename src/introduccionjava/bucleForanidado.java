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
public class bucleForanidado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
             
        
        int numero1 = 0;
        int numero2 = 0;
        int numero3 = 0;
        int numero4 = 0;
        int print = 0;
        int auxiliar = 0;
        
        
        System.out.println("Ingrese valores :");
        
        for (int i = 0; i < 4; i++) {
            System.out.print(i+1 + ": ");
            do {
                auxiliar = leer.nextInt();
                if (auxiliar <0 || auxiliar>20) {
                    System.out.println("NO VALIDO, ingrese nuevamente...:");
                 }
            } while (auxiliar < 0 || auxiliar > 20);
           
            /*       
            if (i==0) {
                numero1 = auxiliar;
            } else if(i==1) {
                numero2 = auxiliar;
            } else if(i==2) {
                numero3 = auxiliar;
            } else if(i==3) {
                numero4 = auxiliar;
            }
            */
            
            switch (i) {
                case 0:
                    numero1 = auxiliar;
                    break;
                case 1:
                    numero2 = auxiliar;
                    break;
                case 2:
                    numero3 = auxiliar;
                    break;
                case 3:
                    numero4 = auxiliar;
                    break;
                default:
                    break;
            }
                   
            
            System.out.println("");
        }
        
        
         for (int i = 0; i < 4; i++) {
             switch (i) {
                   case 0:
                   print = numero1;
                   break;
                    case 1:
                    print = numero2;
                    break;
                    case 2:
                    print = numero3;
                    break;
                    case 3:
                    print = numero4;
                    break;
            }
             System.out.print(print + " : ");
             for (int j = 0; j < print; j++) {
                 System.out.print("*");
                 
             } System.out.println("");
             }
    }
}

            
        
               