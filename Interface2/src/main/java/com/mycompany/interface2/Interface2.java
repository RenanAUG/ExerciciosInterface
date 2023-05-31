/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.interface2;

/**
 *
 * @author aluno
 */
public class Interface2 {

    public static void main(String[] args) {        
         int[] lista ={3, 2, 7, 5, 9};
                 
         Ordenavel numeros = new BubbleSort();
         numeros.ordenar(lista);
        
        for (int num : lista) {
        System.out.println(num + "");     
            
        }
    }
}
