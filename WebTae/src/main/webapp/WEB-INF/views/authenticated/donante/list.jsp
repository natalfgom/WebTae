<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" uri="http://www.the-acme-framework.org/"%>

<h1>Listado de Donantes</h1>

<!-- Comprobamos si hay donantes -->
<c:if test="${not empty donantes}">
    <acme:list>
        <acme:list-column code="authenticated.donante.list.label.idDonante" path="idDonante" width="15%"/>
        <acme:list-column code="authenticated.donante.list.label.nombre" path="nombre" width="20%"/>
        <acme:list-column code="authenticated.donante.list.label.apellidos" path="apellidos" width="20%"/>
        <acme:list-column code="authenticated.donante.list.label.grupoSanguineo" path="grupoSanguineo" width="15%"/>
        <acme:list-column code="authenticated.donante.list.label.organoDisponible" path="organoDisponible" width="20%"/>
        <acme:list-column code="authenticated.donante.list.label.volumenPulmonar" path="volumenPulmonar" width="10%"/>
    </acme:list>
</c:if>

<!-- Mensaje si no hay donantes -->
<c:if test="${empty donantes}">
    <p>No hay donantes disponibles.</p>
</c:if>
