/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lampada;

/**
 *
 * @author Seiji
 */
public class Lampada {
    public static void main(String[] args){
        Lampada lampada = new Lampada();
        lampada.mostrarEstado();
    }

   public String estadoLampada = "aceso";
   
   public void mostrarEstado(){
       System.out.println(estadoLampada);
   }
}
