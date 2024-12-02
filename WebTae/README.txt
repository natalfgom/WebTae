# README.txt

# Copyright (C) 2012-2023 Rafael Corchuelo.
#
# In keeping with the traditional purpose of furthering education and research, it is
# the policy of the copyright owner to permit non-commercial use and redistribution of
# this software. It has been tested carefully, but it is not guaranteed for any particular
# purposes. The copyright owner does not offer any warranties or representations, nor do
# they accept any liabilities with respect to them.

## Proyecto: Sistema de Gestión de Pacientes, Donantes y Tratamientos

El sistema está diseñado para gestionar de manera integral la información de pacientes, donantes,
 listas de espera y tratamientos médicos. Permite registrar y visualizar datos clave de pacientes y 
 donantes, como historiales médicos, órganos disponibles y compatibilidad para trasplantes. 
 Además, automatiza la inclusión en la lista de espera y facilita el seguimiento de tratamientos, 
 asegurando que los neumólogos y administradores puedan editar, consultar y administrar esta información 
 de forma eficiente.
 
- **/fragments/**

---
![Pantalla de bienvenida](src/main/resources/bienvenido.png)

## Requisitos del Proyecto

### Requisitos de Información
- **RI1:** Almacenar información de pacientes para gestionar tratamientos y asignar donantes:
  - NHUSA: único y obligatorio.
  - Nombre: obligatorio.
  - Apellidos: obligatorio.
  - Género: Masculino, Femenino u Otro.
  - Grupo Sanguíneo: A Positivo, A Negativo, B Positivo, B Negativo, 0 Positivo, 0 Negativo.
  - Historial Médico: opcional.
  - Estado: Tratamiento o Finalizado.
  - Urgencia: Bajo, Medio, Muy Alto.

- **RI2:** Almacenar información de donantes para gestionar órganos disponibles:
  - NHUSA: único y obligatorio.
  - Nombre: obligatorio.
  - Apellidos: obligatorio.
  - Grupo Sanguíneo: A Positivo, A Negativo, B Positivo, B Negativo, 0 Positivo, 0 Negativo.
  - Órgano Disponible: Pulmón completo izquierdo, Pulmón completo derecho o Lóbulo pulmonar.
  - Volumen Pulmonar: obligatorio.
  - Fecha de Extracción: obligatorio.

- **RI3:** Almacenar información de listas de espera para priorizar pacientes según sus necesidades médicas.

- **RI4:** Almacenar información de tratamientos para seguimiento médico:
  - Tipo de Tratamiento: Quimioterapia, Radioterapia, Cirugía, Inmunoterapia, Trasplante u Otro.
  - Estado de Tratamiento: En curso, Finalizado o Pendiente.

---

### Requisitos Funcionales
- **RF1.1:** El administrador debe poder registrar nuevos pacientes. NHUSA debe ser único.
- **RF1.2:** El neumólogo y el administrador deben poder visualizar los pacientes y sus detalles.
- **RF1.3:** El administrador debe poder editar los datos de los pacientes.
- **RF2.1:** El administrador debe poder registrar nuevos donantes. NHUSA debe ser único.
- **RF2.2:** El neumólogo y el administrador deben poder visualizar los donantes y sus detalles.
- **RF2.3:** El administrador debe poder editar los datos de los donantes.
- **RF4.1:** El neumólogo debe poder registrar tratamientos para pacientes existentes.
- **RF4.2:** El neumólogo debe poder editar los tratamientos, salvo si están finalizados.
- **RF4.3:** El neumólogo debe poder visualizar los tratamientos de los pacientes.

---

### Requisitos No Funcionales
- **RNF1:** Interfaz Intuitiva: Facilitar la navegación para neumólogos y administradores.
- **RNF2:** Escalabilidad: Manejar grandes volúmenes de datos.
- **RNF3:** Eliminación de Donantes: Remover donantes cuya extracción supere las 8 horas.
- **RNF4:** Automatización de Listas de Espera: Añadir pacientes automáticamente si el tratamiento es un trasplante.
- **RNF5:** Compatibilidad de Donantes: Determinar compatibilidad basada en grupo sanguíneo y tipo de órgano.
- **RNF6:** Integridad de Datos: Validación estricta de datos.

---

- **/fragments/**
 