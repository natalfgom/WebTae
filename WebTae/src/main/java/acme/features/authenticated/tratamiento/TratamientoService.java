
package acme.features.authenticated.tratamiento;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.repositories.TratamientoRepository;

@Service
public class TratamientoService {

	@Autowired
	private TratamientoRepository tratamientoRepository; // Repositorio de Donante

}
