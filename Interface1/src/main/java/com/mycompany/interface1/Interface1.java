/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.interface1;

/**
 *
 * @author aluno
 */
public class Interface1 {

    public static void main(String[] args) {
        Desenhavel triangulo = new Triangulo();
        Desenhavel circulo = new Circulo();
        Desenhavel retangulo = new Retangulo();
        
        triangulo.desenhar();
        circulo.desenhar();
        retangulo.desenhar();

    }
}
