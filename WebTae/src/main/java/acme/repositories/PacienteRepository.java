
package acme.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import acme.entities.Paciente.Paciente;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Long> {
}
