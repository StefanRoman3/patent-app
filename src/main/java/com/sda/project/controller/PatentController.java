package com.sda.project.controller;

import com.sda.project.service.PatentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PatentController {

    private final PatentService patentService;

    @Autowired
    public PatentController(PatentService patentService) {
        this.patentService = patentService;
    }

    // TODO: find all patents
    @GetMapping("/patents")
    public String getPatentsPage(Model model) {
        model.addAttribute("patents", patentService.findAll());

        return "patent/patents";
    }
}
