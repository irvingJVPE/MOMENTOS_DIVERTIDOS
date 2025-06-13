package momentosdivertidos.inventory.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/** Maneja las vistas de autenticación. */
@Controller
public class AuthController {

    @GetMapping("/login")
    public String login() {               // muestra login.html
        return "auth/login";
    }

    @GetMapping("/register")
    public String register() {            // muestra register.html
        return "auth/register";
    }
}
