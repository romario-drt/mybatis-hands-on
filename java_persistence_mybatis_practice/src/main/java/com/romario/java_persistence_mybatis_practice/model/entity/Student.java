package com.romario.java_persistence_mybatis_practice.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private int id;
    private String name;
    private String email;
    private String phone;
    private LocalDate dob;
    private String bio;
    //private type blob;
    private int addressId;
}
