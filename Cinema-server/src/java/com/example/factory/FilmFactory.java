/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.factory;

import com.example.models.Film;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Simone
 */
public class FilmFactory {

    public static final String MEMORY_IMPL = "memoryImpl";

    public static List<Film> getAll() {
        return getAll(MEMORY_IMPL);
    }

    public static List<Film> getAll(String implementationType) {
        if (implementationType.equals(MEMORY_IMPL)) {
            return FilmMemoryImpl.getAll(MEMORY_IMPL);
        } else {
            throw new IllegalArgumentException("Not implemented: " + implementationType + ".Use MEMORY_IMPL");
        }
    }
}
