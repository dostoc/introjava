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
public class g3_extra_5_obraSocial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String tipoCliente;
        double total =0;
        double totalDescuento = 0;
        double desc = 0;
        
        System.out.println("A(50%) - B(35%) - C(cuack)" );
        tipoCliente = leer.next();
        tipoCliente = tipoCliente.toUpperCase();
        
        System.out.println("Costo Tratamiento: ");
        total = leer.nextFloat();
        
        switch (tipoCliente) {
            case "A":
                totalDescuento = total - total*0.5;
                break;
            case "B":
                totalDescuento = total - total*0.35;
                break;
            case "C":
                totalDescuento = total;
                break;
        }
        
        System.out.println("Tipo cliente : " + tipoCliente);
        System.out.println("Total c/descuento: " + totalDescuento);
        
        
    }
    
}
