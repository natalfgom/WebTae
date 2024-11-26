
package acme.entities.Tratamiento;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import acme.entities.Paciente.Paciente;
import acme.framework.data.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Tratamiento extends AbstractEntity {

	// Serialisation identifier -----------------------------------------------

	protected static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	@NotBlank
	protected TipoTratamiento	tipoTratamiento; // Ej.: Quimioterapia, Radioterapia, Trasplante

	@NotNull
	@Temporal(TemporalType.DATE)
	protected Date				fechaInicio; // Fecha en que comienza el tratamiento

	@Enumerated(EnumType.STRING)
	@NotNull
	protected EstadoTratamiento	estadoTratamiento; // Enum: EN_CURSO, FINALIZADO, PENDIENTE

	// Relationships ----------------------------------------------------------

	@NotNull
	@ManyToOne(optional = false)
	protected Paciente			paciente; // Referencia al paciente que recibe este tratamiento

}
