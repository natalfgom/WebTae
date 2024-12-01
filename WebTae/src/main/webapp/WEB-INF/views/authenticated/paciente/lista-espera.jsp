<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title><spring:message code="authenticated.paciente.list.heading" /></title>
    <link rel="stylesheet" href="https://cdn.datatables.net/1.13.4/css/jquery.dataTables.min.css">
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <script src="https://cdn.datatables.net/1.13.4/js/jquery.dataTables.min.js"></script>
</head>
<body>
    <!-- Título principal y subtítulo -->
    <h1><spring:message code="authenticated.paciente.list.heading" /></h1>
    <h2><spring:message code="authenticated.paciente.list.subtitle" /></h2>
    
    <!-- Tabla de pacientes en lista de espera -->
    <table id="pacientesTable" class="display">
        <thead>
            <tr>
                <th><spring:message code="authenticated.paciente.list.nhusa" /></th>
                <th><spring:message code="authenticated.paciente.list.nombre" /></th>
                <th><spring:message code="authenticated.paciente.list.apellidos" /></th>
                <th><spring:message code="authenticated.paciente.list.tipoSangre" /></th>
                <th><spring:message code="authenticated.paciente.list.estado" /></th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${pacientes}" var="paciente">
                <tr>
                    <td>${paciente.nhusa}</td>
                    <td>${paciente.nombre}</td>
                    <td>${paciente.apellidos}</td>
                    <td>${paciente.tipoSangre}</td>
                    <td>${paciente.estado}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>

    <!-- Activar el DataTable -->  
    <script>
        $(document).ready(function () {
            $('#pacientesTable').DataTable();
        });
    </script>
</body>
</html>
