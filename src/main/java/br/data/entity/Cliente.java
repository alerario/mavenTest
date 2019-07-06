/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.data.entity;

import br.alerario.ICidade;

/**
 *
 * @author alexandrelerario
 */
public class Cliente implements br.alerario.ICliente, java.io.Serializable{
    private int codigo;
    private String nome;
    private ICidade cidade;

    @Override
    public int getCodigo() {
        return codigo;
    }

    @Override
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public Cidade getCidade() {
        return (Cidade) cidade;
    }

    @Override
    public void setCidade(ICidade cid) {
        this.cidade = cidade;
    }

    public Cliente(int codigo, String nome, ICidade cidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.cidade = cidade;
    }

    public Cliente() {
    }

    
    
    
}
