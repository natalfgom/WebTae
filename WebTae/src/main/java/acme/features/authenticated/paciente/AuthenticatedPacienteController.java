
package acme.features.authenticated.paciente;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import acme.entities.Paciente.Paciente;
import acme.framework.components.accounts.Authenticated;
import acme.framework.controllers.AbstractController;

@Controller
@RequestMapping("/authenticated/paciente/")
public class AuthenticatedPacienteController extends AbstractController<Authenticated, Paciente> {

	@Autowired
	private PacienteService						pacienteService;  // Usamos PacienteService para gestionar la creación/edición de pacientes

	@Autowired
	protected AuthenticatedPacienteListService	listService;

	@Autowired
	protected AuthenticatedPacienteShowService	showService;


	@PostConstruct
	protected void initialise() {
		// Ahora puedes utilizar addBasicCommand ya que el controlador extiende AbstractController

		super.addBasicCommand("show", this.showService);
	}

	// Método para listar pacientes
	@GetMapping("/list")
	public String listarPacientes(final Model model) {
		final List<Paciente> pacientes = this.listService.listarPacientes();
		model.addAttribute("pacientes", pacientes);
		return "authenticated/paciente/list";  // Vista de listado de pacientes
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

	// Método para mostrar la lista de espera de pacientes con tratamiento de trasplante
	@GetMapping("/lista-espera")
	public String mostrarListaEspera(final Model model) {
		final List<Paciente> pacientesConTrasplante = this.pacienteService.findPacientesConTratamientoTrasplante();
		model.addAttribute("pacientes", pacientesConTrasplante);
		return "authenticated/paciente/lista-espera";  // Vista que va a mostrar los pacientes con trasplante
	}

	@GetMapping("/form/{id}")
	public String mostrarDetallePaciente(@PathVariable("id") final Long id, final Model model) {
		final Paciente paciente = this.pacienteService.findById(id);  // Buscar paciente por ID
		if (paciente == null)
			return "redirect:/authenticated/paciente/list";  // Redirigir si no se encuentra el paciente
		model.addAttribute("paciente", paciente);
		return "authenticated/paciente/form";  // Redirige a form.jsp para mostrar el detalle
	}

}
