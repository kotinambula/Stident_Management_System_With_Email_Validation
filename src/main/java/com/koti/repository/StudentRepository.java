package com.koti.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.koti.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
