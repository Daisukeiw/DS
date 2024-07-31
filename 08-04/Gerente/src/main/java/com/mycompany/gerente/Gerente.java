/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gerente;

/**
 *
 * @author Seiji
 */
import javax.swing.*;

public class Gerente {
float salario = 1000;
float salarioFinal10 = 0;
float salarioFinalVariavel = 0;

float dezPorcento = 0;
float valorPorcentagem = 0;
float porcentagemVariavel = 0;
float aumentoVariavel = 0;

    public void aumento10(){
      dezPorcento =  (float) (salario * 0.1);
      salarioFinal10 = salario + dezPorcento;
      JOptionPane.showMessageDialog(null,"Salário após os 10% é: " + salarioFinal10);
        
    }
    public void aumentoVariavel(){
    valorPorcentagem = Float.parseFloat(JOptionPane.showInputDialog("Digite a porcentagem para o aumento."));
    
    porcentagemVariavel = valorPorcentagem / 100;
    
    aumentoVariavel = salario * porcentagemVariavel;
    salarioFinalVariavel = salario + aumentoVariavel;
    
    
    JOptionPane.showMessageDialog(null,"Salário após os " +valorPorcentagem + "% " + " é: " + salarioFinalVariavel);
    
}
    public static void main(String args[]){
        Gerente aumento;
        aumento = new Gerente();
        aumento.aumento10();
        aumento.aumentoVariavel();
    }
}
