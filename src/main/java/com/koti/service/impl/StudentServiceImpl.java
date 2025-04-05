package com.koti.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import com.koti.entity.Student;
import com.koti.repository.StudentRepository;
import com.koti.service.StudentService;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Service
public class StudentServiceImpl implements StudentService {
	
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public Student saveStudent(Student student) {
		
		return studentRepository.save(student);
	}

	@Override
	public Optional<Student> findById(Long id) {
		
		return studentRepository.findById(id);
	}

	@Override
	public List<Student> findAll() {
		
		return studentRepository.findAll();
	}


	@Override
	public void deleteById(Long Id) {
		studentRepository.deleteById(Id);
		
	}
	

	

}
