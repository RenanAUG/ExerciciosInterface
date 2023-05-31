/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.interface3;

/**
 *
 * @author aluno
 */
public class Interface3 {

    public static void main(String[] args) {
        Armazenavel arquivos = new ArquivoCache();
        
        arquivos.carregar();
        arquivos.salvar();
    }
}
