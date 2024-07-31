/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.conta;

/**
 *
 * @author Seiji
 */
public class Conta {
    int NumeroDaConta = 1;
    float Saldo = 100;
    float Limite = 500;
            public void depositar(float quantia){
                if (quantia>0){
                    if (Saldo + quantia <= Limite){
                    Saldo += quantia;
                    System.out.println("Depósito de " + quantia + " realizado com sucesso.");
                    } else {
                        System.out.println("Valor de depósito inválido. Ultrapassa o limite da conta.");
                    }
                 } else {
                    System.out.println("Valor de depósito inválido. Por favor, insira um valor positivo.");
                }
                }

            public void saque(float quantia){
                if (quantia > 0 && Saldo - quantia >= Limite){
                Saldo -= quantia;
                System.out.println("Saque de " + quantia + " realizado com sucesso.");
                }else {
                    System.out.println("Valor de saque inválido. Ultrapassa o saldo disponível ou o limite da conta.");
                }
            }
            public void impExtrato(){
                System.out.println( "Número da conta " + NumeroDaConta +":" +"\n"+ 
                        "Seu saldo é: " +Saldo);
            }
            public void consultaSaldoDisponivel(){
                System.out.println("Saldo atual é de " + Saldo);
            }
                
    public static void main(String[] args) {
        Conta minhaConta; 
        minhaConta = new Conta();
            minhaConta.depositar(975.90f);
            minhaConta.saque(350f);
            minhaConta.consultaSaldoDisponivel();
            minhaConta.impExtrato();
    }
}
