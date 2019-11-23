package com.example.school.controller;

import com.example.school.mapper.SchoolMapper;
import com.example.school.model.School;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class schoolController {

    @Autowired
    private SchoolMapper schoolMapper;

    @RequestMapping("/")
    public String school(Model model){

        List<School> schoolList = schoolMapper.list();
        model.addAttribute("schools",schoolList);
        return "school";
    }

}
