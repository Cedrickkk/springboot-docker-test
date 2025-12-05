package com.docker.test.springbootdockertest.service;

import com.docker.test.springbootdockertest.dto.request.StudentRequest;
import com.docker.test.springbootdockertest.mapper.StudentMapper;
import com.docker.test.springbootdockertest.model.Student;
import com.docker.test.springbootdockertest.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;
    private final StudentMapper studentMapper;

    @Autowired
    public StudentService(StudentRepository studentRepository, StudentMapper studentMapper) {
        this.studentRepository = studentRepository;
        this.studentMapper = studentMapper;
    }

    public Student createStudent(StudentRequest request) {
        Student student = studentMapper.toEntity(request);
        return studentRepository.save(student);
    }

    public List<Student> getStudents() {
        return studentRepository.findAll();
    }
}
