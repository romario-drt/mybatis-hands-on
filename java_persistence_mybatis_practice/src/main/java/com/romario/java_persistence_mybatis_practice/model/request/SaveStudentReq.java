package com.romario.java_persistence_mybatis_practice.model.request;

import lombok.Data;

import java.time.LocalDate;

@Data
public class SaveStudentReq {

    private String name;
    private String email;
    private LocalDate dob;
}
