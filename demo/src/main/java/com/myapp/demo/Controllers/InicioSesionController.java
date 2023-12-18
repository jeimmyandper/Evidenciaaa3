package com.myapp.demo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InicioSesionController {

    @GetMapping("/inicio-sesion")
    public String mostrarFormularioInicioSesion() {
        return "inicio_sesion"; // Nombre de la plantilla para el inicio de sesión
    }

    // Puedes añadir métodos para manejar la autenticación del inicio de sesión si es necesario
}
