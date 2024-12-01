<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Crear/Editar Paciente</title>
</head>
<body>
    <h1>${paciente.id == null ? 'Crear' : 'Editar'} Paciente</h1>

    <!-- Formulario para Crear o Editar -->
    <form:form modelAttribute="paciente" action="/authenticated/paciente/save" method="POST">
        <label for="nhusa">NHUSA:</label>
        <form:input path="nhusa" id="nhusa" required/><br><br>

        <label for="nombre">Nombre:</label>
        <form:input path="nombre" id="nombre" required/><br><br>

        <label for="apellidos">Apellidos:</label>
        <form:input path="apellidos" id="apellidos" required/><br><br>

        <label for="fechaNacimiento">Fecha de Nacimiento:</label>
        <form:input path="fechaNacimiento" id="fechaNacimiento" type="date" required/><br><br>

        <label for="genero">Género:</label>
        <form:select path="genero" id="genero" required>
            <form:option value="MASCULINO">Masculino</form:option>
            <form:option value="FEMENINO">Femenino</form:option>
        </form:select><br><br>

        <label for="tipoSangre">Tipo de Sangre:</label>
        <form:input path="tipoSangre" id="tipoSangre" required/><br><br>

        <label for="telefono">Teléfono:</label>
        <form:input path="telefono" id="telefono" required/><br><br>

        <label for="correoElectronico">Correo Electrónico:</label>
        <form:input path="correoElectronico" id="correoElectronico" required/><br><br>

        <label for="historialMedico">Historial Médico:</label>
        <form:input path="historialMedico" id="historialMedico" required/><br><br>

        <label for="estado">Estado:</label>
        <form:select path="estado" id="estado" required>
            <form:option value="EVALUACION">Evaluación</form:option>
            <form:option value="TRATAMIENTO">Tratamiento</form:option>
            <form:option value="PETICION_TRASPLANTE">Petición Trasplante</form:option>
        </form:select><br><br>

        <label for="superficieCorporal">Superficie Corporal:</label>
        <form:input path="superficieCorporal" id="superficieCorporal" type="number" step="0.01" required/><br><br>

        <input type="submit" value="Guardar">
    </form:form>

    <a href="/authenticated/paciente/list">Volver a la lista de pacientes</a>
</body>
</html>
