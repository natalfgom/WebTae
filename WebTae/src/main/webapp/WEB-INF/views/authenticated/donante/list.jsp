<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title><spring:message code="authenticated.donante.list.title" /></title>
    <link rel="stylesheet" href="https://cdn.datatables.net/1.13.4/css/jquery.dataTables.min.css">
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <script src="https://cdn.datatables.net/1.13.4/js/jquery.dataTables.min.js"></script>
</head>
<body>
    <h1><spring:message code="Donantes disponibles" /></h1>
    
    <!-- Tabla de donantes -->
    <table id="donantesTable" class="display">
        <thead>
            <tr>
                <th><spring:message code="authenticated.donante.list.nhusa" text="NHUSA" /></th>
                <th><spring:message code="authenticated.donante.list.nombre" text="Nombre" /></th>
                <th><spring:message code="authenticated.donante.list.apellidos" text="Apellidos" /></th>
                <th><spring:message code="authenticated.donante.list.grupoSanguineo" text="Grupo Sanguíneo" /></th>
                <th><spring:message code="authenticated.donante.list.organoDisponible" text="Órgano Disponible" /></th>
                <th><spring:message code="authenticated.donante.list.volumenPulmonar" text="Volumen Pulmonar (ml)" /></th>
                <th><spring:message code="authenticated.donante.list.fechaExtraccion" text="Fecha de Extracción" /></th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${donantes}" var="donante">
                <tr>
                    <td>${donante.nhusa}</td>
                    <td>${donante.nombre}</td>
                    <td>${donante.apellidos}</td>
                    <td>${donante.grupoSanguineo}</td>
                    <td>${donante.organoDisponible}</td>
                    <td>${donante.volumenPulmonar}</td>
                    <td>${donante.fechaExtraccion}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>

    <!-- Activar el DataTable -->
    <script>
        $(document).ready(function () {
            $('#donantesTable').DataTable();
        });
    </script>
</body>
</html>
