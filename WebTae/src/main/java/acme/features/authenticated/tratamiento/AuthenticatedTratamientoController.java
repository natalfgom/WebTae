
package acme.features.authenticated.tratamiento;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import acme.entities.Tratamiento.Tratamiento;

@Controller
@RequestMapping("/authenticated/tratamiento/")
public class AuthenticatedTratamientoController {

	@Autowired
	protected AuthenticatedTratamientoListService listService;


	// Método para listar donantes
	@GetMapping("/list")
	public String listarTratamientos(final Model model) {
		final List<Tratamiento> tratamientos = this.listService.listartratamientos();
		model.addAttribute("tratamientos", tratamientos);
		return "authenticated/tratamiento/list";
	}
}
