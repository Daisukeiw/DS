/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c;

/**
 *
 * @author Seiji
 */
import java.util.Scanner;
public class C {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        // Tamanho das matrizes
        int linhaA, colunaA, linhaB, colunaB;

        System.out.println("Informe o tamanho da matriz A (linhas colunas): ");
        linhaA = ler.nextInt();
        colunaA = ler.nextInt();

        System.out.println("Informe o tamanho da matriz B (linhas colunas): ");
        linhaB = ler.nextInt();
        colunaB = ler.nextInt();

        // Verifica se as matrizes podem ser multiplicadas
        if (colunaA != linhaB) {
            System.out.println("As matrizes não podem ser multiplicadas.");
            return;
        }

        // Inicialização das matrizes
        int[][] matrizA = new int[linhaA][colunaA];
        int[][] matrizB = new int[linhaB][colunaB];
        int[][] matrizC = new int[linhaA][colunaB];

        // Preenchimento da matriz A
        System.out.println("Informe os elementos da matriz A:");
        for (int i = 0; i < linhaA; i++) {
            for (int j = 0; j < colunaA; j++) {
                System.out.printf("[%d][%d]: ", i, j);
                matrizA[i][j] = ler.nextInt();
            }
        }

        // Preenchimento da matriz B
        System.out.println("Informe os elementos da matriz B:");
        for (int i = 0; i < linhaB; i++) {
            for (int j = 0; j < colunaB; j++) {
                System.out.printf("[%d][%d]: ", i, j);
                matrizB[i][j] = ler.nextInt();
            }
        }

        // Multiplicação de matrizes
        for (int i = 0; i < linhaA; i++) {
            for (int j = 0; j < colunaB; j++) {
                int soma = 0;
                for (int k = 0; k < colunaA; k++) {
                    soma += matrizA[i][k] * matrizB[k][j];
                }
                matrizC[i][j] = soma;
            }
        }

        // Exibição da matriz resultante
        System.out.println("Matriz Resultante (A * B):");
        for (int i = 0; i < linhaA; i++) {
            for (int j = 0; j < colunaB; j++) {
                System.out.print(matrizC[i][j] + " ");
            }
            System.out.println();
        }

        ler.close();
    }
}


