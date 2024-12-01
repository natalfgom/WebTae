
package acme.features.authenticated.lista;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.ListaEspera.EstadoSolicitud;
import acme.entities.ListaEspera.ListaEspera;
import acme.repositories.ListaEsperaRepository;

@Service
public class ListaEsperaService {

	@Autowired
	private ListaEsperaRepository listaEsperaRepository;


	// Método para agregar un paciente a la lista de espera
	public void agregarPaciente(final ListaEspera listaEspera) {
		this.listaEsperaRepository.save(listaEspera);
	}

	// Método para actualizar el estado de la solicitud
	public void actualizarEstado(final Long id, final EstadoSolicitud estado) {
		final ListaEspera listaEspera = this.listaEsperaRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Lista de espera no encontrada"));
		listaEspera.setEstadoSolicitud(estado);
		this.listaEsperaRepository.save(listaEspera);
	}

	// Método para obtener la lista de espera de un paciente
	public ListaEspera obtenerPorPaciente(final Long pacienteId) {
		return this.listaEsperaRepository.findByPacienteId(pacienteId).orElse(null);
	}
}
