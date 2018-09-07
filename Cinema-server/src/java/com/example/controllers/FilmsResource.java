/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.controllers;

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
@Path("Films")
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
        JSONObject rootObj = new JSONObject();
        JSONArray arr = new JSONArray();
        List<Film> films = new ArrayList<>();
        try {
            Film film = new Film.Builder()
                    .setTitolo("Mission Impossible")
                    .setDurata("120''")
                    .setGenere("Azione, Thriller")
                    .build();
            films.add(film);
            film = new Film.Builder()
                    .setTitolo("Antman")
                    .setDurata("90''")
                    .build();
            films.add(film);
            //out.print(film+":<br>"+film.getTitolo()+" ("+film.getDurata()+") - "+film.getGenere()+" - "+film.getTrama());
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
                    //obj.put("locandina", f.getLocandina());
                    arr.put(obj);
                }
        );
        rootObj.put("films", arr);
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
