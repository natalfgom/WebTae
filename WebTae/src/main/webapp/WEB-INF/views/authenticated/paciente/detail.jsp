<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title><spring:message code="authenticated.paciente.detail.title" /></title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css">
</head>
<body>
    <div class="container mt-5">
        <h1>Detalles del Paciente</h1>
        
        <!-- Mostrar los detalles del paciente dentro de una tarjeta -->
        <div class="card">
            <div class="card-header">
                <h4>${paciente.nombre} ${paciente.apellidos}</h4>
            </div>
            <div class="card-body">
                <!-- Aquí solo se muestran los detalles cuando se hace clic en "Show" -->
                <p><strong>NHUSA:</strong> ${paciente.nhusa}</p>
                <p><strong>Estado:</strong> ${paciente.estado}</p>
                <p><strong>Tipo de Sangre:</strong> ${paciente.tipoSangre}</p>
                <p><strong>Género:</strong> ${paciente.genero}</p>
                <p><strong>Historial Médico:</strong> ${paciente.historialMedico}</p>
                
            </div>
        </div>

        <!-- Botón para volver a la lista de pacientes -->
        <a href="/authenticated/paciente/list" class="btn btn-primary mt-3">Volver a la lista</a>
    </div>
</body>
</html>
