<%@ page language="java" %>

<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="http://www.the-acme-framework.org/" prefix="acme" %>

<acme:form readonly="true">
    <!-- Nombre del paciente -->
    <acme:input-textbox code="authenticated.paciente.form.label.nombre" path="nombre" />
    
    <!-- Apellido del paciente -->
    <acme:input-textbox code="authenticated.paciente.form.label.apellidos" path="apellidos" />
    
    <!-- Historial médico del paciente -->
    <acme:input-textarea code="authenticated.paciente.form.label.historialMedico" path="historialMedico" />
</acme:form>
