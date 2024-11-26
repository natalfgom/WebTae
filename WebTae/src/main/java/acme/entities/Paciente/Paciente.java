
package acme.entities.Paciente;

import java.util.Collection;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import acme.entities.ListaEspera.ListaEspera;
import acme.entities.SolicitudTransplante.SolicitudTrasplante;
import acme.entities.Tratamiento.Tratamiento;
import acme.framework.data.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Paciente extends AbstractEntity {

	// Serialisation identifier -----------------------------------------------

	protected static final long					serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	@NotBlank
	protected String							nhusa; // Identificador único del paciente

	@NotBlank
	protected String							nombre;

	@NotBlank
	protected String							apellidos;

	@NotNull
	@Temporal(TemporalType.DATE)
	protected Date								fechaNacimiento;

	@NotNull
	@Enumerated(EnumType.STRING)
	protected Genero							genero; // Enum: MASCULINO, FEMENINO, OTRO

	@NotNull
	@Enumerated(EnumType.STRING)
	protected TipoSangre						tipoSangre; // Enum: A, B, AB, O

	@NotBlank
	protected String							historialMedico; // Información sobre enfermedades previas

	@NotNull
	@Enumerated(EnumType.STRING)
	protected EstadoPaciente					estado; // Enum: TRATAMIENTO, EVALUACION, POST_TRASPLANTE

	@NotNull
	@Temporal(TemporalType.DATE)
	protected Date								fechaRegistro; // Fecha de inclusión en el sistema

	@OneToMany(mappedBy = "paciente", cascade = CascadeType.ALL)
	protected Collection<Tratamiento>			tratamientos;

	@OneToOne(mappedBy = "paciente", cascade = CascadeType.ALL)
	protected ListaEspera						listaEspera;

	@OneToMany(mappedBy = "receptor", cascade = CascadeType.ALL)
	protected Collection<SolicitudTrasplante>	solicitudes;

}
