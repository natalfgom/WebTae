
package acme.features.authenticated.paciente;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import acme.entities.Paciente.Paciente;

@Controller
@RequestMapping("/authenticated/paciente/")
public class AuthenticatedPacienteController {

	@Autowired
	private PacienteService						pacienteService;  // Usamos PacienteService para gestionar la creación/edición de pacientes

	@Autowired
	protected AuthenticatedPacienteListService	listService;


	// Método para listar pacientes
	@GetMapping("/list")
	public String listarPacientes(final Model model) {
		final List<Paciente> pacientes = this.listService.listarPacientes();
		model.addAttribute("pacientes", pacientes);
		return "authenticated/paciente/list";
	}

	// Método para mostrar el formulario de creación de paciente
	@GetMapping("/create")
	public String mostrarFormularioCreacion(final Model model) {
		model.addAttribute("paciente", new Paciente());  // Crear un nuevo objeto vacío
		return "authenticated/paciente/create-edit";  // Vista de creación/edición
	}

	// Método para guardar un paciente (crear o editar)
	@PostMapping("/save")
	public String guardarPaciente(final Paciente paciente) {
		this.pacienteService.save(paciente);  // Usamos PacienteService para guardar
		return "redirect:/authenticated/paciente/list";  // Redirigir a la lista de pacientes
	}

	// Método para mostrar el formulario de edición de un paciente
	@GetMapping("/edit/{id}")
	public String mostrarFormularioEdicion(@PathVariable("id") final Long id, final Model model) {
		final Paciente paciente = this.pacienteService.findById(id);  // Buscar paciente por ID
		model.addAttribute("paciente", paciente);  // Pasar el paciente a la vista
		return "authenticated/paciente/create-edit";  // Vista de creación/edición
	}

	// Método para eliminar un paciente
	@GetMapping("/delete/{id}")
	public String eliminarPaciente(@PathVariable("id") final Long id) {
		this.pacienteService.delete(id);  // Usamos el servicio para eliminar el paciente
		return "redirect:/authenticated/paciente/list";  // Redirige a la lista de pacientes
	}
}
