package com.marolix.StudentManagementSystem.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.marolix.StudentManagementSystem.dto.StudentDTO;
import com.marolix.StudentManagementSystem.entity.StudentAddress;
import com.marolix.StudentManagementSystem.entity.StudentInfo;
import com.marolix.StudentManagementSystem.entity.StudentLoginDetails;
import com.marolix.StudentManagementSystem.repository.StudentLoginRepository;
import com.marolix.StudentManagementSystem.repository.StudentRepository;

//@Component

//@Controller
//REpository
@Service(value = "studentService")
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;
	@Autowired
	private StudentLoginRepository studentLoginRepository;

	@Override
	public StudentDTO registerNewStudent(StudentDTO dto) {
		System.out.println("in service");
		String fNme = dto.getFatherName();

		StudentInfo newRow = new StudentInfo();
		newRow.setStudentId(dto.getStudentId());
		newRow.setStudentFatherName(fNme);
		newRow.setStudentName(dto.getStudentName());
		newRow.setPhoneNumber(dto.getPoneNumber());
		newRow.setGrade(dto.getGrade());
		newRow.setJoiningDate(dto.getJoiningDate());
		newRow.setType(dto.getType());
		String userName = dto.getStudentName().substring(0, 3) + dto.getPoneNumber().substring(3, 7) + dto.getGrade();
		
		
		
		//setting login credentials
		StudentLoginDetails newCredentials = new StudentLoginDetails();
		newCredentials.setUsername(userName);
		newCredentials.setPassword(dto.getLoginDTO().getPassword());
		newRow.setLogin(newCredentials);
		//set address details
		
List<StudentAddress> list=		dto.getAddressDTO().stream().map(p->{
			StudentAddress s= new StudentAddress();
			s.setAddressLine1(p.getAddressLine1());
			s.setAddressLine2(p.getAddressLine2());
			s.setAddressType(p.getAddressType());
			s.setCity(p.getCity());
			s.setState(p.getState());
			s.setPincode(p.getPincode());
			return s;
			
		}).collect(Collectors.toList());
		
newRow.setAddresses(list);
		
		
//		studentLoginRepository.save(newCredentials);
		
		
		
		
		studentRepository.save(newRow);
		return dto;
	}

}
