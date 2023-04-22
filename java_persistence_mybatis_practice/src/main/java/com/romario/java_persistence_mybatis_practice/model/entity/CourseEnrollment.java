package com.romario.java_persistence_mybatis_practice.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CourseEnrollment {

    private int courseId;
    private int studentId;
}
