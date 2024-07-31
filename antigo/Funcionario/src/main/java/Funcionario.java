/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */



/**
 *
 * @author Seiji
 */
public class Funcionario {
        public String nome;
        public String nasc;
        public double salario;
        private int ano;
        public int idadeatual;
        
        public Funcionario(String n, String na, double s, int year){
            nome = n;
            nasc = na;
            salario = s;
            ano = year;
        }
        public void InformarSalario(){
            System.out.println("Seu salário é: " +salario);
        }
        public void CalcularIdade(){
            idadeatual = 2024-ano;
            System.out.println("Sua idade é: " +idadeatual);
        }
        
}
