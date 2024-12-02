
package acme.features.authenticated.paciente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.Paciente.Paciente;
import acme.framework.components.models.Tuple;
import acme.framework.services.AbstractService;
import acme.repositories.PacienteRepository;

@Service
public class AuthenticatedPacienteShowService extends AbstractService {

	@Autowired
	protected PacienteRepository repository;


	public Paciente findPacienteById(final int id) {
		return this.repository.findOnePacienteById(id);
	}

	@Override
	public void check() {
		// Comprobar si el usuario está autenticado o tiene permisos para acceder a los detalles del paciente.
	}

	@Override
	public void authorise() {
		// Permitir acceso a cualquier usuario autenticado
		if (this.getRequest().getPrincipal() == null)
			this.getResponse().setAuthorised(false);  // Si el usuario no está autenticado, no está autorizado
		else
			this.getResponse().setAuthorised(true);   // Si el usuario está autenticado, está autorizado
	}

	@Override
	public void load() {
		// Cargar el paciente según el ID proporcionado en la solicitud.
		final long id = this.getRequest().getData("id", Long.class);  // Obtén el ID del paciente
		final Paciente paciente = this.repository.findById(id).orElse(null);  // Buscar el paciente
		this.getResponse().setData(paciente);  // Establecer los datos de la respuesta
	}

	public void unbind(final Paciente object) {
		assert object != null;

		Tuple tuple;

		tuple = super.unbind(object, "nombre", "apellidos", "historialMedico");

		super.getResponse().setData(tuple);
	}

}
