package Smart_Pillow;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlador1 {

    @GetMapping("/hola")
    public String decirHola() {
        return "¡Hola Mundo! Este es mi primer controlador, en Spring Boot.";
    }
}
