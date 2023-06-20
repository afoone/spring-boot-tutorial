package org.alfonso.nextraining.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
class HolaMundoController {

    @GetMapping("/hola")
    public String holaMundo() {
        return "Hola Mundo";
    }

}