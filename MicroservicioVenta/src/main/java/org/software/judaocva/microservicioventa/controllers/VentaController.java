package org.software.judaocva.microservicioventa.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VentaController {

    @GetMapping("/venta/registrar-venta")
    public String registrarVenta() {
        System.out.println("Entro endpoint registrar-venta");
        return "Venta";
    }
}
