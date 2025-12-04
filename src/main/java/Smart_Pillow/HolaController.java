package Smart_Pillow;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HolaController {

    @GetMapping("/natalia")
    public String hola() {
        return "Hola desde la rama de Natalia";

    }
}
