package de.fnortheim.ayrpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * created by sebastian on Apr, 2019
 */
@Controller
public class VetController {

    @GetMapping({"/vets", "/vets/index", "/vets/index.html"})
    public String listVets() {
        return "vets/index";
    }
}
