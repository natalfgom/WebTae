
package acme.features.authenticated.donante;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import acme.entities.Donante.Donante;

@Controller
@RequestMapping("/authenticated/donante/")
public class AuthenticatedDonanteController {

	@Autowired
	private DonanteService						donanteService;  // Usamos donanteService para gestionar la creación/edición de donantes

	@Autowired
	protected AuthenticatedDonanteListService	listService;


	// Método para listar donantes
	@GetMapping("/list")
	public String listarDonantes(final Model model) {
		final List<Donante> donantes = this.listService.listardonantes();
		model.addAttribute("donantes", donantes);
		return "authenticated/donante/list";
	}
}
