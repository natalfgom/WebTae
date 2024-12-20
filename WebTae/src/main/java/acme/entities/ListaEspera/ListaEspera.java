
package acme.entities.ListaEspera;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import acme.entities.Paciente.Paciente;
import acme.framework.data.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class ListaEspera extends AbstractEntity {

	// Serialisation identifier -----------------------------------------------

	protected static final long	serialVersionUID	= 1L;

	// Attributes ---------------------------------------------------

	@NotNull
	@Temporal(TemporalType.DATE)
	protected Date				fechaAdmision; // Fecha en que se añadió el paciente a la lista

	@Enumerated(EnumType.STRING)
	@NotNull
	protected EstadoSolicitud	estadoSolicitud; // Enum: PENDIENTE, ASIGNADO, RECHAZADO

	//protected Boolean			compatibilidad; // Indicación si hay donantes compatibles

	// Relationships -------------------------------------------------

	@OneToOne
	@JoinColumn(name = "paciente_id")  // Definir la clave foránea
	protected Paciente			paciente;

}
