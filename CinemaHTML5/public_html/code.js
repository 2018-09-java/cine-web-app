/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
var code = {
    init: function () {
        //console.log("It works!");
        $.get("https://api.github.com/users/2018-09-java")
                .done(code.onGetSuccessYeah)
                .fail(code.onErrorBoooh);
        
    },
    onGetSuccessYeah: function(data){
        console.log(data);
        $(".last-update").html("("+data.updated_at+")");
    },
    onErrorBoooh : function(error){
        console.log(error);
    },
    
};

$(document).ready(code.init);