/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp02ex08;

import java.util.Scanner;

/**
 *
 * 
 * Gabriela Otilia Wandenkolk Monteiro
 * João Vitor Crivoi Cesar Souza
 * 
 * 8. Entrar via teclado com doze valores e armazená-los em uma matriz de ordem 3x4. Após a 
digitação dos valores solicitar uma constante multiplicativa, que deverá multiplicar cada 
valor matriz e armazenar o resultado em outra matriz de mesma ordem, nas posições 
correspondentes. Exibir as matrizes na tela, sob a forma matricial, ou seja, linhas por 
colunas. 
 */
public class TP02EX08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner scanner = new Scanner(System.in);
            
            double valores [][]= new double [3][4];
            
            double numeros [][] = new double [3][4];
            
           System.out.println("Digite doze valores: ");
            for(int i = 0; i <3; i++)
            {
                for(int j=0; j <4; j++)
                {
                     valores [i][j]=scanner.nextDouble();
                }
            }
            
            System.out.println("Digite a constante multiplicativa: ");
            double m = scanner.nextDouble();
            
            
            System.out.println("\n Os valores apos a multiplicação foram:\n");
            
            //for para exibir
               for(int i = 0; i <3; i++)
            {
                for(int j=0; j <4; j++)
                {
                      System.out.print("| "+(numeros[i][j] = (valores[i][j] *= m))+ " | ");
                     
                }
                
                System.out.println("\n");
               
            }
               
               
            scanner.close();
    }
}
   

