package com.example.school.controller;

import com.example.school.Util.ExportWordUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@Controller
public class DemoController {
    @RequestMapping("/demo/export")
    public void export(HttpServletRequest request, HttpServletResponse response){
        Map<String,Object> params = new HashMap<>();
        params.put("name","李四");
        params.put("age","26");
        params.put("score","456");
        params.put("school1","西安科技大学");
        params.put("profession1","安全工程");
        params.put("school2","西安电子科技大学");
        params.put("profession2","电子科学与技术");
        params.put("school3","西安建筑科技大学");
        params.put("profession3","土木工程");

        ExportWordUtils.exportWord("word/demo.docx","F:/test","高考志愿报告.docx",params,request,response);
    }
}
