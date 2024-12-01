
package acme.features.authenticated.paciente;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.Paciente.Paciente;
import acme.repositories.PacienteRepository;

@Service
public class AuthenticatedPacienteListService {

	@Autowired
	protected PacienteRepository pacienteRepository;


	public List<Paciente> listarPacientes() {
		return this.pacienteRepository.findAll();
	}

}
