/*
Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y,
a medida que el usuario las va ingresando, construya una “sopa de letras para
niños” de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en 
orden horizontal en una fila que será seleccionada de manera aleatoria. 
Una vez concluida la ubicación de las palabras, rellene los espacios 
no utilizados con un número aleatorio del 0 al 9. Finalmente imprima 
por pantalla la sopa de letras creada.

Nota: Para resolver el ejercicio deberá investigar cómo se utilizan 
las siguientes funciones de Java substring(), Length() y Math.random().
*/
package G5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jonak
 */
public class g5_extra_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);

        int columnas = 20;
        int filas = 20;
        
        String[][] matriz = new String[filas][columnas];
        
        String palabra = "";
        
        int posicionH;
        int posicionV;
        int largoPalabra = 0;
        boolean libre = false;
       
        int cont = 1;
        
        //Relleno Inicial 
        matriz = rellenoInicial(matriz,filas,columnas);
        
        // Bucle 5 palabras
        for (int i = 0; i < 5; i++) {
            //Ingreso de palabra
            do {
                System.out.print("Palabra "+ cont + " (min: 3) (max: 5)...: ");
                palabra = leer.nextLine();
                largoPalabra = palabra.length();
            } while (largoPalabra<3 || largoPalabra>5);
      
            cont++;
            
            do {
                posicionV = ((int)(Math.random()*((filas+1)-largoPalabra)+1))-1;
                posicionH = ((int)(Math.random()*((filas+1)-largoPalabra)+1))-1;
                libre = espacioLibre(matriz, posicionV, posicionH, largoPalabra);
                if (libre) {
                    matriz = clavarPalabra(matriz, posicionV, posicionH, palabra);
                }
            } while (!libre);
            
        }
        
        matriz = relleno(matriz, filas, columnas);
        matImp(matriz, filas, columnas);
    }
    
    public static boolean espacioLibre(String[][] matriz,int posicionV,int posicionH, int largoPalabra){
        boolean espacioLibre = true;    
        for (int i = posicionH; i < (posicionH+largoPalabra); i++) {
                if (!(matriz[posicionV][i].equals("-"))) {
                    espacioLibre=false;
                }
            }
        return espacioLibre;
    }
    
    public static String[][] clavarPalabra(String[][] matriz,int posicionV,int posicionH, String palabra) {
        String palabraCarac;
        for (int i = posicionH; i < (palabra.length()+posicionH); i++) {
                palabraCarac = palabra.substring(i-posicionH, i-posicionH+1);
                matriz[posicionV][i] = palabraCarac;
        }
    return matriz;
    }
    
    public static String[][] relleno(String[][] matriz, int filas, int columnas){
        Random rnd = new Random();
        int aux = 9;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j].equals("-")) {
                    aux = rnd.nextInt(9);
                    matriz[i][j] = Integer.toString(aux);
                }
            }
        }
        return matriz;
    }
    
    public static void matImp(String[][] matriz, int filas, int columnas){
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("[" + matriz[i][j] + "] ");

            }
            System.out.println("");
        }
    }
    
    public static String[][] rellenoInicial(String[][] matriz, int filas, int columnas){
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j]="-";

            }
        }
    return matriz;    
    }
}
