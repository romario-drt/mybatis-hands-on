package com.romario.java_persistence_mybatis_practice.service;

import com.romario.java_persistence_mybatis_practice.config.MyBatisSQLSessionFactory;
import com.romario.java_persistence_mybatis_practice.model.entity.Student;
import com.romario.java_persistence_mybatis_practice.repository.StudentMapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    public List<Student> findAllStudents() {
        try (SqlSession sqlSession = MyBatisSQLSessionFactory.openSession()) {
            StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
            return studentMapper.findAllStudents();
        }
    }

    public Student findStudentById(Integer studId) {

        try (SqlSession sqlSession = MyBatisSQLSessionFactory.openSession()) {
            StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
            return studentMapper.findStudentById(studId);
        }
    }

    public void createStudent(Student student) {
        try (SqlSession sqlSession = MyBatisSQLSessionFactory.openSession()) {
            StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
            studentMapper.insertStudent(student);
            sqlSession.commit();
        }
    }
}
