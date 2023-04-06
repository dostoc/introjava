/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package introduccionjava;

import java.util.Scanner;

/**
 *
 * @author jonak
 */
public class g3_extra_8_division_con_restas_fun {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numeroMayor = 0;
        int numeroMenor = 0;
        
        
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese numero MAYOR");
        numeroMayor = leer.nextInt();
        System.out.println("Ingrese numero MENOR");
        numeroMenor = leer.nextInt();
        
        restar(numeroMayor,numeroMenor);
        
        
        
        
    }
    
    public static void restar(int num1, int  num2){
        int cociente = 0;
        int resto = 0;
        
        do {            
            
        if (num1 - num2 >= 0) {
            cociente++;
            num1 = num1 - num2;
            
        }else {
            resto = num1;
        }
        
        } while (num1 - num2 >= 0);
        
        System.out.println("Cociente: " + cociente + " Resto: " + resto);
    }
}
