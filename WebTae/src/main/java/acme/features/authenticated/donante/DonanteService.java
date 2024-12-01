
package acme.features.authenticated.donante;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.Donante.Donante;
import acme.repositories.DonanteRepository;

@Service
public class DonanteService {

	@Autowired
	private DonanteRepository donanteRepository; // Repositorio de Donante


	// Método para guardar un paciente (crear o editar)
	public Donante save(final Donante donante) {
		return this.donanteRepository.save(donante); // Guarda el paciente en la base de datos
	}

}
