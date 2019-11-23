package com.example.school.dto;

import com.example.school.model.Profession;
import com.example.school.model.School;
import lombok.Data;

@Data
public class School_ProDTO {
    private int id;
    private int pid;
    private int score;
    private School school;
    private Profession profession;
}
