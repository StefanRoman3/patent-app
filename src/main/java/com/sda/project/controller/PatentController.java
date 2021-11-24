package com.sda.project.controller;

import com.sda.project.model.Patent;
import com.sda.project.service.PatentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PatentController {

    private final PatentService patentService;

    @Autowired
    public PatentController(PatentService patentService) {
        this.patentService = patentService;
    }

    @GetMapping("/patents")
    public String getPatentsPage(Model model) {
        model.addAttribute("patents", patentService.findAll());

        return "patent/patents";
    }

    @GetMapping("/patents/add")
    public String getAddForm(Model model) {
        model.addAttribute("patent", new Patent());
        return "patent/patent-add";
    }

    @PostMapping("/patents/add")
    public String addPatentForm(@ModelAttribute("patent") Patent patent) {
        patentService.save(patent);
        return "redirect:/patents";
    }

}
