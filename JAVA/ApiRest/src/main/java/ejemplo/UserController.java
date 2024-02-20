package ejemplo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {
	
		
	
	@GetMapping("/usuarios/{id}")
    public User obtenerUsuario(@PathVariable int id) {
       
		
        User usuario = new User();
        usuario.setId(id);
        usuario.setNombre("Usuario " + id);
        usuario.setEdad(30);
        return usuario;
    }
	
	@GetMapping("/saludo/{nombre}")
	public String saludo(@PathVariable String nombre) {
		
		return "Holassss "+nombre;
	}
	
	

}