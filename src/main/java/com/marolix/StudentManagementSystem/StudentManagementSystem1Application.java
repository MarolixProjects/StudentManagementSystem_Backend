package com.marolix.StudentManagementSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.marolix.StudentManagementSystem.Controller.StudentController;

@SpringBootApplication
public class StudentManagementSystem1Application implements CommandLineRunner {
	@Autowired
	private StudentController studentController;

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystem1Application.class, args);

		ApplicationContext context = new AnnotationConfigApplicationContext();
		try {
			context.getBean(StudentManagementSystem1Application.class).run(args);
		} catch (Exception e) {

			System.out.println(e.getMessage());
		}
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("invoking new student as ui");
		// studentController.registerNewStudent();
		// studentController.searchStudentByPhoneNumber();
		studentController.searchStudentByPhoneNumberOrName();

	}

}
