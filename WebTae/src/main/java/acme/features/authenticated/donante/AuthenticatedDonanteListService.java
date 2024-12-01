
package acme.features.authenticated.donante;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.Donante.Donante;
import acme.repositories.DonanteRepository;

@Service
public class AuthenticatedDonanteListService {

	@Autowired
	protected DonanteRepository donanteRepository;


	public List<Donante> listardonantes() {
		return this.donanteRepository.findAll();
	}
}
