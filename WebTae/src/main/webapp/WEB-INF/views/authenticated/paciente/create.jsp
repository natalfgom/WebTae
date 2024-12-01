<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Crear Paciente</title>
</head>
<body>
    <h1>Crear Paciente</h1>

    <!-- Formulario para Crear un Paciente -->
    <form:form modelAttribute="paciente" action="/authenticated/paciente/save" method="POST">
        
        <label for="nhusa">NHUSA:</label>
        <form:input path="nhusa" id="nhusa" required="true" /><br><br>

        <label for="nombre">Nombre:</label>
        <form:input path="nombre" id="nombre" required="true" /><br><br>

        <label for="apellidos">Apellidos:</label>
        <form:input path="apellidos" id="apellidos" required="true" /><br><br>

        <label for="fechaNacimiento">Fecha de Nacimiento:</label>
        <form:input path="fechaNacimiento" id="fechaNacimiento" type="date" required="true" /><br><br>

        <label for="genero">Género:</label>
        <form:select path="genero" id="genero" required="true">
            <form:option value="Masculino">Masculino</form:option>
            <form:option value="Femenino">Femenino</form:option>
        </form:select><br><br>

        <label for="tipoSangre">Tipo de Sangre:</label>
        <form:input path="tipoSangre" id="tipoSangre" required="true" /><br><br>

        <label for="telefono">Teléfono:</label>
        <form:input path="telefono" id="telefono" required="true" /><br><br>

        <label for="correoElectronico">Correo Electrónico:</label>
        <form:input path="correoElectronico" id="correoElectronico" required="true" /><br><br>

        <label for="historialMedico">Historial Médico:</label>
        <form:input path="historialMedico" id="historialMedico" required="true" /><br><br>

        <label for="estado">Estado:</label>
        <form:select path="estado" id="estado" required="true">
            <form:option value="EVALUACION">Evaluación</form:option>
            <form:option value="TRATAMIENTO">Tratamiento</form:option>
            <form:option value="PETICION_TRASPLANTE">Petición Trasplante</form:option>
        </form:select><br><br>

        <label for="superficieCorporal">Superficie Corporal:</label>
        <form:input path="superficieCorporal" id="superficieCorporal" type="number" step="0.01" required="true" /><br><br>

        <input type="submit" value="Guardar" />
    </form:form>

    <br>
    <a href="/authenticated/paciente/list">Volver a la lista de pacientes</a>
</body>
</html>
