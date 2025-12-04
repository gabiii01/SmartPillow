package Smart_Pillow;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


<<<<<<< HEAD:src/main/java/Smart_Pillow/Controlador1.java
    @GetMapping("/hola")
    public String decirHola() {
        return "¡Hola Mundo! Este es mi primer controlador, en Spring Boot.";
=======
@RestController
public class HolaController {

    @GetMapping("/natalia")
    public String hola() {
        return "Hola desde la rama de Natalia";
>>>>>>> a2b4aacc1cfaa9865e206a17e5654e413db7e967:src/main/java/Smart_Pillow/HolaController.java
    }
}
