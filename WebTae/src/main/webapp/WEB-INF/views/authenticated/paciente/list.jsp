<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<html>
<head>
    <title><spring:message code="authenticated.paciente.list.title" /></title>
</head>
<body>
    <h1><spring:message code="authenticated.paciente.list.heading" /></h1>

    <table>
    <thead>
        <tr>
            <th><spring:message code="authenticated.paciente.list.nhusa" /></th>
            <th><spring:message code="authenticated.paciente.list.nombre" /></th>
            <th><spring:message code="authenticated.paciente.list.apellidos" /></th>
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
                <td>${paciente.estado}</td>
                <td>${paciente.fechaNacimiento}</td>
                <td>${paciente.tipoSangre}</td>
                <td>${paciente.genero}</td>
                <td>${paciente.historialMedico}</td>
                <td>${paciente.fechaRegistro}</td>
            </tr>
        </c:forEach>
    </tbody>
</table>

</body>
</html>
