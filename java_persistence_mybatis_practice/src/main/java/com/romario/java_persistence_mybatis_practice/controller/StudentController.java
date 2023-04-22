package com.romario.java_persistence_mybatis_practice.controller;

import com.romario.java_persistence_mybatis_practice.model.entity.Student;
import com.romario.java_persistence_mybatis_practice.model.request.SaveStudentReq;
import com.romario.java_persistence_mybatis_practice.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/student")
@RequiredArgsConstructor
public class StudentController {

    Logger logger = LoggerFactory.getLogger(getClass());

    private final StudentService studentService;

    //================================
    //Get all students
    //================================
    @GetMapping
    public List<Student> getAll() {
        return this.studentService.findAllStudents();
    }

    //================================
    //Get single student
    //================================
    @GetMapping("/{id}")
    public Student single(@PathVariable int id) {
        return this.studentService.findStudentById(id);
    }

    //================================
    //Save single student
    //================================
    @PostMapping
    public Student saveSingle(@RequestBody SaveStudentReq body) {

        logger.debug("running::saveSingle");

        Student toSave = new Student();
        BeanUtils.copyProperties(body, toSave);
        logger.debug("saveSingle::willsave -> " + toSave);
        this.studentService.createStudent(toSave);
        return toSave;
    }


}
