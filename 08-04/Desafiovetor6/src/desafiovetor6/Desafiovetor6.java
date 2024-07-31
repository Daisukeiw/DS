/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package desafiovetor6;

import javax.swing.JOptionPane;

/**
 *
 * @author Seiji
 */
public class Desafiovetor6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Exercicio com vetores
        // 5)

        // Número de alunos
        int numAlunos = 10;
        // Vetor para armazenar as médias de cada aluno
        float[] medias = new float[numAlunos];
        // Contador de alunos com média maior ou igual a 7.0
        int countAprovados = 0;
        
        // Loop para cada aluno
        for (int aluno = 0; aluno < numAlunos; aluno++) {
            float total = 0;
            // Loop para cada nota (4 notas por aluno)
            for (int nota = 0; nota < 4; nota++) {
                // Pede a nota e acumula no total
                int numNota = nota + 1;
                float valorNota = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota " + numNota + " do aluno " + (aluno + 1)));
                total += valorNota;
            }
            // Calcula a média do aluno
            medias[aluno] = total / 4;

            // Verifica se a média é maior ou igual a 7.0 e incrementa o contador
            if (medias[aluno] >= 7.0) {
                countAprovados++;
            }
        }

        // Mostra as médias de cada aluno
        for (int aluno = 0; aluno < numAlunos; aluno++) {
            int numNota = aluno + 1;
            JOptionPane.showMessageDialog(null, "Média do aluno " + numNota + ": " + medias[aluno]);
        }

        // Mostra o número de alunos aprovados
        JOptionPane.showMessageDialog(null, "Número de alunos com média maior ou igual a 7.0: " + countAprovados);
    }
    
}
