package com.example.producto1_psp_jonathan.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home(@RequestParam(name = "nombre", required = true, defaultValue = "Jonathan") String nombre, Model model) {
        model.addAttribute("nombre", nombre);
        return "home";
    }
}