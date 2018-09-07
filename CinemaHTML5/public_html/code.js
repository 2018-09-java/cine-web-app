/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
var code = {
    init: function () {
        //console.log("It works!");
        //$.get("https://api.github.com/users/2018-09-java")
        
        $.get("http://localhost:8090/Cinema-server/webresources/films")
                .done(code.onGetSuccessYeah)
                .fail(code.onErrorBoooh);
        
    },
    onGetSuccessYeah: function(data){
        console.log(data);
        $(".last-update").html("("+data.updated_at+")");
        code.writeFilmList(data.films);
    },
    onErrorBoooh : function(error){
        console.log(error);
    },
    writeFilmList : function(filmList)
    {
        for(var f of filmList)
        {
            var htmlStr= `<div class="film-card">
                    <h2 class="film-title">`+ f.titolo `</h2>
                    <img class="film-logo" src="https://cdn1.thespacecinema.it/-/media/tsc/2018/06/6815missionimpossiblefallout/locandina2.jpg" alt="film-logo">
                    <div class="film-info">
                        <span>Genere:</span>
                        <span>Azione - Thriller</span>
                        <br>
                        <span>Durata:</span>
                        <span>120''</span>
                        <p class="film-trama">
                            <span>Trama:</span>
                            <br>                    
                            <span>Dapprima a immortalare l'incidente è stata una clip clandestina su YouTube e quindi il video ufficiale dell'incidente, commentato dallo stesso Cruise e dal cast del film al Graham Norton Show. Al solito autoironico e sorridente, Cruise ha agevolato un fermo immagine che chiarisce la dinamica della frattura, annunciando baldanzosamente la continuazione delle riprese. Nonostante i due mesi di stop la data di uscita di Mission: Impossible - Fallout è rimasta fissata per il 27 luglio 2018. Al pari di Jackie Chan, Tom non molla, sceglie di girare le scene d'azione in prima persona, più forte anche del tempo che avanza. E anziché abbassare l'asticella, l'attore aumenta i rischi, con uno stunt - si dice - mai tentato prima d'ora.</span>
                        </p>
                    </div>
                    <br>
                    <div class="film-dates">
                        <div class="film-date">
                            <div>
                                <span>Ore: </span>
                                <span>20:00</span>
                            </div>
                            <div>
                                <span>Sala: </span>
                                <span>2</span>
                            </div>
                        </div>
                        <div class="film-date">
                            <div>
                                <span>Ore: </span>
                                <span>20:00</span>
                            </div>
                            <div>
                                <span>Sala: </span>
                                <span>2</span>
                            </div>
                        </div>
                        <div class="film-date">
                            <div>
                                <span>Ore: </span>
                                <span>20:00</span>
                            </div>
                            <div>
                                <span>Sala: </span>
                                <span>2</span>
                            </div>
                        </div>
                        <div class="film-date">
                            <div>
                                <span>Ore: </span>
                                <span>20:00</span>
                            </div>
                            <div>
                                <span>Sala: </span>
                                <span>2</span>
                            </div>
                        </div>
                    </div>
                </div>
                <br> `;
             $("#films-list").append(htmlStr);
        }
    }
};

$(document).ready(code.init);