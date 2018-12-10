package com.example.demoapi.resource;

import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoapi.model.dto.StudentDto;
import com.example.demoapi.model.mapper.StudentMapper;
import com.example.demoapi.repository.StudentRepository;

@RestController
@RequestMapping("/student")
public class StudentResource {

	@Autowired
	StudentRepository studentRepository;

	@Autowired
	StudentMapper studentMapper;

	@GetMapping("/all")
	public List<StudentDto> getAll() {
		return studentRepository.findAll().stream().map(student -> studentMapper.studentToStudentDto(student))
				.collect(Collectors.toList());
	}

	@PostMapping("/create")	
	public ResponseEntity<StudentDto> create(@Valid @ModelAttribute StudentDto studentDto, BindingResult bindingResult) {
		studentRepository.save(studentMapper.studentDtoToStudent(studentDto));
		return new ResponseEntity<StudentDto>(studentDto, HttpStatus.OK);
	}
}
