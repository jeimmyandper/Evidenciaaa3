package com.myapp.demo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegistroUsuariosController {

    @GetMapping("/registro-usuarios")
    public String mostrarFormularioRegistroUsuarios() {
        return "registro_usuarios"; // Nombre de la plantilla para el registro de usuarios
    }

    // Puedes añadir métodos para manejar la lógica del registro de usuarios si es necesario
}
