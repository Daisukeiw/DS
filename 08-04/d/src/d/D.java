/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package d;

/**
 *
 * @author Seiji
 */
 import java.util.Scanner;

public class D {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número de linhas da primeira matriz:");
        int linhasA = scanner.nextInt();

        System.out.println("Digite o número de colunas da primeira matriz:");
        int colunasA = scanner.nextInt();

        System.out.println("Digite o número de linhas da segunda matriz:");
        int linhasB = scanner.nextInt();

        System.out.println("Digite o número de colunas da segunda matriz:");
        int colunasB = scanner.nextInt();

        if (colunasA != linhasB) {
            System.out.println("As matrizes não podem ser multiplicadas. O número de colunas da primeira matriz deve ser igual ao número de linhas da segunda matriz.");
            System.exit(0);
        }

        // Leitura das matrizes
        int[][] matrizA = new int[linhasA][colunasA];
        int[][] matrizB = new int[linhasB][colunasB];

        System.out.println("Digite os elementos da primeira matriz:");
        for (int i = 0; i < linhasA; i++) {
            for (int j = 0; j < colunasA; j++) {
                System.out.print("matrizA[" + i + "][" + j + "]: ");
                matrizA[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Digite os elementos da segunda matriz:");
        for (int i = 0; i < linhasB; i++) {
            for (int j = 0; j < colunasB; j++) {
                System.out.print("matrizB[" + i + "][" + j + "]: ");
                matrizB[i][j] = scanner.nextInt();
            }
        }

        // Exibição das matrizes
        System.out.println("\nMatriz A");
        for (int i = 0; i < linhasA; i++) {
            for (int j = 0; j < colunasA; j++) {
                System.out.printf("%d\t", matrizA[i][j]);
            }
            System.out.println();
        }

        System.out.println("\nMatriz B");
        for (int i = 0; i < linhasB; i++) {
            for (int j = 0; j < colunasB; j++) {
                System.out.printf("%d\t", matrizB[i][j]);
            }
            System.out.println();
        }

        // Soma das matrizes
        int[][] resultadoSoma = new int[linhasA][colunasA];
        System.out.println("\nResultado da Soma");
        for (int i = 0; i < linhasA; i++) {
            for (int j = 0; j < colunasA; j++) {
                resultadoSoma[i][j] = matrizA[i][j] + matrizB[i][j];
                System.out.printf("%d\t", resultadoSoma[i][j]);
            }
            System.out.println();
        }

        // Subtração das matrizes
        int[][] resultadoSubtracao = new int[linhasA][colunasA];
        System.out.println("\nResultado da Subtração");
        for (int i = 0; i < linhasA; i++) {
            for (int j = 0; j < colunasA; j++) {
                resultadoSubtracao[i][j] = matrizA[i][j] - matrizB[i][j];
                System.out.printf("%d\t", resultadoSubtracao[i][j]);
            }
            System.out.println();
        }

        // Multiplicação das matrizes
        int[][] resultadoMultiplicacao = new int[linhasA][colunasB];
        System.out.println("\nResultado da Multiplicação");
        for (int i = 0; i < linhasA; i++) {
            for (int j = 0; j < colunasB; j++) {
                for (int k = 0; k < colunasA; k++) {
                    resultadoMultiplicacao[i][j] += matrizA[i][k] * matrizB[k][j];
                }
                System.out.printf("%d\t", resultadoMultiplicacao[i][j]);
            }
            System.out.println();
        }

        // Transposição da matriz A
        int[][] matrizTranspostaA = new int[colunasA][linhasA];
        System.out.println("\nTransposta da 1a. Matriz");
        for (int i = 0; i < colunasA; i++) {
            for (int j = 0; j < linhasA; j++) {
                matrizTranspostaA[i][j] = matrizA[j][i];
                System.out.printf("%d\t", matrizTranspostaA[i][j]);
            }
            System.out.println();
        }

        // Transposição da matriz B
        int[][] matrizTranspostaB = new int[colunasB][linhasB];
        System.out.println("\nTransposta da 2a. Matriz");
        for (int i = 0; i < colunasB; i++) {
            for (int j = 0; j < linhasB; j++) {
                matrizTranspostaB[i][j] = matrizB[j][i];
                System.out.printf("%d\t", matrizTranspostaB[i][j]);
            }
            System.out.println();
        }

        scanner.close();
    }
}
