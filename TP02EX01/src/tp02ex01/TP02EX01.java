/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp02ex01;
import java.util.Scanner;

/**
 *
 * Gabriela Otilia Wandenkolk Monteiro
 * João Vitor Crivoi Cesar Souza
 * 
 * 1. Entrar com dois valores via teclado, onde o segundo valor deverá ser maior que o primeiro.
Caso contrário solicitar novamente apenas o segundo valor. 
 */
public class TP02EX01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double valor1, valor2;
        
         System.out.print("Digite o primeiro valor: ");
            valor1 = scanner.nextDouble();


        while (true) {
           

            System.out.print("Digite o segundo valor (maior que o primeiro): ");
            valor2 = scanner.nextDouble();

            if (valor2 > valor1) {
                break;
            } else {
                System.out.println("O segundo valor precisa ser maior que o primeiro. Tente novamente.");
            }
        }

        System.out.println("Valores inseridos: " + valor1 + " e " + valor2);
        scanner.close();
    }
}

    
