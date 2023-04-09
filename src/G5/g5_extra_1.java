import java.util.Scanner;


public class g5_extra_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese valores de la matriz");
        int tam = leer.nextInt();

        int[][] matriz = new int[tam][tam];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("Valor [" + i + "]" + "[" + j + "]  : ");
                matriz[i][j] = leer.nextInt();
            }

        }
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                suma = suma + matriz[i][j];
            }
        }
        System.out.println("La sumta total es " + suma);
        imprimir(matriz);



    }

    public static void imprimir(int[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("[" + matriz[i][j] + "]");

            }
            System.out.println("");

        }
    }

}
