/*
Realizar un programa que complete un vector con los N primeros números 
de la sucesión de Fibonacci. Recordar que la sucesión de Fibonacci es 
la sucesión de los siguientes números:
1, 1, 2, 3, 5, 8, 13, 21, 34, ...
Donde cada uno de los números se calcula sumando los dos anteriores a él. 
Por ejemplo:
La sucesión del número 2 se calcula sumando (1+1)
Análogamente, la sucesión del número 3 es (1+2),
Y la del 5 es (2+3),
Y así sucesivamente…
La sucesión de Fibonacci se puede formalizar de acuerdo a la siguiente fórmula:
Fibonaccin = Fibonaccin-1 + Fibonaccin-2 para todo n>1
Fibonaccin = 1 para todo n<=1
Por lo tanto, si queremos calcular el término “n” debemos escribir 
una función que reciba como parámetro el valor de “n” y que calcule 
la serie hasta llegar a ese valor.
Para conocer más acerca de la serie de Fibonacci consultar el 
siguiente link: https://quantdare.com/numeros-de-fibonacci/
 */
package G5;

import java.util.Scanner;

/**
 *
 * @author jonak
 */
public class g5_extra_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese N num Fibo");
        int numero = leer.nextInt();
        int[] vector = new int[numero];

        serieFibo(vector, numero);
        imprimir(vector);
        

    }

    public static int[] serieFibo(int[] vector, int numero) {
        int aux1 = 0;
        int aux2 = 1;
        int aux3;
        int cont = 1;

        if (numero == 1) {
            vector[0] = 0;
        } else {
            vector[0]= 0;
            do {
                aux3 = aux1 + aux2;
                aux1 = aux2;
                aux2 = aux3;
                
                vector[cont] = aux3;
                
                cont++;

            } while (cont < numero);

        }
        return vector;
    }
    
    public static void imprimir(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print("[" + vector[i] + "]");
            
        }
        System.out.println("");
    }
}
