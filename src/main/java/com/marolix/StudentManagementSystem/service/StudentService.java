package com.marolix.StudentManagementSystem.service;

import java.util.List;

import com.marolix.StudentManagementSystem.dto.StudentDTO;

public interface StudentService {
	public StudentDTO registerNewStudent(StudentDTO dto);

	public StudentDTO searchStudentByPhoneNumber(String phoneNumber) throws StudentManagementException;

	public List<StudentDTO> filterByPhoneOrName(String poneNumber, String name) throws StudentManagementException;
}
