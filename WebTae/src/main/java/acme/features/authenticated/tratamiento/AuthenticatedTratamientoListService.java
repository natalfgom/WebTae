
package acme.features.authenticated.tratamiento;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.Tratamiento.Tratamiento;
import acme.repositories.TratamientoRepository;

@Service
public class AuthenticatedTratamientoListService {

	@Autowired
	protected TratamientoRepository tratamientoRepository;


	public List<Tratamiento> listartratamientos() {
		return this.tratamientoRepository.findAll();
	}

}
