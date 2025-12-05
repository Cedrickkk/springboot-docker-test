package com.docker.test.springbootdockertest.repository;

import com.docker.test.springbootdockertest.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}