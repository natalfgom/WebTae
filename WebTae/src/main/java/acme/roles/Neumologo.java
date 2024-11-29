
package acme.roles;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;

import acme.framework.data.AbstractRole;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Neumologo extends AbstractRole {

	// Serialisation identifier -----------------------------------------------
	protected static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------
	@NotBlank
	protected String			nombre;

	@NotBlank
	protected String			apellidos;

	@NotBlank
	protected String			colegioProfesional; // Número de colegiado o registro profesional

}
