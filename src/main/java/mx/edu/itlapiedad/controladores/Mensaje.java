package mx.edu.itlapiedad.controladores;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("devops")

public class Mensaje {
	@GetMapping("/hola")
	
public String mostrar_hola(@RequestParam String nombre){
		
	return"Hola "+nombre;
}
}
