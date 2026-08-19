<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> WENDY eCOMERCE </title>
</head>
<body>

<br />
    <h4>Lista de Usuarios </h4>
     <div id="toolbar">
        <button id="crear" class="btn btn-primary" data-toggle="modal" data-target="#myModal">
            <i class="fa fa-plus-circle"></i> Crear
        </button>

        <button id="editar" class="btn btn-dark" disabled>
            <i class="fa fa-edit"></i> Editar
        </button>
        <button id="clave" class="btn btn-dark" disabled>
            <i class="fa fa-edit"></i> Password
        </button>
    </div>


    <table id="table" data-toggle="table"
           data-toolbar="#toolbar"
           data-toolbar-Align="left"
           data-locale="es-ES"
           data-click-to-select="true"
           data-search="true"
           data-height="500"
           data-show-refresh="true"
           data-remember-order="true"
           data-rezisable="true"
           data-sort-stable="true"
           data-sort-name="Id"
           data-reorderable="true"
           data-chexckboxEnabled="true"
           data-show-toggle="true"
           data-show-fullscreen="true"
           data-show-columns="true"
           data-detail-view="true"
           data-show-export="true"
           data-row-style="formatterRowUtSelect"
           data-detail-formatter="detailFormatter"
           data-minimum-count-columns="2"
           data-show-pagination-switch="true"
           data-query-params-type="Else"
           data-table-sm="true"
           data-pagination="true"
           data-id-field="id"
           data-page-list="[10, 25, 50, 100, all]"
           data-show-footer="true"
           data-side-pagination="server"
           data-query-params="queryParams"
           data-url="/Usuario/LoadData" class="table table-hover"
           data-response-handler="responseHandler">
        <thead>
            <tr class="clickabled-row" row-style="formatterRowUtSelect">
                <th data-field="state" data-chexckboxEnabled="true"></th>
                <th data-field="Id" data-sortable="true">Id</th>
                <th data-field="Login" data-sortable="true">Login</th>
                <th data-field="Email" data-sortable="true">Email</th>
                <th data-field="Nombre" data-sortable="true">Nombre</th>
                <th data-field="Telefonos" data-sortable="true">Dirección</th>
                <th data-field="Telefonos" data-sortable="true">Teléfonos</th>
                <th data-field="TipoUsuario" data-formatter="rowFormatter" data-sortable="true">Status</th>
            </tr>
        </thead>
    </table>
    <input type="text" name="Idprovincia" id="Idprovincia" style="visibility:hidden">

</body>
</html>