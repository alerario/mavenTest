/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.jsf;

import br.data.Cidade;
import br.data.CrudCidade;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author alexandrelerario
 */
@Named(value = "jsfCidade")
@RequestScoped
public class JsfCidade {

    /**
     * Creates a new instance of JsfCidade
     */
    public JsfCidade() {
    }
    
    private int codigo;
    private String nome;
    
    
    
    public java.util.ArrayList<Cidade> getAll(){
        return new CrudCidade().getAll();
    }
    
    public void add(){
        Cidade cid = new Cidade();
        cid.setCodigo(codigo);
        cid.setNome(nome);
        new CrudCidade().add(cid);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
