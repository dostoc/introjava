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
public class swich {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Ingrese el tipo de boma que necesita");
        System.out.println("(1) Agua (2) Gasolina (3) Hormigon (4) Alimentos");
        Scanner leer = new Scanner(System.in);
        int tipoMotor = leer.nextInt();
        switch  (tipoMotor) {
            case 1:
                System.out.println("La boma de agua");
                break;
            case 2:
                    System.out.println("La boma de gasolina");
                break;
            case 3:
                    System.out.println("La boma de hormigon");
                break;
            case 4:
                    System.out.println("La boma de alimentos");
                break;
            default:
                System.out.println("No tengo de esas");
        }
    }
    
}


