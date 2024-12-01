
package acme.entities.Paciente;

import java.util.Collection;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Positive;

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

	// Atributos -------------------------------------------------------------
	@NotBlank
	protected String							nhusa;

	@NotBlank
	protected String							nombre;

	@NotBlank
	protected String							apellidos;

	@NotNull
	@Temporal(TemporalType.DATE)  // fechaNacimiento es solo la fecha (sin hora)
	protected Date								fechaNacimiento;

	@NotNull
	@Enumerated(EnumType.STRING)
	protected Genero							genero;

	@NotNull
	@Enumerated(EnumType.STRING)
	protected TipoSangre						tipoSangre;

	@NotBlank
	protected String							historialMedico;

	@NotNull
	@Enumerated(EnumType.STRING)
	protected EstadoPaciente					estado;

	@NotNull
	@Temporal(TemporalType.TIMESTAMP)  // fechaRegistro es TIMESTAMP (incluye hora)
	protected Date								fechaRegistro;

	@Email  // Asegura que es un correo electrónico válido
	@NotBlank  // Asegura que el correo no esté vacío
	@Column(name = "correoElectronico")
	protected String							correoElectronico;

	@NotBlank
	@Pattern(regexp = "^\\+?[0-9]{10,15}$", message = "Debe ser un número de teléfono válido.")
	protected String							telefono;

	@NotNull
	@Positive
	protected Double							superficieCorporal;

	// Relaciones ----------------------------------------------------------

	@OneToMany(mappedBy = "paciente", cascade = CascadeType.ALL)
	protected Collection<Tratamiento>			Tratamientos;

	@OneToOne(mappedBy = "paciente", cascade = CascadeType.ALL)
	protected ListaEspera						ListaEspera;

	@OneToMany(mappedBy = "receptor", cascade = CascadeType.ALL)
	protected Collection<SolicitudTrasplante>	Solicitudes;
}
