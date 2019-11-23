package com.example.school.service;

import com.example.school.dto.School_ProDTO;
import com.example.school.mapper.ProfessionMapper;
import com.example.school.mapper.School_ProMapper;
import com.example.school.model.Profession;
import com.example.school.model.School_Pro;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SchoolService {

    @Autowired
    private School_ProMapper school_proMapper;

    @Autowired
    private ProfessionMapper professionMapper;

    public List<School_ProDTO> getProById(Integer id) {
        List<School_Pro> school_proList = school_proMapper.selectById(id);
        List<School_ProDTO> school_proDTOList = new ArrayList<>();
        for (School_Pro school_pro:school_proList){
            Profession profession = professionMapper.selectByPid(school_pro.getPid());
            School_ProDTO school_proDTO = new School_ProDTO();
            BeanUtils.copyProperties(school_pro,school_proDTO);
            school_proDTO.setProfession(profession);
            school_proDTOList.add(school_proDTO);
        }
        return school_proDTOList;
    }
}
