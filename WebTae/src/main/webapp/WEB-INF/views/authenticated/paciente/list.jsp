<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<html>
<head>
    <title><spring:message code="authenticated.paciente.list.title" /></title>
    <link rel="stylesheet" href="https://cdn.datatables.net/1.13.4/css/jquery.dataTables.min.css">
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <script src="https://cdn.datatables.net/1.13.4/js/jquery.dataTables.min.js"></script>
</head>

<body>
    <h1><spring:message code="authenticated.paciente.list.heading" /></h1>
    
    <!-- Botón para crear un nuevo paciente -->
    <a href="/authenticated/paciente/create">
        <button>Crear Nuevo Paciente</button>
    </a>
    <br><br>

    <table id="pacientesTable" class="display">
        <thead>
            <tr>
                <th><spring:message code="authenticated.paciente.list.nhusa" /></th>
                <th><spring:message code="authenticated.paciente.list.nombre" /></th>
                <th><spring:message code="authenticated.paciente.list.apellidos" /></th>
                <th><spring:message code="authenticated.paciente.list.telefono" /></th>
                <th><spring:message code="authenticated.paciente.list.correoElectronico" /></th>
                <th><spring:message code="authenticated.paciente.list.superficieCorporal" /></th>
                <th><spring:message code="authenticated.paciente.list.estado" /></th>
                <th><spring:message code="authenticated.paciente.list.fechaNacimiento" /></th>
                <th><spring:message code="authenticated.paciente.list.tipoSangre" /></th>
                <th><spring:message code="authenticated.paciente.list.genero" /></th>
                <th><spring:message code="authenticated.paciente.list.historialMedico" /></th>
                <th><spring:message code="authenticated.paciente.list.fechaRegistro" /></th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${pacientes}" var="paciente">
                <tr>
                    <td>${paciente.nhusa}</td>
                    <td>${paciente.nombre}</td>
                    <td>${paciente.apellidos}</td>
                    <td>${paciente.telefono}</td>
                    <td>${paciente.correoElectronico}</td>
                    <td>${paciente.superficieCorporal}</td>
                    <td>${paciente.estado}</td>
                    <td>${paciente.fechaNacimiento}</td>
                    <td>${paciente.tipoSangre}</td>
                    <td>${paciente.genero}</td>
                    <td>${paciente.historialMedico}</td>
                    <td>${paciente.fechaRegistro}</td>
                    <td>
                    <!-- Enlace para editar el paciente -->
                        <a href="/authenticated/paciente/edit/${paciente.id}">Editar</a>
                        <!-- Enlace para eliminar el paciente -->
                        <a href="/authenticated/paciente/delete/${paciente.id}" 
                           onclick="return confirm('¿Estás seguro de que quieres eliminar a este paciente?');">Eliminar</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>

    <script>
        $(document).ready(function () {
            $('#pacientesTable').DataTable();
        });
    </script>
</body>
</html>
