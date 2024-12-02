<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title><spring:message code="authenticated.paciente.detail.title" /></title>
    <link rel="stylesheet" href="https://cdn.datatables.net/1.13.4/css/jquery.dataTables.min.css">
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <script src="https://cdn.datatables.net/1.13.4/js/jquery.dataTables.min.js"></script>
</head>
<body>
    <h1><spring:message code="authenticated.paciente.detail.heading" /></h1>
    
    <!-- Card de detalles del paciente -->
    <div class="card">
        <div class="card-header">
            <h2><spring:message code="authenticated.paciente.detail.info" /></h2>
        </div>
        <div class="card-body">
            <table>
                <tr>
                    <th><spring:message code="authenticated.paciente.list.nhusa" /></th>
                    <td>${paciente.nhusa}</td>
                </tr>
                <tr>
                    <th><spring:message code="authenticated.paciente.list.nombre" /></th>
                    <td>${paciente.nombre}</td>
                </tr>
                <tr>
                    <th><spring:message code="authenticated.paciente.list.apellidos" /></th>
                    <td>${paciente.apellidos}</td>
                </tr>
                <tr>
                    <th><spring:message code="authenticated.paciente.list.estado" /></th>
                    <td>${paciente.estado}</td>
                </tr>
                <tr>
                    <th><spring:message code="authenticated.paciente.list.tipoSangre" /></th>
                    <td>${paciente.tipoSangre}</td>
                </tr>
                <tr>
                    <th><spring:message code="authenticated.paciente.list.genero" /></th>
                    <td>${paciente.genero}</td>
                </tr>
                <tr>
                    <th><spring:message code="authenticated.paciente.list.historialMedico" /></th>
                    <td>${paciente.historialMedico}</td>
                </tr>
            </table>
        </div>
    </div>
    
    <!-- Botón para regresar -->
    <a href="/authenticated/paciente/list" class="btn btn-primary"><spring:message code="authenticated.paciente.detail.back" /></a>
</body>
</html>
