package com.example.school.mapper;

import com.example.school.model.School_Pro;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface School_ProMapper {

    @Select("select * from school_pro where id=#{id}")
    List<School_Pro> selectById(@Param("id") int id);
}
