/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp02ex05;
import java.util.Scanner;

/**
 *
 * 
 * Gabriela Otilia Wandenkolk Monteiro
 * João Vitor Crivoi Cesar Souza
 * 
 * 5. Armazenar seis valores em uma matriz de ordem 3x2. Apresentar os valores na tela.
 */
public class TP02EX05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner scanner = new Scanner(System.in);
            
            double valores [][]= new double [3][2];
            
           System.out.println("Digite seis valores: ");
            for(int i = 0; i <3; i++)
            {
                for(int j=0; j <2; j++)
                {
                     valores [i][j]=scanner.nextDouble();
                }
            }
            
            System.out.println("\n Os valores digitados foram:\n");
            
            
            
            //for para exibir
               for(int i = 0; i <3; i++)
            {
                for(int j=0; j <2; j++)
                {
                      System.out.println(valores[i][j]);
                     
                }
               
            }
            scanner.close();
    }
}
   