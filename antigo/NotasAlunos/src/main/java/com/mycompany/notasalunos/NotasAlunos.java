/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.notasalunos;

import javax.swing.JOptionPane;

/**
 *
 * @author Seiji
 */
public class NotasAlunos {
    private String nome;
    private double nota1;
    private double nota2;
    
    public NotasAlunos() {
        this("", 0.0, 0.0);
    }
    public NotasAlunos(String nome, double nota1, double nota2){
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the nota1
     */
    public double getNota1() {
        return nota1;
    }

    /**
     * @param nota1 the nota1 to set
     */
    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    /**
     * @return the nota2
     */
    public double getNota2() {
        return nota2;
    }

    /**
     * @param nota2 the nota2 to set
     */
    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    
    
    public void LerNota() {
        String nome = JOptionPane.showInputDialog("Digite o nome do aluno: ");
        setNome(nome);
        
        nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota: "));
        setNota1(nota1);
        
        nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota: "));
        setNota2(nota2);
        
        JOptionPane.showMessageDialog(null, nome);
        
        calcularMedia(nota1, nota2);
    }
    
    public void calcularMedia(double n1, double n2){
    double media = (n1+n2)/2;
    
    if (media>=7){
        JOptionPane.showMessageDialog(null, "Aprovado " +media);
    }else if (media<7){
        JOptionPane.showMessageDialog(null, "Reprovado " +media);
    }
                    
                    
    
}
    
    
    
    public static void main(String[] args) {
        NotasAlunos notasalunos;
        notasalunos = new NotasAlunos();
        notasalunos.LerNota();
    }
}
