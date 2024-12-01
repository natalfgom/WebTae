
package acme.features.authenticated.donante;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import acme.entities.Donante.Donante;

public interface AuthenticatedDonanteRepository extends JpaRepository<Donante, Long> {

	@Override
	List<Donante> findAll();  // Esta es la forma estándar de obtener todos los donantes
}
