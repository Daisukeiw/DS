/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Seiji
 */
public class funcionario_mario {
        public static void main(String args[]){
                
                Funcionario funcionario;
                funcionario = new Funcionario("Mário Sá", "16/02/1970", 3000.00, 1970);
                funcionario.CalcularIdade();
                funcionario.InformarSalario();
            }
            
}

