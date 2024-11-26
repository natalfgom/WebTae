
package acme.entities.SolicitudTransplante;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import acme.entities.Donante.Donante;
import acme.entities.Paciente.Paciente;
import acme.framework.data.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class SolicitudTrasplante extends AbstractEntity {

	// Serialisation identifier -----------------------------------------------

	protected static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	@NotNull
	@Temporal(TemporalType.DATE)
	protected Date				fechaSolicitud; // Fecha de creación de la solicitud

	@Enumerated(EnumType.STRING)
	@NotNull
	protected EstadoSolicitud	estadoSolicitud; // Enum: ENVIADA, APROBADA, RECHAZADA

	@NotBlank
	protected String			descripcion; // Justificación clínica y detalles de la compatibilidad

	// Relationships ----------------------------------------------------------

	@NotNull
	@ManyToOne(optional = false)
	protected Paciente			receptor; // Paciente receptor del trasplante

	@NotNull
	@ManyToOne(optional = false)
	protected Donante			donante; // Donante compatible

}
