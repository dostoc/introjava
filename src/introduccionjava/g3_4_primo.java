package introduccionjava;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author jonak
 */
public class g3_4_primo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numero = leer.nextInt();

        System.out.print("El numero ingresado ");
        if (esprimo(numero)) {
            System.out.println("ES PRIMO");
        } else {
            System.out.println("NO ES PRIMO");
        }

    }

    public static boolean esprimo(int numero) {
        boolean esprimo = true;

        for (int i = 2; i < numero-1; i++) {
            if ((numero % i) == 0) {
                esprimo = false;
                break;
            }
            break;
        }
        return esprimo;
    }
}
