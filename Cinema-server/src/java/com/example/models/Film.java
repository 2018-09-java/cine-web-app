/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.models;

import java.security.InvalidParameterException;

/**
 *
 * @author Simone
 */
public class Film {

    private String titolo;
    private String genere;
    private String durata;
    private String trama;
    private String urlLocandina;
    
    private Film (){}

    /**
     * @return the titolo
     */
    public String getTitolo() {
        return titolo;
    }

    /**
     * @return the genere
     */
    public String getGenere() {
        return genere;
    }

    /**
     * @return the durata
     */
    public String getDurata() {
        return durata;
    }

    /**
     * @return the trama
     */
    public String getTrama() {
        return trama;
    }
    
    /**
     * @return the urlLocandina
     */
    public String getUrlLocandina() {
        return urlLocandina;
    }

    public static class Builder {
        private String titolo = "Unknown";
        private String genere = "Unknown";
        private String durata = "Unknown";
        private String trama = "Unknown";
        private String urlLocandina = "Unknown";
        
        public Builder setTitolo (String titolo){
            this.titolo = titolo;
            return this;
        }
        public Builder setGenere (String genere){
            this.genere = genere;
            return this;
        }
        public Builder setDurata (String durata){
            this.durata = durata;
            return this;
        }
        public Builder setTrama (String trama){
            this.trama = trama;
            return this;
        }
        
        /**
         * @param urlLocandina the urlLocandina to set
         */
        public Builder setUrlLocandina(String urlLocandina) {
            this.urlLocandina = urlLocandina;
            return this;
        }
        
        public Film build () {
            if((titolo.equals("Unknown") && 
                    !durata.equals("Unknown"))
                    ||
                    (durata.equals("Unknown") && 
                    !titolo.equals("Unknown")))
                throw new InvalidParameterException("Title or duration not setted. Please set a title and duration.");
            Film film = new Film ();
            film.durata = this.durata;
            film.genere = this.genere;
            film.titolo = this.titolo;
            film.trama = this.trama;
            film.urlLocandina = this.urlLocandina;
            return film;
        }
    }
}
