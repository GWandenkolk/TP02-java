/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp02ex011;
import java.util.Scanner;

/**
 *
 * Gabriela Otilia Wandenkolk Monteiro
 * João Vitor Crivoi Cesar Souza
 * 
 * 11. Entrar com uma matriz de ordem MxM, onde a ordem também será escolhida pelo usuário, 
sendo que no máximo será de ordem 10 e quadrática. Após a digitação dos elementos, 
calcular e exibir determinante da matriz.
 */
public class TP02EX011 {

    /**
     * @param args the command line arguments
     */
       public static void imprimirMatriz(double[][] matriz) {
        for (double[] linha : matriz) {
            for (double numero : linha) {
                System.out.print("[" + numero + "]" + " ");
            }
            System.out.println();
        }
    }

    public static double calcularDeterminante(double[][] matriz) {
        int ordem = matriz.length;

        if (ordem != matriz[0].length) {
            // Se a matriz não for quadrada, o determinante não pode ser calculado
            return 0;
        }

        if (ordem == 1) {
            // Se a matriz for 1x1, o determinante é simplesmente o único elemento da matriz
            return matriz[0][0];
        }

        double determinante = 0;

        for (int i = 0; i < ordem; i++) {
            determinante += matriz[0][i] * cofator(matriz, 0, i);
        }

        return determinante;
    }

    public static double[][] submatriz(double[][] matriz, int exclui_linha, int exclui_coluna) {
        int ordem = matriz.length;
        double[][] submat = new double[ordem - 1][ordem - 1];
        int r = -1;
        for (int i = 0; i < ordem; i++) {
            if (i == exclui_linha)
                continue;
            r++;
            int c = -1;
            for (int j = 0; j < ordem; j++) {
                if (j == exclui_coluna)
                    continue;
                submat[r][++c] = matriz[i][j];
            }
        }
        return submat;
    }

    public static double cofator(double[][] matriz, int linha, int coluna) {
        return Math.pow(-1, linha + coluna) * calcularDeterminante(submatriz(matriz, linha, coluna));
    }

    public static void main(String[] args) {
        int ordem = 0;
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a ordem da matriz (máximo 10):");
        while ((ordem = ler.nextInt()) > 10 || ordem <= 0) {
            System.out.println("Valor não pode ser maior que 10 e menor ou igual a 0!");
        }

        double matrizP[][] = new double[ordem][ordem];
        System.out.println("\nDigite os valores para a matriz:\n\n");

        for (int i = 0; i < ordem; ++i) {
            for (int j = 0; j < ordem; j++) {
                System.out.println("[" + i + "][" + j + "]");
                matrizP[i][j] = ler.nextDouble();
            }
        }
        System.out.println("\nDeterminante da matriz: " + calcularDeterminante(matrizP));
    }
}