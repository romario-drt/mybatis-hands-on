package com.romario.java_persistence_mybatis_practice.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {

    private int id;
    private String street;
    private String city;
    private String state;
    private String zip;
    private String country;

}
