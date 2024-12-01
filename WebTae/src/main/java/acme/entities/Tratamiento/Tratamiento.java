
package acme.entities.Tratamiento;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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

	@NotNull
	@Enumerated(EnumType.STRING)
	protected TipoTratamiento	tipoTratamiento; // Ej.: Quimioterapia, Radioterapia, Trasplante

	@Enumerated(EnumType.STRING)
	@NotNull
	protected EstadoTratamiento	estadoTratamiento; // Enum: EN_CURSO, FINALIZADO, PENDIENTE

	// Relationships ----------------------------------------------------------
	@NotNull
	@ManyToOne
	@JoinColumn(name = "paciente_id")
	protected Paciente			paciente;
}
