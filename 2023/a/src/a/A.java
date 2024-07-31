/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a;

/**
 *
 * @author Seiji
 */
import javax.swing.*;
public class A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        int[] numeros = new int[10];
        int[] pares = new int[20];
        int[] impares = new int[20];

        // Leitura dos 20 números e separação em pares e ímpares
        for (int i = 0, indicePares = 0, indiceImpares = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o número " + (i + 1)));

            if (numeros[i] % 2 == 0) {
                pares[indicePares++] = numeros[i];
            } else {
                impares[indiceImpares++] = numeros[i];
            }
        }

        // Impressão dos vetores
        System.out.print("Números originais: " +numeros);
       

        System.out.print("Números pares: " +pares);
       

        System.out.print("Números ímpares: " +impares);
        
    }



}



    

