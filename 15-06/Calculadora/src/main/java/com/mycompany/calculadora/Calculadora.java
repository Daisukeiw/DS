/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora;
 
//imports
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 
public class Calculadora extends JFrame{
    //cria as variáveis para as caixas de texto, botões e os rótulos
    JLabel rotulo1, rotulo2, exibir;
    JTextField texto1, texto2;
    JButton somar, subtrair, multiplicar, dividir;
    
    //método construtor
    public Calculadora(){
        super("Calculadora");
        Container tela = getContentPane();
        setLayout(null);
        
        rotulo1 = new JLabel("1º Número: ");
        rotulo2 = new JLabel("2º Número: ");
        texto1 = new JTextField(5);
        texto2 = new JTextField(5);
        
        exibir = new JLabel("");
        somar = new JButton("Somar");
        subtrair = new JButton("Subtrair");
        multiplicar = new JButton("Multiplicar");
        dividir = new JButton("Dividir");
        
        //coloca as coordenadas dos rótulos, dos campos para escrever e o resultado das operações
        rotulo1.setBounds(50, 20, 100, 20);
        rotulo2.setBounds(50, 60, 100, 20);
        texto1.setBounds(120, 20, 200, 20);
        texto2.setBounds(120, 60, 200, 20);
        exibir.setBounds(50, 160, 200, 20);
        
        //coloca as coordenadas dos botões
        somar.setBounds(90, 100, 100, 20);
        subtrair.setBounds(200, 100, 100, 20);
        multiplicar.setBounds(90, 130, 100, 20);
        dividir.setBounds(200, 130, 100, 20);
        
        //adiciona uma ação ao botão
        somar.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        float n1, n2, soma;
                        soma = 0;
                        n1 = Float.parseFloat(texto1.getText());
                        n2 = Float.parseFloat(texto2.getText());
                        soma = n1 + n2;
                        exibir.setVisible(true);
                        exibir.setText("A soma é: " + soma);
                    }
                }
        );
        //adiciona uma ação ao botão
        subtrair.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        float n1, n2, subtracao;
                        subtracao = 0;
                        n1 = Float.parseFloat(texto1.getText());
                        n2 = Float.parseFloat(texto2.getText());
                        subtracao = n1 - n2;
                        exibir.setVisible(true);
                        exibir.setText("A subtração é: " + subtracao);
                    }
                }
        );
        //adiciona uma ação ao botão
        multiplicar.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        float n1, n2, multiplicacao;
                        multiplicacao = 0;
                        n1 = Float.parseFloat(texto1.getText());
                        n2 = Float.parseFloat(texto2.getText());
                        multiplicacao = n1 * n2;
                        exibir.setVisible(true);
                        exibir.setText("A multiplicação é: " + multiplicacao);
                    }
                }
        );
        //adiciona uma ação ao botão
        dividir.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        float n1, n2, divisao;
                        divisao = 0;
                        n1 = Float.parseFloat(texto1.getText());
                        n2 = Float.parseFloat(texto2.getText());
                        divisao = n1 / n2;
                        exibir.setVisible(true);
                        exibir.setText("A divisão é: " + divisao);
                    }
                }
        );
        
        //o texto dos botões não ficarão visíveis até apertar eles
        exibir.setVisible(false);
        
        //adiciona a tela tudo
        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(texto1);
        tela.add(texto2);
        tela.add(exibir);
        tela.add(somar);
        tela.add(subtrair);
        tela.add(multiplicar);
        tela.add(dividir);
        
        //Tamanho da tela
        setSize(400, 250);
        setVisible(true);
    }
    public static void main(String[] args) {
        Calculadora app = new Calculadora();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}