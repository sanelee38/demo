package com.example.school.controller;

import com.example.school.dto.School_ProDTO;
import com.example.school.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class descriptionController {

    @Autowired
    private SchoolService schoolService;

    @GetMapping("/description/{id}")
    public String description(@PathVariable("id") Integer id, Model model){

        List<School_ProDTO> school_proDTOList = schoolService.getProById(id);
        model.addAttribute("professions",school_proDTOList);
        return "description";
    }
}
