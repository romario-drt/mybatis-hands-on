package com.romario.java_persistence_mybatis_practice.repository;

import com.romario.java_persistence_mybatis_practice.model.entity.Student;

import java.util.List;

public interface StudentMapper {

    List<Student> findAllStudents();

    Student findStudentById(Integer id);

    void insertStudent(Student student);

}
