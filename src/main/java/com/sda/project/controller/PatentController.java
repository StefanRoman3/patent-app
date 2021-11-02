package com.sda.project.controller;

import com.sda.project.service.PatentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


@Controller
public class PatentController {


    private final PatentService patentService;

    @Autowired
    public PatentController(PatentService patentService) {
        this.patentService = patentService;
    }

}
