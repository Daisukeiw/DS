/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculohipo;

import static java.lang.Math.sqrt;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Calculohipo {
    //método para calcular e mostrar a hipotenusa
    static void hipotenusa(double c1, double c2){//criando variaveis para receber cateto1 e cateto2
        //calculo
        double hipo = Math.pow(c1, 2) + Math.pow(c2, 2);
        //mostrar o valor da hipotenusa sem elevado
        sqrt(hipo);
        //mostrar hipotenusa
        JOptionPane.showMessageDialog(null, "Sua hipotenusa é: " +sqrt(hipo));
        
    }
    public static void main(String[] args) {
        //inicialização de variaveis
        double cateto1, cateto2;
        //atribuindo valor as variáveis
        cateto1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro cateto: "));
        cateto2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo cateto: "));
        
        //chamando metodo e passando os valores nos parametros
        hipotenusa(cateto1, cateto2);
    }
}
