/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.controllers;

import com.example.models.Film;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author Simone
 */
public class Films extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/json;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            JSONObject rootObj = new JSONObject();
            /*
            obj.put("titolo","Mission Impossible");
            obj.put("genere","Azione, Thriller");
            obj.put("durata","120''");
            obj.put("trama","Blablablablablablablablablablablablabla");
            */
            //out.print("{}") ////sto inizializzando un oggetto json (in javascript è un oggetto valido)
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
            }
            catch (InvalidParameterException e){
                response.setStatus(500);
            }
            films.forEach(
                    f -> {JSONObject obj = new JSONObject();
                    obj.put("titolo", f.getTitolo());
                    obj.put("Durata", f.getDurata());
                    obj.put("Genere", f.getGenere());
                    obj.put("Trama", f.getTrama());
                    arr.put(obj);
                    }
            );
            rootObj.put("films", arr);
            out.print(rootObj);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
