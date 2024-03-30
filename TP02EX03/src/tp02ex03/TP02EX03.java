/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp02ex03;
import java.util.Scanner;

/**
 *
 * Gabriela Otilia Wandenkolk Monteiro
 * João Vitor Crivoi Cesar Souza
 * 
 * 3. Entrar via teclado com “N” valores quaisquer. O valor “N” (que representa a quantidade de
números) será digitado, deverá ser positivo, porém menor que vinte. Caso a quantidade não
satisfaça a restrição, enviar mensagem de erro e solicitar o valor novamente. Após a
digitação dos “N” valores, exibir:
a. O maior valor;
b. O menor valor;
c. A soma dos valores;
d. A média aritmética dos valores;
e. A porcentagem de valores que são positivos;
f. A porcentagem de valores negativos;
Após exibir os dados, perguntar ao usuário de deseja ou não uma nova execução do
programa. Consistir a resposta no sentido de aceitar somente “S” ou “N” e encerrar o
programa em função dessa resposta.

 */
public class TP02EX03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner scanner = new Scanner(System.in);

        char continuar = 'S';
        while (continuar == 'S') {
            int N;
            do {
                System.out.print("Digite a quantidade de valores (positivo e menor que 20): ");
                N = scanner.nextInt();
                if (N <= 0 || N >= 20) {
                    System.out.println("Erro: A quantidade de valores deve ser positiva e menor que 20. Tente novamente.");
                }
            } while (N <= 0 || N >= 20);

            double[] valores = new double[N];

            // Entrada de dados
            for (int i = 0; i < N; i++) {
                System.out.print("Digite o " + (i + 1) + "º valor: ");
                valores[i] = scanner.nextDouble();
            }

            // Calcular maior, menor, soma, média, positivos e negativos
            double maior = valores[0];
            double menor = valores[0];
            double soma = valores[0];
            int positivos = valores[0] > 0 ? 1 : 0;
            int negativos = valores[0] < 0 ? 1 : 0;

            for (int i = 1; i < N; i++) {
                if (valores[i] > maior) {
                    maior = valores[i];
                }
                if (valores[i] < menor) {
                    menor = valores[i];
                }
                soma += valores[i];
                if (valores[i] > 0) {
                    positivos++;
                } else if (valores[i] < 0) {
                    negativos++;
                }
            }
            double media = soma / N;

            // Exibir resultados
            System.out.println("\nMaior valor: " + maior);
            System.out.println("Menor valor: " + menor);
            System.out.println("Soma dos valores: " + soma);
            System.out.println("Média aritmética dos valores: " + media);
            System.out.println("Porcentagem de valores positivos: " + ((double)positivos / N) * 100 + "%");
            System.out.println("Porcentagem de valores negativos: " + ((double)negativos / N) * 100 + "%");

            // Perguntar se deseja continuar
            System.out.print("\nDeseja continuar (S/N)? ");
            continuar = scanner.next().toUpperCase().charAt(0);
        }

        scanner.close();
    }
}
 
