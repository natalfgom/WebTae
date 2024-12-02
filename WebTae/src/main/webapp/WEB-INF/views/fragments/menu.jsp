<%@page language="java"%>

<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="http://www.the-acme-framework.org/" prefix="acme" %>

<acme:menu-bar code="master.menu.home">
    <acme:menu-left>
        <!-- Opción para los usuarios anónimos -->
        <acme:menu-option code="master.menu.anonymous" access="isAnonymous()">
            <acme:menu-suboption code="master.menu.anonymous.favourite-link" action="http://www.example.com/"/>
        </acme:menu-option>

        <!-- Menú para los Administradores y Neumólogos -->
        <acme:menu-option code="master.menu.administrator" access="hasRole('Administrator')">
            <acme:menu-suboption code="master.menu.administrator.view-patients" action="/authenticated/paciente/list"/>
            <acme:menu-separator/>
            <acme:menu-suboption code="master.menu.administrator.view-waiting-list" action="/authenticated/paciente/lista-espera"/>
            <acme:menu-separator/>
            <acme:menu-suboption code="master.menu.administrator.view-treatments" action="/authenticated/tratamiento/list"/>
            <acme:menu-separator/>
            <acme:menu-suboption code="master.menu.administrator.view-donors" action="/authenticated/donante/list"/>
        </acme:menu-option>

        <acme:menu-option code="master.menu.neumologo" access="hasRole('Neumologo')">
            <acme:menu-suboption code="master.menu.neumologo.view-patients" action="/neumologo/paciente/list"/>
            <acme:menu-separator/>
            <acme:menu-suboption code="master.menu.neumologo.view-waiting-list" action="/authenticated/paciente/lista-espera"/>
            <acme:menu-separator/>
            <acme:menu-suboption code="master.menu.neumologo.view-treatments" action="/neumologo/tratamiento/list"/>
            <acme:menu-separator/>
            <acme:menu-suboption code="master.menu.neumologo.view-donors" action="/neumologo/donante/list"/>
        </acme:menu-option>
        
    </acme:menu-left>

    <acme:menu-right>
        <!-- Opción para usuarios anónimos -->
        <acme:menu-option code="master.menu.sign-up" action="/anonymous/user-account/create" access="isAnonymous()"/>
        <acme:menu-option code="master.menu.sign-in" action="/master/sign-in" access="isAnonymous()"/>

        <!-- Menú para usuarios autenticados -->
        <acme:menu-option code="master.menu.user-account" access="isAuthenticated()">
            <acme:menu-suboption code="master.menu.user-account.general-data" action="/authenticated/user-account/update"/>
        </acme:menu-option>

        <!-- Opción de cerrar sesión -->
        <acme:menu-option code="master.menu.sign-out" action="/master/sign-out" access="isAuthenticated()"/>
    </acme:menu-right>
</acme:menu-bar>
