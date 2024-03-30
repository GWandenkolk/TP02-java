/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp02ex010;
import java.util.Scanner;

/**
 *
 * Gabriela Otilia Wandenkolk Monteiro
 * João Vitor Crivoi Cesar Souza
 * 
 * 10. Entrar com uma matriz de ordem MxM, onde a ordem também será escolhida pelo usuário, 
sendo que no máximo será de ordem 10 e quadrática. Após a digitação dos elementos, 
calcular e exibir a matriz inversa. Exibir as matrizes na tela, sob a forma matricial (linhas x 
colunas). 
 */
public class TP02EX010 {

    /**
     * @param args the command line arguments
     */
   // public static void main(String[] args) {
        // TODO code application logic here
        
        public static void imprimirMatriz(double[][]matriz){
      for(double[] linha: matriz){
          for(double numero: linha){
              System.out.print("["+ numero +"]"+ " ");
          }
          System.out.println();
      }
    }
    
    public static double[][] calcularInversa(double[][] matriz) {
        int ordem = matriz.length;
        double[][] matrizExtendida = new double[ordem][2 * ordem];

        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                matrizExtendida[i][j] = matriz[i][j];
                matrizExtendida[i][j + ordem] = (i == j) ? 1 : 0;
            }
        }

        for (int i = 0; i < ordem; i++) {
         
            double aux = matrizExtendida[i][i];
            for (int j = 0; j < 2 * ordem; j++) {
                matrizExtendida[i][j] /= aux;
            }
            for (int k = 0; k < ordem; k++) {
                if (k != i) {
                    double coeficiente = matrizExtendida[k][i];
                    for (int j = 0; j < 2 * ordem; j++) {
                        matrizExtendida[k][j] -= coeficiente * matrizExtendida[i][j];
                    }
                }
            }
        }
        double[][] inversa = new double[ordem][ordem];
        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                inversa[i][j] = matrizExtendida[i][j + ordem];
            }
        }

        return inversa;
    }
    
      
    public static void main(String[] args) {
        int ordem=0;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite a ordem da matriz:");
        while((ordem=ler.nextInt())>10 || ordem<=0 ){
            System.out.println("Valor não pode ser maior que 10 e menor ou igual a 0!");
        }
        
        
        double matrizP[][] = new double [ordem][ordem];
        System.out.println("\nDigite os valores para a matriz:\n\n");
        
        for(int i=0; i<ordem;++i){
            for(int j=0;j<ordem; j++){
                System.out.println("["+i+"]["+j+"]");
                matrizP[i][j] = ler.nextDouble();
            }
        }
       
        
        double[][] inversa = calcularInversa(matrizP);
        if (inversa != null) {
            System.out.println("\n\nMatriz original: \n");
            imprimirMatriz(matrizP);
            System.out.println("\nMatriz inversa: \n ");
            imprimirMatriz(inversa);
        }
    }
    
}
