
package acme.features.authenticated.paciente;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import acme.entities.Paciente.Paciente;

@Controller
@RequestMapping("/authenticated/paciente/")
public class AuthenticatedPacienteController {

	@Autowired
	protected AuthenticatedPacienteListService listService;


	@GetMapping("/list")
	public String listarPacientes(final Model model) {
		final List<Paciente> pacientes = this.listService.listarPacientes();
		model.addAttribute("pacientes", pacientes);
		return "authenticated/paciente/list";
	}
}
