/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.conexao;

public class testcon {
    public static void main(String[] args) {
        conexao c = new conexao();
        if (c.conexao() != null) {
            System.out.println("Conexao feita com sucesso");
        } else {
            System.out.println("Erro ao conectar");
        }

    }
}

