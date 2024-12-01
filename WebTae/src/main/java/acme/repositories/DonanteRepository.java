
package acme.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import acme.entities.Donante.Donante;

@Repository
public interface DonanteRepository extends JpaRepository<Donante, Long> {
}
