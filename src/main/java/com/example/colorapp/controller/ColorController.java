package com.example.colorapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.colorapp.service.ColorService;

@Controller
public class ColorController {
    private final ColorService colorService;

    public ColorController(ColorService colorService) {
        this.colorService = colorService;
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("colorName", colorService.getRandomColorName());
        return "index";
    }

    @GetMapping("/color")
    public String getColorName(@RequestParam String hex, Model model) {
        model.addAttribute("colorName", colorService.getColorNameFromHex(hex));
        return "index";
    }
}