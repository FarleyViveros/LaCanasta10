 var token = localStorage.getItem('token_id');
         if(token===null){
             $.toast({
                    heading: 'Seguridad',
                    text: "No tiene permiso de Ingresar",
                    position: 'top-right',
                    icon: 'error',
                    afterShown: function () {
                       var url = 'index.jsp';
                        window.location.href = url;
                    }
                });
             
         }
         else{
            var obj = jQuery.parseJSON(token);
            $(".usuarionombre").text(obj.nombre); 
             if(obj.tipo==="0"){
                 $(".admin").show();
             }
             else{
                  $(".admin").hide();
             }
         }
         
  buscarsolicitudPedido();       

let timerId = setInterval(() =>  buscarsolicitudPedido(), 5000);


    function buscarsolicitudPedido(){
        var url = "postbuscarsolicitudypedidos.jsp";
    $.ajax({
        url: url,
        type: "POST",
        data: {},
        contentType: "application/x-www-form-urlencoded",
        success: function (response) {
            var objresponse = jQuery.parseJSON(response);              
            var solicitud=objresponse.solicitud;
            var pedido=objresponse.pedido;
            console.log(objresponse);
               
              $(".spnpedido").html(pedido+"+");
              $(".spnsolicitud").html(solicitud);
        },
        error: function (xmlHttpRequest, textStatus, errorThrow) {

        }
    });
    }
    
    $(document).on("click","#alertsDropdown",function(){
       var url = "postlistapedidosRegistrados.jsp";
            $.ajax({
                url: url,
                type: "POST",
                data: {},
                contentType: "application/x-www-form-urlencoded",
                success: function (response) {
                    var texto = response.trim();
                    var lista = texto.substring(0, texto.length - 1);
                    var objpedidos = jQuery.parseJSON("["+lista+"]");  
                    var tabla="";            
                    var total=objpedidos.length;
                    console.log(objpedidos);
                    tabla+=`<h6 class="dropdown-header">
                                    Pedidos Registrados
                                </h6>`;
                   $.each(objpedidos, function( index, value ) {
                       tabla+=`<a class="dropdown-item d-flex align-items-center" href="pedidos.jsp">
                                    <div class="mr-3">
                                        <div class="icon-circle bg-warning">
                                            <i class="fas fa-file-alt text-white"></i>
                                        </div>
                                    </div>
                                    <div>
                                        <div class="small text-gray-500">`+moment(value.fecha).format("DD-MM-YYYY hh:mm a")+`</div>
                                        <span class="font-weight-bold">Mesa : `+value.nombremesa+` <br> Mozo : `+value.nombreatiende+` `+value.apellidosatiende+`</span>
                                    </div>
                                </a>`;
                      });
                      tabla+=` <a class="dropdown-item text-center small text-gray-500" href="pedidos.jsp">Ver Todos</a>`;
                      if(objpedidos.length===0){
                          tabla=`<h6 class="dropdown-header">
                                    Pedidos Registrados
                                </h6><a class="dropdown-item d-flex align-items-center" href="pedidos.jsp">
                                    <div class="mr-3">
                                        <div class="icon-circle bg-primary">
                                            <i class="fas fa-exclamation-triangle text-white"></i>
                                        </div>
                                    </div>
                                    <div>
                                        <div class="small text-gray-500">`+moment().format("DD-MM-YYYY hh:mm a")+`</div>
                                        <span class="font-weight-bold">Sin Registros</span>
                                    </div>
                                </a>`;
                      }
                      $(".listapedidosActivos").html(tabla);

                },
                error: function (xmlHttpRequest, textStatus, errorThrow) {

                }
            }); 
        
    });
    
    $(document).on("click","#messagesDropdown",function(){
       var url = "postlistasolicitudesRegistrados.jsp";
            $.ajax({
                url: url,
                type: "POST",
                data: {},
                contentType: "application/x-www-form-urlencoded",
                success: function (response) {
                    var texto = response.trim();
                    var lista = texto.substring(0, texto.length - 1);
                    var objsolicitudes = jQuery.parseJSON("["+lista+"]");  
                    var tabla="";            
                    var total=objsolicitudes.length;
                    console.log(objsolicitudes);
                    tabla+=`<h6 class="dropdown-header">
                                   Solicitudes Registradas por Aprobar
                                </h6>`;
                   $.each(objsolicitudes, function( index, value ) {
                       tabla+=`<a class="dropdown-item d-flex align-items-center" href="solicitudLista.jsp">
                                    <div class="dropdown-list-image mr-3">
                                        <img class="rounded-circle" src="plantilla/img/undraw_profile_1.svg"
                                            alt="...">
                                        <div class="status-indicator bg-success"></div>
                                    </div>
                                    <div class="font-weight-bold">
                                        <div class="text-truncate">`+moment(value.fecha).format("DD-MM-YYYY hh:mm a")+`</div>
                                        <div class="small text-gray-500">Registrado por : `+value.usureg+`</div>
                                    </div>
                                </a>`;
                      });
                      tabla+=`<a class="dropdown-item text-center small text-gray-500" href="solicitudLista.jsp">Ver todos</a>`;
                      if(objsolicitudes.length===0){
                          tabla=` <h6 class="dropdown-header">
                                   Solicitudes Registradas por Aprobar
                                </h6>
                                <a class="dropdown-item d-flex align-items-center" href="#">
                                    <div class="dropdown-list-image mr-3">
                                        <img class="rounded-circle" src="plantilla/img/undraw_profile_1.svg"
                                            alt="...">
                                        <div class="status-indicator bg-warning"></div>
                                    </div>
                                    <div class="font-weight-bold">
                                        <div class="text-truncate">No Hay Registros</div>
                                    </div>
                                </a>`;
                      }
                      $(".listasolicitudesReg").html(tabla);

                },
                error: function (xmlHttpRequest, textStatus, errorThrow) {

                }
            }); 
        
    });