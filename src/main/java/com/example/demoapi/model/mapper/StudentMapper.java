package com.example.demoapi.model.mapper;

import org.mapstruct.Mapper;

import com.example.demoapi.model.Student;
import com.example.demoapi.model.dto.StudentDto;

@Mapper(componentModel = "spring")
public interface StudentMapper {
	public StudentDto studentToStudentDto(Student student);
	public Student studentDtoToStudent(StudentDto studentDto);
}
