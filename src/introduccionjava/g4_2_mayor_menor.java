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
public class g4_2_mayor_menor {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String salir;
        do {
            IngresoPersona();
            System.out.println("¿Desea continuar? Si/No");
            salir = leer.nextLine();
            
        } while (salir.equalsIgnoreCase("si"));
        
        
        
        
    }
    public static void IngresoPersona(){
        Scanner leer = new Scanner(System.in);
        String ingreso="si";
                
        //do {
          System.out.println("Ingrese el nombre");
        String nombre = leer.nextLine();
        System.out.println("Ingrese la edad");
        int edad = leer.nextInt();
        System.out.println(nombre+ " tiene "+edad+" años");
        if (edad<18) {
            System.out.println(nombre+" es menor de edad");
            
        }else{
            System.out.println(nombre+" es mayor de edad");
        }  
    }
}
        
        /*            System.out.println("Desea ingresar otra persona? Si/No");
        ingreso = leer.next();
        } while (ingreso.equalsIgnoreCase("si"));
                
        
        
    }    
}*/