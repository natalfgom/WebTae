
package acme.entities.Donante;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import acme.framework.data.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Donante extends AbstractEntity {

	// Serialisation identifier ----------------------------------------------

	protected static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	@NotBlank
	protected String			nombreDonante; // Nombre del donant

	@NotNull
	protected Integer			edadDonante; // Edad del donante

	@Enumerated(EnumType.STRING)
	@NotNull
	protected TipoSangre		tipoSangre; // Grupo sanguíneo del donante

	@NotBlank
	protected String			tipoOrgano; // Tipo de órgano disponible (e.g., Pulmón)

	@NotNull
	protected Boolean			compatibilidad; // Indicación si es compatible con algún paciente

	// Relationships ----------------------------------------------------------
	// Puedes añadir relaciones si en el futuro conectas Donantes con otras entidades

}
