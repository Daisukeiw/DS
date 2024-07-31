

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Seiji
 */
public class funcionaria_helena {
            public static void main(String args[]){
                
                Funcionario funcionario;
                funcionario = new Funcionario("Helena Reis", "28/01/1965", 4000.00, 1965);
                funcionario.CalcularIdade();
                funcionario.InformarSalario();
            }
            
}
