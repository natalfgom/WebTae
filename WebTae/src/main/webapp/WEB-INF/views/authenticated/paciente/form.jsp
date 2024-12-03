<%@ page language="java" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Detalle del Paciente</title>
</head>
<body>
    <h1>Detalle del Paciente</h1>

    <!-- Mostrar los detalles del paciente -->
    <p><strong>Nombre:</strong> ${paciente.nombre}</p>
    <p><strong>Apellidos:</strong> ${paciente.apellidos}</p>
    <p><strong>Historial Médico:</strong> ${paciente.historialMedico}</p>
    <p><strong>Estado:</strong> ${paciente.estado}</p>
    <!-- Agrega los demás campos del paciente que deseas mostrar -->

    <!-- Botón para regresar a la lista de pacientes -->
    <a href="/authenticated/paciente/list">Volver a la lista</a>
</body>
</html>
