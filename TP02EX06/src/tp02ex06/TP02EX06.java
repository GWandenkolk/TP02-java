/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp02ex06;

import java.util.Scanner;

/**
 *
 * Gabriela Otilia Wandenkolk Monteiro
 * João Vitor Crivoi Cesar Souza
 * 
 * 6. Armazenar seis nomes em uma matriz de ordem 2x3. Apresentar os nomes na tela.
 */
public class TP02EX06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
           Scanner scanner = new Scanner(System.in);
            
            String nomes [][]= new String [2][3];
            
           System.out.println("Digite seis nomes: ");
            for(int i = 0; i <2; i++)
            {
                for(int j=0; j <3; j++)
                {
                     nomes [i][j]=scanner.nextLine();
                }
            }
            
            System.out.println("\n Os nomes digitados foram:\n");
            
            
            
            //for para exibir
               for(int i = 0; i <2; i++)
            {
                for(int j=0; j <3; j++)
                {
                      System.out.println(nomes[i][j]);
                     
                }
               
            }
            scanner.close();
    }
}
   