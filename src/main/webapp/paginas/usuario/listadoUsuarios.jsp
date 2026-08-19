

<section id="clientes">
    <div class="container">
        <div class="row">
            <div class="col-md-9">
                <div class="card">
                    <div class="card-header">
                        <h4>Listado de Usuarios</h4>
                    </div>
                    <table class="table table-striped">
                        <thead class="thead-dark">
                            <tr>
                                <th>#</th>
                                <th>Nombre</th>
                                <th>Telefono</th>
                                <th>Email</th>
                                <th></th>
                            </tr>
                        </thead>
                        <tbody>
                            <!-- Iteramos la lista de usuarios -->
                            <c:forEach var="usuario" items="${usuarios}" varStatus="status">
                                <tr>
                                    <td>${status.count}</td>
                                    <td>${usuario.nombre} ${usuario.direccion}</td>
                                    <td>${usuario.telefono}</td>
                                    <td>${usuario.email}</td>
                                    <td>
                                        <a href="${pageContext.request.contextPath}/ServletControlador?action=editar&idCliente=${usuario.idCliente}"
                                           class="btn btn-warning">
                                            <i class="fas fa-angle-double-right"></i>
                                            Editar
                                        </a>
                                    </td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
            <!-- Tarjeta para total usuarios -->
            <div class="col-md-3">
                <div class="card text-center text-white mb-3 bg-success">
                    <div class="card-body">
                        <h3>Total Usuarios</h3>
                        <h4 class="display-4">
                            <i class="fas fa-users"></i>
                            ${clientesTotal}
                        </h4>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>
                        
<!-- Agregar Usuario MODAL -->
<jsp:include page="/WEB-INF/paginas/usuario/agregarUsuario.jsp"/>



