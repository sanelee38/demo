package com.example.school.mapper;

import com.example.school.model.Profession;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ProfessionMapper {

    @Select("select * from profession where pid = #{pid}")
    Profession selectByPid(@Param("pid") int pid);
}
