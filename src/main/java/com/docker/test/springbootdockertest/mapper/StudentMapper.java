package com.docker.test.springbootdockertest.mapper;

import com.docker.test.springbootdockertest.dto.request.StudentRequest;
import com.docker.test.springbootdockertest.model.Student;
import org.springframework.stereotype.Component;

@Component
public final class StudentMapper {

    public Student toEntity(StudentRequest request)  {
        Student student = new Student();
        student.setEmail(request.getEmail());
        student.setName(request.getName());
        return student;
    }

}
