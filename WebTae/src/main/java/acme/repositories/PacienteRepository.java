
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

	// Método para buscar un paciente por su ID
	@Query("select p from Paciente p where p.id = :id")
	Paciente findOnePacienteById(int id);

	// Método para listar todos los pacientes
	@Query("select p from Paciente p")
	List<Paciente> findAllPacientes();

}
