package com.koti.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.koti.entity.Student;

public interface StudentService {

	public Student saveStudent(Student student);
	public Optional<Student> findById(Long id);
	public List<Student> findAll();
	public void deleteById(Long Id);
}
