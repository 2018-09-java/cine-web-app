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
                    <h2 class="film-title">`+ f.titolo +`</h2>
                    <img class="film-logo" src="`+ f.locandina +`" alt="film-logo">
                    <div class="film-info">
                        <span>Genere:</span>
                        <span>`+ f.genere +`</span>
                        <br>
                        <span>Durata:</span>
                        <span>`+ f.durata +`</span>
                        <p class="film-trama">
                            <span>Trama:</span>
                            <br>                    
                            <span>`+ f.trama +`</span>
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