/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.diferenca;

import javax.swing.JOptionPane;

/**
 *
 * @author Seiji
 */
public class conta {
    public void Dados(){
        double valor1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor real:" ));
        double valor2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor real:"));
        
        subtracao(valor1, valor2);
}
    public void subtracao(double a, double b) {
        double diferenca;
        
        if (a > b) {
            diferenca =  a - b;
            JOptionPane.showMessageDialog(null,  a + ">" + b);
            JOptionPane.showMessageDialog(null,"A diferença do maior para o menor é: " + diferenca);
        } else if (b >  a) {
            diferenca = b -  a;
            JOptionPane.showMessageDialog(null,  a + "<" + b);
            JOptionPane.showMessageDialog(null, "A diferença do maior para o menor é: " + diferenca);
        } else {
            JOptionPane.showMessageDialog(null, "Os valores são iguais, portanto a diferença é 0.");
        }
    }
}
