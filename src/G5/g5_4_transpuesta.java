/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package G5;

/**
 *
 * @author Jona
 */
public class g5_4_transpuesta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [][] matrizA = new int[3][3];
        int [][] matrizB = new int[3][3];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizA[i][j] =(int)(Math.random()*10);
                
            }
        }
        System.out.println("ORIGINAL");
         imprimir(matrizA);
        
        System.out.println("Transpuesta");
         
        for (int j = 0; j < 3;j++) {              //ir de J a
            for (int i = 0; i < 3; i++) {
                matrizB[i][j] = matrizA[j][i];
            }
        }
            
         imprimir(matrizB);
        
         
         
        
    }
    
    
    
    // Pegar en programa -> imprimir(matriz)
    public static void imprimir(int[][] matriz) {
        String aux;
        for (int [] fila : matriz) {
            aux = "";
            for (int elemento: fila){
                aux += "   " + elemento;
            }
            System.out.println(aux);
        }
        
    
}

}