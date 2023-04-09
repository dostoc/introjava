/*
Los profesores del curso de programación de Egg necesitan llevar 
un registro de las notas adquiridas por sus 10 alumnos para luego 
obtener una cantidad de aprobados y desaprobados. Durante el período
de cursado cada alumno obtiene 4 notas, 2 por trabajos prácticos 
evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en 
el arreglo. Al final del programa los profesores necesitan obtener 
por pantalla la cantidad de aprobados y desaprobados, teniendo en 
cuenta que solo aprueban los alumnos con promedio mayor o igual 
al 7 de sus notas del curso.


 */
package G5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jonak
 */
public class g5_extra_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int filas = 10;
        int columnas = 5;
        double[][] matriz = new double[filas][columnas];
        Random rand = new Random();
        

        matriz = ingresNotas(matriz,filas,columnas);
        aprobados(matriz,filas,columnas);
        matImp(matriz,filas,columnas);
       
        
        
        
        
        

    }

    public static double[][] ingresNotas(double[][] matriz,int filas,int columnas) {
        Scanner leer = new Scanner(System.in);
        Random rand = new Random();
        
        double total = 0;
        for (int i = 0; i < filas; i++) {
            System.out.println("Notas Alumno Nr:" + (i + 1));
            total = 0;
            for (int j = 0; j < columnas; j++) {
                switch (j) {
                    case 0:
                        System.out.print("Practico Nro 1:");
                        matriz[i][j] = rand.nextDouble()*10+1;
                        //matriz[i][j] = leer.nextDouble();
                        total = total + (matriz[i][j] * 0.1);
                        break;
                    case 1:
                        System.out.print("Practico Nro 2:");
                        matriz[i][j] = rand.nextDouble()*10+1;
                        //matriz[i][j] = leer.nextDouble();
                        total = total + (matriz[i][j] * 0.15);

                        break;
                    case 2:
                        System.out.print("Integrador   1:");
                        matriz[i][j] = rand.nextDouble()*10+1;
                        //matriz[i][j] = leer.nextDouble();
                        total = total + (matriz[i][j] * 0.25);
                        break;
                    case 3:
                        System.out.print("Integrador   2:");
                        matriz[i][j] = rand.nextDouble()*10+1;
                        //matriz[i][j] = leer.nextDouble();
                        total = total + (matriz[i][j] * 0.50);
                        break;
                    case 4:
                        System.out.println("TOTAL OBTENIDO: " + total);
                        matriz[i][4] = total;
                        break;
                }

            }
            System.out.println("");
        }
        return matriz;
    }
    public static void aprobados(double[][] matriz,int filas, int columnas) {
        int aprobado = 0;
        int desaprobado = 0;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (j==columnas-1) {
                    if (matriz[i][j]>=7){
                        aprobado++;
                    }else {
                        desaprobado++;
                          }
                    }
                }
        
            }
        System.out.println("APROBADOS....: " + aprobado);
        System.out.println("DESAPROBADOS.: " + desaprobado);
        }
    
    public static void matImp(double[][] matriz, int filas, int columnas){
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("[" + matriz[i][j] + "] ");

            }
            System.out.println("");
        }
    }
    
    }


