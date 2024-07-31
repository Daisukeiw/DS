/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package b;

/**
 *
 * @author Seiji
 */
import java.util.Scanner;

public class B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       

        Scanner ler = new Scanner(System.in);
        int coluna = 0;
        int linha = 0;
        int i, j, k, sm, d1, d2, smd;
        int dp1 = 0;
        int ds1 = 0;
        int dp2 = 0;
        int ds2 = 0;
        int dp3 = 0;
        int ds3 = 0;
        int totaldiagonal1 = 0;
        int totaldiagonal2 = 0;
        int totaldiagonal3 = 0;

        int[][] soma = new int[40][40];
        int[][] sub = new int[40][40];
        int[][] matriz1 = new int[40][40];
        int[][] matriz2 = new int[40][40];
        int[][] matriz3 = new int[40][40];

        // Entrada de dados
        System.out.println("Informe a quantidade de colunas:");
        coluna = ler.nextInt();

        System.out.println("Informe a quantidade de linhas:");
        linha = ler.nextInt();

        // Preenchendo a primeira matriz
        System.out.printf("1a. Matriz\n");
        for (i = 0; i < coluna; i++) {
            System.out.printf("Informe os elementos da %da. linha:\n", (i + 1));
            for (j = 0; j < linha; j++) {
                System.out.printf("a [%d] [%d] = ", i, j);
                matriz1[i][j] = ler.nextInt();
            }
            System.out.printf("\n");
        }

        // Preenchendo a segunda matriz
        System.out.printf("2a. Matriz\n");
        for (i = 0; i < coluna; i++) {
            System.out.printf("Informe os elementos da %da. linha:\n", (i + 1));
            for (j = 0; j < linha; j++) {
                System.out.printf("b [%d] [%d] = ", i, j);
                matriz2[i][j] = ler.nextInt();
            }
            System.out.printf("\n");
        }

        // Multiplicando as matrizes de entrada
        for (i = 0; i < coluna; i++) {
            for (j = 0; j < linha; j++) {
                sm = 0;
                for (k = 0; k < coluna; k++) {
                    sm += matriz1[i][k] * matriz2[k][j];
                }
                matriz3[i][j] = sm;
            }
        }

        // Saída das linhas da primeira matriz
        System.out.printf("\n1a. Matriz\n");
        for (i = 0; i < coluna; i++) {
            System.out.printf("%da. linha: ", (i + 1));
            for (j = 0; j < linha; j++) {
                System.out.printf("%d\t", matriz1[i][j]);
            }
            System.out.printf("\n");
        }

        // Saída das linhas da segunda matriz
        System.out.printf("\n2a. Matriz\n");
        for (i = 0; i < coluna; i++) {
            System.out.printf("%da. linha: ", (i + 1));
            for (j = 0; j < linha; j++) {
                System.out.printf("%d\t", matriz2[i][j]);
            }
            System.out.printf("\n");
        }

        // Saída do produto das matrizes A*B
        System.out.printf("\nProduto Matriz 1 * Matriz 2\n");
        for (i = 0; i < coluna; i++) {
            System.out.printf("%da. linha: ", (i + 1));
            for (j = 0; j < linha; j++) {
                System.out.printf("%d\t", matriz3[i][j]);
            }
            System.out.printf("\n");
        }

        // Soma diagonal matriz 1
        for (i = 0; i < coluna; i++) {
            dp1 += matriz1[i][i];
        }
        j = 1;
        for (i = 0; i < coluna; i++) {
            ds1 += matriz1[i][j];
            j--;
        }

        totaldiagonal1 = ds1 + dp1;

        System.out.printf("\nSoma das diagonais matriz 1\n");
        System.out.printf("O valor da diagonal principal é: " + dp1 + "\n");
        System.out.printf("O valor da diagonal secundária é: " + ds1 + "\n");
        System.out.printf("O total das diagonais é: " + totaldiagonal1 + "\n");

        // Soma diagonal matriz 2
        for (i = 0; i < coluna; i++) {
            dp2 += matriz2[i][i];
        }
        j = 1;
        for (i = 0; i < coluna; i++) {
            ds2 += matriz2[i][j];
            j--;
        }

        totaldiagonal2 = ds2 + dp2;

        System.out.printf("\nSoma das diagonais matriz 2\n");
        System.out.printf("O valor da diagonal principal é: " + dp2 + "\n");
        System.out.printf("O valor da diagonal secundária é: " + ds2 + "\n");
        System.out.printf("O total das diagonais é: " + totaldiagonal2 + "\n");

        // Soma diagonal matriz 3
        for (i = 0; i < coluna; i++) {
            dp3 += matriz3[i][i];
        }
        j = 1;
        for (i = 0; i < coluna; i++) {
            ds3 += matriz3[i][j];
            j--;
        }

        totaldiagonal3 = ds3 + dp3;

        // Saída de dados
        System.out.printf("\nSoma das diagonais da matriz 3\n");
        System.out.printf("O valor da diagonal principal é: " + dp3 + "\n");
        System.out.printf("O valor da diagonal secundária é: " + ds3 + "\n");
        System.out.printf("O total das diagonais é: " + totaldiagonal3 + "\n");

        // Soma de matriz
        // Soma
        for (i = 0; i < coluna; i++) {
            for (j = 0; j < linha; j++) {
                sm = matriz1[i][j] + matriz2[i][j];
                soma[i][j] = sm;
            }
        }

        // Saída de dados
        System.out.printf("\nSoma das matrizes\n");
        for (i = 0; i < coluna; i++) {
            System.out.printf("%da. linha: ", (i + 1));
            for (j = 0; j < linha; j++) {
                System.out.printf("%d\t", soma[i][j]);
            }
            System.out.printf("\n");
        }

        // Subtração
        for (i = 0; i < coluna; i++) {
            for (j = 0; j < linha; j++) {
                sm = matriz1[i][j] - matriz2[i][j];
                sub[i][j] = sm;
            }
        }

        // Saída de dados
        System.out.printf("\nSubtração das matrizes\n");
        for (i = 0; i < coluna; i++) {
            System.out.printf("%da. linha: ", (i + 1));
            for (j = 0; j < linha; j++) {
                System.out.printf("%d\t", sub[i][j]);
            }
            System.out.printf("\n");
        }
    }
}
