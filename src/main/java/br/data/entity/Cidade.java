/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.data.entity;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author alexandrelerario
 */
@XmlRootElement(name="Cidade")
public class Cidade implements br.alerario.ICidade, java.io.Serializable{
    private int codigo;
    private String nome;

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

    public Cidade() {
    }

    public Cidade(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }
    
    
}
