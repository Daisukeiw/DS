/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package desafiovetor5;

import javax.swing.JOptionPane;

/**
 *
 * @author Seiji
 */
public class Desafiovetor5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Exercicio com vetores
        // 5)

        // variáveis
        int num[] = new int [20];
        int p = 0;
        
        int pares [] = new int [20];
        int impares [] = new int [20];

        // Alocando valores no vetor
        String valnumeros = "Números originais: ";
        String valpares = "Números Pares lidos: ";
        String valimpares = "Números Impares lidos: ";
        for (int i = 0; i < num.length; i++) {
            p = i + 1;
            num[i] = Integer.parseInt (JOptionPane.showInputDialog("Digite o " + p + "º número"));
            
            valnumeros += num[i] +" ";
            
            if (num[i] % 2 == 0) {
                pares[i] = num[i];
                valpares += pares[i] +" ";
                
            } else {
                impares[i] = num[i];
                valimpares += impares[i] +" ";
            }
            
            
        }
            
            JOptionPane.showMessageDialog(null, valnumeros + 
                    "\n" +valpares 
                    +"\n" +valimpares);
           
    }
    }
    

