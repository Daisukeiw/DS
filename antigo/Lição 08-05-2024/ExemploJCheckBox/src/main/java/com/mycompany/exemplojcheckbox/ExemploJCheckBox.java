/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplojcheckbox;

/**
 *
 * @author Admin
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ExemploJCheckBox extends JFrame {
    JCheckBox primeira,segunda,terceira,quarta,quinta;
    JLabel vazio;
    
    public ExemploJCheckBox(){
        super("Exemplo JCheckBox");
        Container tela = getContentPane();
        setLayout(null);
        JLabel rotulo = new JLabel("Quais seus fastfoods favoritos? ");
        
        rotulo.setBounds(40, 30, 200, 20);
        primeira = new JCheckBox("McDonalds");
        primeira.setMnemonic(KeyEvent.VK_J);
        primeira.setBounds(20,60,100,20);
        
        segunda = new JCheckBox("Burger King");
        segunda.setMnemonic(KeyEvent.VK_C);
        segunda.setBounds(120,60,100,20);
        
        terceira = new JCheckBox("Subway");
        terceira.setMnemonic(KeyEvent.VK_D);
        terceira.setBounds(225,60,100,20);
        
        quarta = new JCheckBox("Madero");
        quarta.setMnemonic(KeyEvent.VK_V);
        quarta.setBounds(325,60,100,20);
        
        quinta = new JCheckBox("Jerônimo");
        quinta.setMnemonic(KeyEvent.VK_P);
        quinta.setBounds(425,60,100,20);
        
        JButton botao = new JButton("Exibir");
        botao.setBounds(200, 150, 100, 20);
        vazio = new JLabel("");
        primeira.setSelected(false);//inicia a caixa da seleção marcada
        primeira.setForeground(new Color(255, 199, 44));//alterando a cor da letra do mcdonalds
        segunda.setForeground(Color.red);
        terceira.setForeground(Color.green);
        quarta.setForeground(Color.black);
        quinta.setForeground(Color.orange);
        
        vazio.setBounds(100,200,600,20);
        
        botao.addActionListener(
                new ActionListener() {
        public void actionPerformed(ActionEvent e) {
        String escolhas = "";
        if (primeira.isSelected() == true) {
            escolhas = escolhas + primeira.getText();
        }
        if (segunda.isSelected() == true) {
            escolhas = escolhas + " " + segunda.getText();
        }
        if (terceira.isSelected() ==true) {
            escolhas = escolhas + " " + terceira.getText();
        }
        if (quarta.isSelected() ==true) {
            escolhas = escolhas + " " + quarta.getText();
        }
        if (quinta.isSelected() == true) {
            escolhas = escolhas + " " + quinta.getText();
        }
        vazio.setText("Você escolheu: " + escolhas);
    }
});

tela.add(rotulo);
tela.add(primeira);
tela.add(segunda);
tela.add(terceira);
tela.add(quarta);
tela.add(quinta);
tela.add(botao);
tela.add(vazio);
setSize(600, 300);
setLocationRelativeTo(null);
setVisible(true);
        
        
    
    }
    public static void main(String[] args) {
        ExemploJCheckBox app = new ExemploJCheckBox();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
 
