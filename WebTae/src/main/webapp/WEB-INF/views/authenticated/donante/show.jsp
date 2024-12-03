<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title><spring:message code="authenticated.donante.show.title" /></title>
</head>
<body>

    <h1><spring:message code="authenticated.donante.show.title" /></h1>

    <!-- Mostrar los detalles del donante -->
    <form:form modelAttribute="donante">
        <fieldset>
            <legend><spring:message code="authenticated.donante.show.details" /></legend>
            
            <div>
                <label for="nhusa"><spring:message code="authenticated.donante.show.nhusa" /></label>
                <span>${donante.nhusa}</span>
            </div>
            
            <div>
                <label for="nombre"><spring:message code="authenticated.donante.show.nombre" /></label>
                <span>${donante.nombre}</span>
            </div>

            <div>
                <label for="apellidos"><spring:message code="authenticated.donante.show.apellidos" /></label>
                <span>${donante.apellidos}</span>
            </div>

            <div>
                <label for="grupoSanguineo"><spring:message code="authenticated.donante.show.grupoSanguineo" /></label>
                <span>${donante.grupoSanguineo}</span>
            </div>

            <div>
                <label for="organoDisponible"><spring:message code="authenticated.donante.show.organoDisponible" /></label>
                <span>${donante.organoDisponible}</span>
            </div>

            <div>
                <label for="volumenPulmonar"><spring:message code="authenticated.donante.show.volumenPulmonar" /></label>
                <span>${donante.volumenPulmonar}</span>
            </div>

            <div>
                <label for="fechaExtraccion"><spring:message code="authenticated.donante.show.fechaExtraccion" /></label>
                <span>${donante.fechaExtraccion}</span>
            </div>
            
            <!-- Aquí podrías agregar un botón para volver a la lista de donantes -->
            <div>
                <a href="${pageContext.request.contextPath}/authenticated/donante/list">
                    <button type="button"><spring:message code="authenticated.donante.show.back" /></button>
                </a>
            </div>
        </fieldset>
    </form:form>

</body>
</html>
