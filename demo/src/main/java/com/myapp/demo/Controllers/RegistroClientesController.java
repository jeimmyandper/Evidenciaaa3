package com.myapp.demo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegistroClientesController {

    @GetMapping("/registro-clientes")
    public String mostrarFormularioRegistroClientes() {
        return "registro_clientes"; // Nombre de la plantilla para el registro de clientes
    }

    // Puedes añadir métodos para manejar la lógica del registro de clientes si es necesario
}
