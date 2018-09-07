/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.controllers;

import com.example.factory.FilmFactory;
import com.example.models.Film;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import org.json.JSONArray;
import org.json.JSONObject;
import java.util.ArrayList;
import java.util.List;

/**
 * REST Web Service
 *
 * @author Simone
 */
@Path("films")
public class FilmsResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of FilmsResource
     */
    public FilmsResource() {
    }

    /**
     * Retrieves representation of an instance of
     * com.example.controllers.FilmsResource
     *
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
    public String getJson() {
        /*
        try {
            
            JSONObject rootObj = new JSONObject();
            JSONArray arr = new JSONArray(FilmFactory.getAll());
        } catch (IllegalArgumentException e) {
            //response.setStatus(500);
            throw new WebApplicationException(Response.Status.INTERNAL_SERVER_ERROR);
        }
        
        films.forEach(
                f -> {
                    JSONObject obj = new JSONObject();
                    obj.put("titolo", f.getTitolo());
                    obj.put("durata", f.getDurata());
                    obj.put("genere", f.getGenere());
                    obj.put("trama", f.getTrama());
                    obj.put("locandina", f.getUrlLocandina());
                    arr.put(obj);
                }
        );
         */
        JSONObject rootObj = new JSONObject();
        JSONArray list = new JSONArray(FilmFactory.getAll());
        rootObj.put("films", list);
        return rootObj.toString();
    }

    /**
     * PUT method for updating or creating an instance of FilmsResource
     *
     * @param content representation for the resource
     */
    @PUT
    @Consumes(javax.ws.rs.core.MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}
