package com.example.school.mapper;

import com.example.school.model.School;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SchoolMapper {

    @Select("select * from school")
    List<School> list();
}
