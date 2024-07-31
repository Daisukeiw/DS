/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testalista;

/**
 *
 * @author Seiji
 */
import java.util.LinkedList;
import java.util.List;

public class TestaLista {

    public static void main(String[] args) {
        List a = new LinkedList();
        a.add( "um");
        a.add( "dois");
        a.add( "três");
        a.add( "um");
        List b = new LinkedList();
        b.add( "um");
        b.add( "um");
        b.add( "três");
        a.retainAll( b);
        
        System.out.println(a);
    }
}
