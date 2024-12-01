
package acme.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import acme.entities.ListaEspera.ListaEspera;

public interface ListaEsperaRepository extends JpaRepository<ListaEspera, Long> {

	// Buscar ListaEspera por el ID del paciente
	Optional<ListaEspera> findByPacienteId(Long pacienteId);
}
