package com.marolix.StudentManagementSystem.Controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.marolix.StudentManagementSystem.dto.StudentAddressDTO;
import com.marolix.StudentManagementSystem.dto.StudentDTO;
import com.marolix.StudentManagementSystem.dto.StudentLoginDetailsDTO;
import com.marolix.StudentManagementSystem.entity.AdmissionType;
import com.marolix.StudentManagementSystem.entity.StudentAddressType;
import com.marolix.StudentManagementSystem.service.StudentService;

@Controller(value = "studentController")
public class StudentControllerImpl implements StudentController {
	@Autowired
	private StudentService studentService;

	@Override
	public void registerNewStudent() {
		System.out.println("in controller");
		StudentDTO infoFromUser = new StudentDTO();
		infoFromUser.setStudentName("Jimson");
		infoFromUser.setFatherName("Syed");
		infoFromUser.setPoneNumber("7763345778");
		infoFromUser.setGrade('8');
		infoFromUser.setJoiningDate(LocalDate.now());
		infoFromUser.setType(AdmissionType.MEDICON);

		StudentLoginDetailsDTO login = new StudentLoginDetailsDTO();
		login.setPassword("12345");
		infoFromUser.setLoginDTO(login);

		List<StudentAddressDTO> list = new ArrayList<StudentAddressDTO>();
		StudentAddressDTO adto = new StudentAddressDTO();
		adto.setAddressLine1("madhapur");
		adto.setAddressLine2("hitech city");
		adto.setCity("hyderabad");
		adto.setPincode("500001");
		adto.setState("telangana");
		adto.setAddressType(StudentAddressType.PERMANENT);
		list.add(adto);

//	infoFromUser.setStudentId(40);
		infoFromUser.setAddressDTO(list);
		StudentDTO dto = studentService.registerNewStudent(infoFromUser);
		System.out.println(dto);
	}

}
