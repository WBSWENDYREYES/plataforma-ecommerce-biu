<%-- --%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <jsp:include page="/WEB-INF/paginas/comunes/headMeta.jsp"/>
        <title>Editar Usuario</title>
    </head>
    <body>
        <!-- Cabecero -->
        <jsp:include page="/WEB-INF/paginas/comunes/cabecero.jsp"/>

        <form action="${pageContext.request.contextPath}/ServletControlador?action=modificar&idCliente=${cliente.idCliente}"
              method="POST" class="was-validated">
            
            <jsp:include page="/WEB-INF/paginas/comunes/botonesNavEdicion.jsp"/>

            <section id="details">
                <div class="container">
                    <div class="row">
                        <div class="col">
                            <div class="card">
                                <div class="card-header">
                                    <h4>Editar Cliente</h4>
                                </div>
                                <div class="card-body">
                                    <div class="form-group">
                                        <label for="nombre">Nombre</label>
                                        <input type="text" class="form-control" name="nombre" required value="${usuario.nombre}"/>
                                    </div>
                                    <div class="form-group">
                                        <label for="apellido">Direccion</label>
                                        <input type="text" class="form-control" name="direccion" required value="${usuario.direccion}"/>
                                    </div>
                                    <div class="form-group">
                                        <label for="telefono">Telefonos</label>
                                        <input type="tel" class="form-control" name="telefono" required value="${usuario.telefonos}"/>
                                    </div>
                                    <div class="form-group">
                                        <label for="email">Email</label>
                                        <input type="email" class="form-control" name="email" required value="${usuario.email}"/>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>

            </section>
        </form>

        <!-- Botones de navegacion -->


        <!-- Pie de pagina -->
        <jsp:include page="/WEB-INF/paginas/comunes/piePagina.jsp"/>

        <!-- Archivos Bootstrap 4 JS -->
        <script src="../../../js/jquery-3.6.0.min.js"></script>
        <script src="../../../js/popper.min.js"></script>
        <script src="../../../js/bootstrap.min.js"></script>
        <!-- Ayuda Bootstrap: https://hackerthemes.com/bootstrap-cheatsheet/ -->
    </body>
</html>