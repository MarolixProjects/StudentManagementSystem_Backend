package com.marolix.StudentManagementSystem.Controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.marolix.StudentManagementSystem.dto.StudentAddressDTO;
import com.marolix.StudentManagementSystem.dto.StudentDTO;
import com.marolix.StudentManagementSystem.dto.StudentLoginDetailsDTO;
import com.marolix.StudentManagementSystem.entity.AdmissionType;
import com.marolix.StudentManagementSystem.entity.StudentAddressType;
import com.marolix.StudentManagementSystem.service.StudentManagementException;
import com.marolix.StudentManagementSystem.service.StudentService;

@Controller(value = "studentController")
public class StudentControllerImpl implements StudentController {
	@Autowired
	private StudentService studentService;

	@Override
	public void registerNewStudent() {
		System.out.println("in controller");
		System.out.println("enter student details");
		StudentDTO infoFromUser = new StudentDTO();
		System.out.println("enter student name");
		Scanner sc = new Scanner(System.in);
		infoFromUser.setStudentName(sc.next());
		System.out.println("student father name");
		infoFromUser.setFatherName(sc.next());
		System.out.println("enter phone number");
		infoFromUser.setPoneNumber(sc.next());
		System.out.println("enter grade");
		infoFromUser.setGrade('5');
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

	@Override
	public void searchStudentByPhoneNumber() {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the phone number");
		String phoneNumber = sc.next();

		try {
			StudentDTO d = studentService.searchStudentByPhoneNumber(phoneNumber);
			System.out.println(d);
		} catch (StudentManagementException e) {

			System.out.println(e.getMessage());
		}

	}

	@Override
	public void searchStudentByPhoneNumberOrName() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter phone number");
		String phone = sc.next();
		System.out.println("enter name");
		String name = sc.next();
		try {
			List<StudentDTO> s = studentService.filterByPhoneOrName(phone, name);
			System.out.println(s);
		} catch (StudentManagementException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}

}
