
package acme.features.authenticated.donante;

import java.util.List;  // Importar la clase List

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import acme.entities.Donante.Donante;

@Controller
public class AuthenticatedDonanteController {

	@Autowired
	protected AuthenticatedDonanteListService listService;  // Servicio para listar los donantes


	@GetMapping("/authenticated/donante/list")
	public String listarDonantes(final Model model) {
		// Recupera la lista de donantes
		final List<Donante> donantes = this.listService.listarDonantes();

		// Imprime en la consola para verificar que los datos están siendo recuperados
		System.out.println("Donantes recuperados en controlador: " + donantes.size());

		// Añade la lista de donantes al modelo
		model.addAttribute("donantes", donantes);

		// Retorna la vista para mostrar la lista
		return "authenticated/donante/list";
	}
}
