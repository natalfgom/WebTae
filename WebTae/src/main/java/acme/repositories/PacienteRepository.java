
package acme.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.entities.Paciente.Paciente;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Long> {

	@Query("SELECT p FROM Paciente p JOIN p.tratamientos t WHERE t.tipoTratamiento = 'TRASPLANTE'")
	List<Paciente> findPacientesConTratamientoTrasplante();
}
