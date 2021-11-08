package com.sda.project.controller;

import com.sda.project.dto.PatentDto;
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

    // TODO: find all patents
    @GetMapping("/patents")
    public String getPatentsPage(Model model) {
        model.addAttribute("patents", patentService.findAll());

        return "patent/patents";
    }

    @GetMapping("/patents/add")
    public String getAddForm(Model model) {
        model.addAttribute("patentDto", new PatentDto());
        return "patent/patent-add";
    }
    @PostMapping("/patents/add")
    public String addPatentForm(@ModelAttribute("patentDto") PatentDto patentDto) {
        patentService.save(patentDto);
        return "redirect:/pets";
    }

}
