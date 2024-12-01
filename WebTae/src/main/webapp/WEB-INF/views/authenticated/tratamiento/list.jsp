<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title><spring:message code="authenticated.tratamiento.list.title" /></title>
    <link rel="stylesheet" href="https://cdn.datatables.net/1.13.4/css/jquery.dataTables.min.css">
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <script src="https://cdn.datatables.net/1.13.4/js/jquery.dataTables.min.js"></script>
</head>
<body>
    <h1><spring:message code="authenticated.tratamiento.list.heading" /></h1>
    
    <!-- Tabla de tratamientos -->
    <table id="tratamientosTable" class="display">
        <thead>
            <tr>
                <th><spring:message code="authenticated.tratamiento.list.tipoTratamiento" /></th>
                <th><spring:message code="authenticated.tratamiento.list.estadoTratamiento" /></th>
                <th><spring:message code="authenticated.tratamiento.list.paciente" /></th>
                <th><spring:message code="authenticated.tratamiento.list.actions" /></th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${tratamientos}" var="tratamiento">
                <tr>
                    <td>${tratamiento.tipoTratamiento}</td>
                    <td>${tratamiento.estadoTratamiento}</td>
                    <td>${tratamiento.paciente.nombre} ${tratamiento.paciente.apellidos}</td>
                    <td>
                        <a href="<c:url value='/authenticated/tratamiento/edit/${tratamiento.id}'/>" class="btn btn-warning btn-sm"><spring:message code="authenticated.tratamiento.edit" /></a>
                        <a href="<c:url value='/authenticated/tratamiento/delete/${tratamiento.id}'/>" class="btn btn-danger btn-sm" onclick="return confirm('<spring:message code="authenticated.tratamiento.delete.confirm" />')"><spring:message code="authenticated.tratamiento.delete" /></a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>

    <!-- Activar el DataTable -->  
    <script>
        $(document).ready(function () {
            $('#tratamientosTable').DataTable();
        });
    </script>
</body>
</html>
