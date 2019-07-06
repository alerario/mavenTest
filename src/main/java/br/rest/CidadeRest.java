/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.rest;

import br.alerario.ICidade;
import br.data.entity.Cidade;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author alexandrelerario
 */
@Path("cidade")
public class CidadeRest {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of CidadeResource
     */
    public CidadeRest() {
    }

    /**
     * Retrieves representation of an instance of br.rest.CidadeResource
     *
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<Cidade> get() {
        return new br.data.crud.CrudCidade().getAll();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON) 
    @Path("/{id}")
    public Cidade get(@PathParam("id") int codigo) {
        List<Cidade> lcid = new br.data.crud.CrudCidade().getAll();
        Cidade cid = null;
        for (Cidade cida : lcid) {
            if (cida.getCodigo()==codigo) {
                cid=cida;
            }
        }
        return cid;
    }
    
    /**
     * PUT method for updating or creating an instance of CidadeResource
     * representation for the resource
     */
   /* @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void put(br.alerario.ICidade cidade) {
        System.out.println("##### Estou no put com objeto ######");
        new br.data.crud.CrudCidade().add((Cidade) cidade);
    }

    @PUT
    @Path("/string")
    @Consumes(MediaType.APPLICATION_JSON)
    public void put(String texto) {
        System.out.println(texto);
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            Cidade cid = objectMapper.readValue(texto, Cidade.class);
            new br.data.crud.CrudCidade().add((Cidade) cid);
        } catch (Exception e) {
            System.out.println("erro:::" + e.getMessage());
        }
    }
*/
    
     @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/{cod}/{nome}")
    public void post(@PathParam("cod") int cod, @PathParam("nome") String nome) {
        Cidade cid = new Cidade(cod, nome);
        new br.data.crud.CrudCidade().add(cid);
    }

    @POST    
    @Consumes(MediaType.APPLICATION_JSON)
    public void post(String cidade) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            
            Cidade cid = objectMapper.readValue(cidade, Cidade.class);
            new br.data.crud.CrudCidade().add(cid);
        } catch (IOException e) {

        }
    }
    
}
