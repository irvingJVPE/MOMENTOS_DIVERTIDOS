package momentosdivertidos.inventory.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/** Dashboard estático de ejemplo. */
@Controller
public class DashboardController {

    @GetMapping({"/", "/dashboard"})
    public String dashboard(Model model) {
        // datos de prueba: matriz [fila][columna]
        model.addAttribute("rows", new String[][]{
            {"P001", "Juguete A",       "Juguetes", "100", "$15.00", "Almacén 1"},
            {"P002", "Juego de Mesa",   "Juguetes", "50",  "$25.00", "Almacén 2"},
            {"P003", "Camiseta",        "Ropa",     "200", "$10.00", "Almacén 3"},
            {"P004", "Gorra",           "Ropa",     "75",  "$8.00",  "Almacén 3"}
        });
        return "dashboard/index";
    }
}
