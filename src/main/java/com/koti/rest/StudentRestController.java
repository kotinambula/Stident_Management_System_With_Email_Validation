package com.koti.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.koti.entity.Student;
import com.koti.service.StudentService;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@RestController
public class StudentRestController {

	
	private StudentService studentService;
	
	public StudentRestController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	@PostMapping("/save")
	public Student saveStudent(@Valid @RequestBody Student student) {
		return studentService.saveStudent(student);
	}
	@GetMapping("/{id}")
	public Optional<Student> findById(@PathVariable Long id){
		return studentService.findById(id);
	}
	@GetMapping
	public List<Student> findAll(){
		return studentService.findAll();
	}
	@DeleteMapping("/{id}")
	public String deleteById(@PathVariable Long id) {
	    Optional<Student> studentOpt = studentService.findById(id);

	    if (studentOpt.isEmpty()) {
	        return "Student Not Found";
	    }

	    studentService.deleteById(id);
	    return "Student Deleted";
	}
	
}
