<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.the-acme-framework.org/" prefix="acme" %>

<acme:form readonly="true">
    <acme:input-textbox code="authenticated.paciente.detail.nhusa" path="nhusa"/>
    <acme:input-textbox code="authenticated.paciente.detail.nombre" path="nombre"/>
    <acme:input-textbox code="authenticated.paciente.detail.apellidos" path="apellidos"/>
    <acme:input-textbox code="authenticated.paciente.detail.tipoSangre" path="tipoSangre"/>
    <acme:input-textbox code="authenticated.paciente.detail.estado" path="estado"/>
    <acme:input-textbox code="authenticated.paciente.detail.historialMedico" path="historialMedico"/>
</acme:form>
