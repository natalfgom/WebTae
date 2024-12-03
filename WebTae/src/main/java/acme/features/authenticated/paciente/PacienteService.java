
package acme.features.authenticated.paciente;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.Paciente.Paciente;
import acme.repositories.PacienteRepository;

@Service
public class PacienteService {

	@Autowired
	private PacienteRepository pacienteRepository; // Repositorio de paciente


	// Método para guardar un paciente (crear o editar)
	public Paciente save(final Paciente paciente) {
		return this.pacienteRepository.save(paciente); // Guarda el paciente en la base de datos
	}

	// Método para encontrar un paciente por su ID
	public Paciente findById(final Long id) {
		return this.pacienteRepository.findById(id).orElse(null); // Devuelve null si no se encuentra
	}

	// Método para obtener todos los pacientes
	public List<Paciente> findAll() {
		return this.pacienteRepository.findAll(); // Devuelve todos los pacientes
	}

	// Método para eliminar un paciente
	public void delete(final Long id) {
		this.pacienteRepository.deleteById(id); // Elimina el paciente por ID
	}

	public List<Paciente> findPacientesConTratamientoTrasplante() {
		return this.pacienteRepository.findPacientesConTratamientoTrasplante();
	}

}
