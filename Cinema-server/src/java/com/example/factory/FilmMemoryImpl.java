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
public class FilmMemoryImpl{

    public static List<Film> getAll(String implementationType) {
        List<Film> films = new ArrayList<>();
        Film film = new Film.Builder()
                .setTitolo("Mission Impossible")
                .setDurata("120''")
                .setGenere("Azione, Thriller")
                .setTrama("Dapprima a immortalare l'incidente è stata una clip clandestina su YouTube e quindi il video ufficiale dell'incidente, commentato dallo stesso Cruise e dal cast del film al Graham Norton Show. Al solito autoironico e sorridente, Cruise ha agevolato un fermo immagine che chiarisce la dinamica della frattura, annunciando baldanzosamente la continuazione delle riprese. Nonostante i due mesi di stop la data di uscita di Mission: Impossible - Fallout è rimasta fissata per il 27 luglio 2018. Al pari di Jackie Chan, Tom non molla, sceglie di girare le scene d'azione in prima persona, più forte anche del tempo che avanza. E anziché abbassare l'asticella, l'attore aumenta i rischi, con uno stunt - si dice - mai tentato prima d'ora.")
                .setUrlLocandina("https://cdn1.thespacecinema.it/-/media/tsc/2018/06/6815missionimpossiblefallout/locandina2.jpg")
                .build();
        films.add(film);
        film = new Film.Builder()
                .setTitolo("Antman")
                .setDurata("90''")
                .setGenere("Fantascienza, Azione, Commedia")
                .setTrama("Scott Lang deve affrontare le conseguenze delle proprie scelte sia come supereroe sia come padre. Mentre è impegnato a gestire la sua vita familiare e le sue responsabilità come Ant-Man, si vede assegnare una nuova e urgente missione da Hope van Dyne e dal Dr. Hank Pym. Scott dovrà indossare ancora una volta la sua tuta e imparare a combattere al fianco di Wasp, mentre la squadra cercherà di far luce sui segreti del proprio passato.")
                .setUrlLocandina("https://cdn1.thespacecinema.it/-/media/tsc/2018/07/6853antmanandthewasp/locandina1.jpg")
                .build();
        films.add(film);
        film = new Film.Builder()
                .setTitolo("Resta con me")
                .setDurata("110''")
                .setGenere("Drammatico")
                .setTrama("La vera storia di Tami Oldham e del suo compagno Richard Sharp viene raccontata da Baltasar Kormàkur in un avvincente survival movie marittimo. La coppia di appassionati velisti partì per Tahiti, nel 1983, in una traversata oceanica che fu colpita da uno dei più catastrofici uragani di sempre. Dopo la tempesta, nel mezzo dell'Oceano Pacifico, Tami si sveglia a 1.500 miglia di distanza dalla costa, da sola e su un'imbarcazione quasi totalmente distrutta. Richard è gravemente ferito e Tami deve trovare la forza per salvare se stessa e l'unico uomo che abbia mai amato.")
                .setUrlLocandina("https://cdn1.thespacecinema.it/-/media/tsc/2018/07/6857restaconme/locandina.jpg")
                .build();
        films.add(film);
        film = new Film.Builder()
                .setTitolo("Gli incredibili 2")
                .setDurata("118''")
                .setGenere("Animazione")
                .setTrama("Helen viene scelta per condurre una campagna a favore del ritorno dei supereroi, mentre Bob deve gestire le imprese quotidiane di una vita “normale” a casa con Violetta, Flash e il piccolo Jack-Jack… i cui poteri stanno per essere scoperti. La loro missione viene però messa a repentaglio quando un nuovo nemico escogita un piano geniale e pericoloso che minaccia di distruggere ogni cosa. Ma i Parr non rifiutano mai una sfida, specialmente quando hanno Siberius al loro fianco. Ecco perché questa famiglia è così “incredibile”.")
                .setUrlLocandina("https://cdn1.thespacecinema.it/-/media/tsc/2018/07/6863gliincredibili2/locandina.jpg")
                .build();
        films.add(film);
        return films;
    }
}
