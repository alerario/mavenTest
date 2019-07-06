/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.data.crud;

import br.data.entity.Cidade;

/**
 *
 * @author alexandrelerario
 */
public class CrudCidade {

    private static java.util.ArrayList<Cidade> lcid = new java.util.ArrayList<>(); ;

    public CrudCidade() {
         
    }

    public java.util.ArrayList<Cidade> getAll(){
        return lcid;
    }
    
    public void add(Cidade cid){
        lcid.add(cid);
    }
}
