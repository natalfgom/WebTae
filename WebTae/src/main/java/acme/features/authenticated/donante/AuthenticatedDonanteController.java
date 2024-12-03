
package acme.features.authenticated.donante;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import acme.entities.Donante.Donante;

@Controller
@RequestMapping("/authenticated/donante/")
public class AuthenticatedDonanteController {

	@Autowired
	private DonanteService						donanteService;  // Usamos donanteService para gestionar la creación/edición de donantes

	@Autowired
	protected AuthenticatedDonanteListService	listService;

	@Autowired
	protected AuthenticatedDonanteShowService	showService;  // Inyecta el servicio para mostrar un donante específico


	// Método para listar donantes
	@GetMapping("/list")
	public String listarDonantes(final Model model) {
		final List<Donante> donantes = this.listService.listardonantes();
		model.addAttribute("donantes", donantes);
		return "authenticated/donante/list";
	}

	// Método para mostrar detalles de un donante específico
	@GetMapping("/show")
	public String mostrarDonante(@RequestParam("id") final int id, final Model model) {
		final Donante donante = this.showService.findDonanteById(id);  // Usar el servicio para obtener el Donante por ID
		if (donante != null) {
			model.addAttribute("donante", donante);  // Añadir el donante al modelo
			return "authenticated/donante/show";  // Retornar la vista que muestra los detalles del Donante
		} else
			return "redirect:/authenticated/donante/list";  // Si no se encuentra el donante, redirigir al listado
	}
}
