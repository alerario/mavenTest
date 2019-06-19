/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.rest;

/**
 *
 * @author utfpr
 */
public class Cliente implements br.restinterface.ICliente {

    private String nome;

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cliente(String nome) {
        this.nome = nome;
    }
    
            
            
    
}
