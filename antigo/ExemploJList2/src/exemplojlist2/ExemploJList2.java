/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ExemploJList2 extends JFrame {
        JList lista;
        JList lista2;
        String cidades[] = {"Rio de Janeiro", "São Paulo", "Minas Gerais", "Paraná", "Bahia", "Pernambuco", "Acre", "Espírito Santo"};
        JButton exibir;
        JLabel rotulo;

public ExemploJList2(){
 
    super("Exemplo de List"); 
    Container tela = getContentPane(); 
    setLayout(null);
 
exibir = new JButton("Exibir"); 
lista = new JList(cidades); 
rotulo = new JLabel();
lista.setVisibleRowCount(5);


lista2 = new JList(cidades); 
lista2.setVisibleRowCount(5);
 
JScrollPane painelRolagem = new JScrollPane(lista);
JScrollPane painelRolagem2 = new JScrollPane(lista2);
 
lista.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
lista2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
 
painelRolagem.setBounds(40,50,150,100);
painelRolagem2.setBounds(40,200,150,100);
rotulo.setBounds(40,300,200,30);
 
exibir.setBounds(270,50,100,30); exibir.addActionListener(
    new ActionListener(){ 
        public void actionPerformed(ActionEvent e){
            
        rotulo.setText("O estado é: "+lista2.getSelectedValue().toString());
        
        Object selecionados[] = lista.getSelectedValues();
 
        String resultados = "Valores selecionados:\n";
 
        for(int i=0;i<selecionados.length;i++)
 
        resultados += selecionados[i].toString()+"\n";
 
        JOptionPane.showMessageDialog(null, resultados);
 
} });
 
tela.add(painelRolagem);

tela.add(painelRolagem2);
 
tela.add(exibir);

tela.add(rotulo);
 
setSize(800, 550);
 
setVisible(true);
        }
 
public static void main(String args[]){
 
ExemploJList2 app = new ExemploJList2();
 
app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
}
}


