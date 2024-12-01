
package acme.features.authenticated.donante;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.Donante.Donante;
import acme.framework.components.accounts.Authenticated;
import acme.framework.services.AbstractService;

@Service
public class AuthenticatedDonanteListService extends AbstractService<Authenticated, Donante> {

	@Autowired
	private AuthenticatedDonanteRepository donanteRepository; // Repositorio para acceder a los datos de los donantes


	/*
	 * // Método para listar los donantes
	 * public List<Donante> listarDonantes() {
	 * return this.donanteRepository.findAll(); // Esto devuelve todos los donantes de la base de datos
	 * }
	 * 
	 */
	// Método para listar los donantes
	public List<Donante> listarDonantes() {
		// Recuperamos todos los donantes de la base de datos
		final List<Donante> donantes = this.donanteRepository.findAll();

		// Imprimimos el tamaño de la lista para verificar cuántos donantes se han recuperado
		System.out.println("Donantes recuperados: " + donantes.size()); // Este mensaje aparece en la consola

		// Retornamos la lista de donantes
		return donantes;
	}
}
