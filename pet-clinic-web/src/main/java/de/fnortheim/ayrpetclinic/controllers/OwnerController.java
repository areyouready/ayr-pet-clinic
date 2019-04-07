package de.fnortheim.ayrpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * created by sebastian on Apr, 2019
 */
@RequestMapping("/owners")
@Controller
public class OwnerController {

    @GetMapping({"", "/", "/index", "/index.html"})
    public String listOwners() {
        return "owners/index";
    }
}
