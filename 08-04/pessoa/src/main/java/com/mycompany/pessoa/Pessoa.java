/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pessoa;

/**
 *
 * @author Seiji
 */
public class Pessoa {
    String nome = "Vitor";
    int idade = 16;
    String sexo = "Masculino";
    String faixa = "";
    
    
    
    public void classificar(){
        if(idade<=0){
            faixa = "recém nascido";
            System.out.println(faixa);
        }else if(idade<=2 && idade >0){
            faixa = "Bêbe";
            System.out.println(faixa);
        }else if(idade<=11 && idade >2){
            faixa = "Criança";
            System.out.println(faixa);
        }else if(idade<=19 && idade >11){
            faixa = "Adolescente";
            System.out.println(faixa);
        }else if(idade<=30 && idade >19){
            faixa = "Jovem";
            System.out.println(faixa);
        }else if(idade<=60 && idade >30){
            faixa = "Adulto";
            System.out.println(faixa);
        }else {
            faixa = "idoso";
            System.out.println(faixa);
        }
        
    }
    public void imprimir(){
        System.out.println("Nome: " +nome + "\n" + "Idade: "+ idade + "\n" +"Faixa de idade: "+ faixa);
    }
}
