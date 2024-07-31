/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exemplojlist1;

/**
 *
 * @author Seiji
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ExemploJList1 extends JFrame{
    
    JList lista;
    String cidades[] = {"Rio de Janeiro", "São Paulo", "Minas gerais", "Espírito Santo","Bahia","Pernambuco","Rio Grande do Sul","Acre"};
    JButton exibir;
    JLabel rotulo;
    
    public ExemploJList1(){
        
        super("Exemplo de List");
        Container tela = getContentPane();
        setLayout(null);
        
        exibir = new JButton("Exibir");
        rotulo = new JLabel("");
        
        lista = new JList(cidades);
        lista.setVisibleRowCount(5);
        JScrollPane painelRolagem = new JScrollPane(lista);
        lista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        painelRolagem.setBounds(40,50,150,100);
        
        exibir.setBounds(270,50,100,30);
        rotulo.setBounds(50,150,200,30);
        
        exibir.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                rotulo.setText("O estado é: "+lista.getSelectedValue().toString());
                }
            }
        );
        
        tela.add(painelRolagem);
        tela.add(exibir);
        tela.add(rotulo);
        setSize(400,250);
        setVisible(true);
        setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
       ExemploJList1 app = new ExemploJList1();
       app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}

