/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication9;

/**
 *
 * @author Seiji
 */
import java.util.Scanner;
public class JavaApplication9 {

    public static void main(String[] args) {
    
        Scanner ler = new Scanner(System.in);
        int coluna1, linha1, coluna2, linha2;

        // Entrada de dados
        System.out.println("Informe o número de colunas da primeira matriz:");
        coluna1 = ler.nextInt();

        System.out.println("Informe o número de linhas da primeira matriz:");
        linha1 = ler.nextInt();

        System.out.println("Informe o número de colunas da segunda matriz:");
        coluna2 = ler.nextInt();

        System.out.println("Informe o número de linhas da segunda matriz:");
        linha2 = ler.nextInt();


        int[][] matriz1 = new int[coluna1][linha1];
        int[][] matriz2 = new int[coluna2][linha2];
        int[][] produto = new int[coluna1][linha2];
        int[][] soma = new int[Math.max(coluna1, coluna2)][Math.max(linha1, linha2)];
        int[][] subtracao = new int[Math.max(coluna1, coluna2)][Math.max(linha1, linha2)];

        // Preenchendo a primeira matriz
        System.out.println("Preencha a primeira matriz:");
        for (int i = 0; i < coluna1; i++) {
            for (int j = 0; j < linha1; j++) {
                System.out.printf("matriz1[%d][%d]: ", i, j);
                matriz1[i][j] = ler.nextInt();
            }
        }

        // Preenchendo a segunda matriz
        System.out.println("Preencha a segunda matriz:");
        for (int i = 0; i < coluna2; i++) {
            for (int j = 0; j < linha2; j++) {
                System.out.printf("matriz2[%d][%d]: ", i, j);
                matriz2[i][j] = ler.nextInt();
            }
        }

        // Multiplicando as matrizes de entrada
        for (int i = 0; i < coluna1; i++) {
            for (int j = 0; j < linha2; j++) {
                int sm = 0;
                for (int k = 0; k < coluna2; k++) {
                    sm += matriz1[i][k] * matriz2[k][j];
                }
                produto[i][j] = sm;
            }
        }

        // Soma de matrizes
        for (int i = 0; i < Math.max(coluna1, coluna2); i++) {
            for (int j = 0; j < Math.max(linha1, linha2); j++) {
                if (i < coluna1 && j < linha1) {
                    soma[i][j] += matriz1[i][j];
                }
                if (i < coluna2 && j < linha2) {
                    soma[i][j] += matriz2[i][j];
                }
            }
        }

        // Subtração de matrizes
        for (int i = 0; i < Math.max(coluna1, coluna2); i++) {
            for (int j = 0; j < Math.max(linha1, linha2); j++) {
                if (i < coluna1 && j < linha1) {
                    subtracao[i][j] += matriz1[i][j];
                }
                if (i < coluna2 && j < linha2) {
                    subtracao[i][j] -= matriz2[i][j];
                }
            }
        }

        // Exibindo as matrizes
        System.out.println("\nMatriz 1:");
        for (int i = 0; i < coluna1; i++) {
            for (int j = 0; j < linha1; j++) {
                System.out.printf("%d\t", matriz1[i][j]);
            }
            System.out.println();
        }

        System.out.println("\nMatriz 2:");
        for (int i = 0; i < coluna2; i++) {
            for (int j = 0; j < linha2; j++) {
                System.out.printf("%d\t", matriz2[i][j]);
            }
            System.out.println();
        }



        System.out.println("\nSoma das Matrizes:");
        for (int i = 0; i < Math.max(coluna1, coluna2); i++) {
            for (int j = 0; j < Math.max(linha1, linha2); j++) {
                System.out.printf("%d\t", soma[i][j]);
            }
            System.out.println();
        }
        
        System.out.println("\nSubtracao das Matrizes:");
        for (int i = 0; i < Math.max(coluna1, coluna2); i++) {
            for (int j = 0; j < Math.max(linha1, linha2); j++) {
                System.out.printf("%d\t", subtracao[i][j]);
            }
            System.out.println();
        }
        
         if (coluna1 != linha2) {
            System.out.println("As matrizes não podem ser multiplicadas. O número de colunas da primeira matriz deve ser igual ao número de linhas da segunda matriz.");
            System.exit(0);
        }
        
        // Multiplicando as matrizes de entrada
        for (int i = 0; i < coluna1; i++) {
            for (int j = 0; j < linha2; j++) {
                int sm = 0;
                for (int k = 0; k < coluna2; k++) {
                    sm += matriz1[i][k] * matriz2[k][j];
                }
                produto[i][j] = sm;
            }
        }
        
        System.out.println("\nProduto Matriz 1 * Matriz 2:");
        for (int i = 0; i < coluna1; i++) {
            for (int j = 0; j < linha2; j++) {
                System.out.printf("%d\t", produto[i][j]);
            }
            System.out.println();
        }
    }
}

