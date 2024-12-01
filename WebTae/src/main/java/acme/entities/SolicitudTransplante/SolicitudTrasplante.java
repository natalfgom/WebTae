
package acme.entities.SolicitudTransplante;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import acme.entities.Donante.Donante;
import acme.entities.ListaEspera.ListaEspera;
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

	@ManyToOne
	@JoinColumn(name = "paciente_id")  // Este es el campo que hace la relación
	protected Paciente			receptor;

	@NotNull
	@ManyToOne(optional = false)
	protected Donante			donante; // Donante compatible

	@ManyToOne
	@JoinColumn(name = "lista_espera_id")
	protected ListaEspera		listaEspera;

}
