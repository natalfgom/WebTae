
package acme.roles;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;

import acme.framework.data.AbstractRole;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Administrador extends AbstractRole {

	protected static final long	serialVersionUID	= 1L;

	@NotBlank
	protected String			roleName			= "ADMIN"; // Añade un nombre para distinguir el rol

}
