package com.example.school.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class professionController {

    @RequestMapping("/profession")
    public  String profession(Model model,
                              @RequestParam(name = "radio1",required = false) Integer radio1,
                              @RequestParam(name = "radio2",required = false) Integer radio2,
                              @RequestParam(name = "radio3",required = false) Integer radio3,
                              @RequestParam(name = "radio4",required = false) Integer radio4,
                              @RequestParam(name = "radio5",required = false) Integer radio5,
                              @RequestParam(name = "radio6",required = false) Integer radio6,
                              @RequestParam(name = "radio7",required = false) Integer radio7,
                              @RequestParam(name = "radio8",required = false) Integer radio8,
                              @RequestParam(name = "radio9",required = false) Integer radio9,
                              @RequestParam(name = "radio10",required = false) Integer radio10,
                              @RequestParam(name = "radio11",required = false) Integer radio11,
                              @RequestParam(name = "radio12",required = false) Integer radio12,
                              @RequestParam(name = "radio13",required = false) Integer radio13,
                              @RequestParam(name = "radio14",required = false) Integer radio14,
                              @RequestParam(name = "radio15",required = false) Integer radio15,
                              @RequestParam(name = "radio16",required = false) Integer radio16,
                              @RequestParam(name = "radio17",required = false) Integer radio17,
                              @RequestParam(name = "radio18",required = false) Integer radio18,
                              @RequestParam(name = "radio19",required = false) Integer radio19,
                              @RequestParam(name = "radio20",required = false) Integer radio20,
                              @RequestParam(name = "radio21",required = false) Integer radio21,
                              @RequestParam(name = "radio22",required = false) Integer radio22,
                              @RequestParam(name = "radio23",required = false) Integer radio23,
                              @RequestParam(name = "radio24",required = false) Integer radio24,
                              @RequestParam(name = "radio25",required = false) Integer radio25,
                              @RequestParam(name = "radio26",required = false) Integer radio26,
                              @RequestParam(name = "radio27",required = false) Integer radio27,
                              @RequestParam(name = "radio28",required = false) Integer radio28,
                              @RequestParam(name = "radio39",required = false) Integer radio29,
                              @RequestParam(name = "radio30",required = false) Integer radio30,
                              @RequestParam(name = "radio31",required = false) Integer radio31,
                              @RequestParam(name = "radio32",required = false) Integer radio32,
                              @RequestParam(name = "radio33",required = false) Integer radio33,
                              @RequestParam(name = "radio34",required = false) Integer radio34,
                              @RequestParam(name = "radio35",required = false) Integer radio35,
                              @RequestParam(name = "radio36",required = false) Integer radio36,
                              @RequestParam(name = "radio37",required = false) Integer radio37,
                              @RequestParam(name = "radio38",required = false) Integer radio38,
                              @RequestParam(name = "radio39",required = false) Integer radio39,
                              @RequestParam(name = "radio40",required = false) Integer radio40,
                              @RequestParam(name = "radio41",required = false) Integer radio41,
                              @RequestParam(name = "radio42",required = false) Integer radio42,
                              @RequestParam(name = "radio43",required = false) Integer radio43,
                              @RequestParam(name = "radio44",required = false) Integer radio44,
                              @RequestParam(name = "radio45",required = false) Integer radio45,
                              @RequestParam(name = "radio46",required = false) Integer radio46,
                              @RequestParam(name = "radio47",required = false) Integer radio47,
                              @RequestParam(name = "radio48",required = false) Integer radio48,
                              @RequestParam(name = "radio49",required = false) Integer radio49,
                              @RequestParam(name = "radio50",required = false) Integer radio50,
                              @RequestParam(name = "radio51",required = false) Integer radio51,
                              @RequestParam(name = "radio52",required = false) Integer radio52,
                              @RequestParam(name = "radio53",required = false) Integer radio53,
                              @RequestParam(name = "radio54",required = false) Integer radio54,
                              @RequestParam(name = "radio55",required = false) Integer radio55,
                              @RequestParam(name = "radio56",required = false) Integer radio56,
                              @RequestParam(name = "radio57",required = false) Integer radio57,
                              @RequestParam(name = "radio58",required = false) Integer radio58,
                              @RequestParam(name = "radio59",required = false) Integer radio59,
                              @RequestParam(name = "radio60",required = false) Integer radio60){
        int num;
        num =radio1+radio2+radio3;

        model.addAttribute("num",num);
        return "profession";
    }
}
