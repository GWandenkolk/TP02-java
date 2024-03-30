/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp02ex2;
import java.util.Scanner;
/**
 *
 * Gabriela Otilia Wandenkolk Monteiro
 * João Vitor Crivoi Cesar Souza
 * 
 * 2. Entrar via teclado com dez valores positivos. Consistir a digitação e enviar mensagem de
erro, se necessário. Após a digitação, exibir:
a. O maior valor;
b. A soma dos valores;
c. A média aritmética dos valores.
 */
public class TP02EX2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        double[] valores = new double[10];

        // Entrada de dados e consistência
        for (int i = 0; i < 10; i++) {
            boolean valorValido = false;
            while (!valorValido) {
                System.out.print("Digite o " + (i + 1) + "º valor positivo: ");
                valores[i] = scanner.nextDouble();
                if (valores[i] >= 0) {
                    valorValido = true;
                } else {
                    System.out.println("Erro: O valor digitado não é positivo. Tente novamente.");
                }
            }
        }

        // Encontrar o maior valor
        double maiorValor = valores[0];
        for (int i = 1; i < 10; i++) {
            if (valores[i] > maiorValor) {
                maiorValor = valores[i];
            }
        }

        // Calcular a soma dos valores e encontrar a média
        double soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += valores[i];
        }
        double media = soma / 10;

        // Exibir os resultados
        System.out.println("\nMaior valor: " + maiorValor);
        System.out.println("Soma dos valores: " + soma);
        System.out.println("Média aritmética dos valores: " + media);

        scanner.close();
    }
}