/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$(document).ready(function(){
                $("#enviar").click(function(){
                
                    $.ajax({
                        url:"actualizar",
                        method:'post',
                        data:{
                        nombre:$("#nombre").val()
                       
                    },
                    success:function(res){
                            
                      $("#respuesta").html(res);  
                  
                        }
                        
                    });
                });
            });

