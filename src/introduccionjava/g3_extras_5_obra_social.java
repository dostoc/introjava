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
public class g3_extras_5_obra_social {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String tipoSocio;
        double costoTratamiento = 0;
        double descTratamiento = 0;
        System.out.println("Descuentos segun abono A(50%) - B(35%) - C");
        System.out.print("Ingrese tipo socio..:");
        
        do {
            tipoSocio = leer.next();
        } while (!(tipoSocio.equalsIgnoreCase("a") ||
                   tipoSocio.equalsIgnoreCase("b") ||
                   tipoSocio.equalsIgnoreCase("c")));
        
        System.out.print("Costo del tratamiento...:  $ ");
        costoTratamiento = leer.nextDouble();
        
        switch (tipoSocio.toUpperCase()) {
            case "A":
                descTratamiento = costoTratamiento - costoTratamiento*0.5;
                break;
                
            case "B":
                descTratamiento = costoTratamiento - costoTratamiento*0.35;
                break;
                
            case "C": // da lo mismo pero como para que se entienda...
                descTratamiento = costoTratamiento;
                break;
        }
        
        System.out.println("Total con descuento....: $" + descTratamiento);
        
        
    }
    
}
