/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp02ex09;

import java.util.Scanner;

/**
 *
 * Gabriela Otilia Wandenkolk Monteiro
 * João Vitor Crivoi Cesar Souza
 * 
 * 9. Entrar com uma matriz de ordem MxN, onde a ordem também será escolhida pelo usuário, 
sendo que no máximo 10x10. A matriz não precisa ser quadrática. Após a digitação dos 
elementos, calcular e exibir a matriz transposta.
 */
public class TP02EX09 {

    /**
     * @param args the command line arguments
     */
  //  public static void main(String[] args) {
        

 public static void imprimirMatriz(double[][]matriz){
      for(double[] linha: matriz){
          for(double numero: linha){
              System.out.print("["+ numero +"]"+ " ");
          }
          System.out.println();
      }
    }
      
    public static void main(String[] args) {
        int linha = 0, coluna = 0 ;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o tamanho da linha da matriz:");
        while((linha=ler.nextInt())>10){
            System.out.println("Valor não pode ser maior que 10!");
        }
        
        System.out.println("Digite o tamanho da coluna da matriz:");
        while((coluna=ler.nextInt())>10){
            System.out.println("Valor não pode ser maior que 10!");
        }
        
        double matrizP[][] = new double [linha][coluna];
        System.out.println("\nDigite os valores para a matriz:\n\n");
        
        for(int i=0; i<linha;++i){
            for(int j=0;j<coluna; j++){
                System.out.println("["+i+"]["+j+"]");
                matrizP[i][j] = ler.nextDouble();
            }
        }
        double transpostaP[][] = new double [coluna][linha];
          
        for(int i=0; i<linha;++i){
            for(int j=0;j<coluna; j++){
                transpostaP[j][i] = matrizP[i][j];
            }
        }
        
         System.out.println("\n\nMatriz original: \n");
        imprimirMatriz(matrizP);
        System.out.println("\nMatriz transposta: \n ");
        imprimirMatriz(transpostaP);
        
    }
}