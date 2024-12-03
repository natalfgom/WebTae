
package acme.features.authenticated.paciente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.Paciente.Paciente;
import acme.framework.components.accounts.Authenticated;
import acme.framework.components.models.Tuple;
import acme.framework.services.AbstractService;
import acme.repositories.PacienteRepository;

@Service
public class AuthenticatedPacienteShowService extends AbstractService<Authenticated, Paciente> {

	@Autowired
	protected PacienteRepository repository;


	public Paciente findPacienteById(final int id) {
		return this.repository.findOnePacienteById(id);
	}

	@Override
	public void check() {

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
		Paciente object;
		int id;
		id = super.getRequest().getData("id", int.class);
		object = this.repository.findOnePacienteById(id);
		super.getBuffer().setData(object);
	}

	@Override
	public void unbind(final Paciente object) {
		assert object != null;

		Tuple tuple;

		tuple = super.unbind(object, "nombre", "apellidos", "historialMedico");

		super.getResponse().setData(tuple);
	}

}
