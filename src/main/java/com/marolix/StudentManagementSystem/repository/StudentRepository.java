package com.marolix.StudentManagementSystem.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.marolix.StudentManagementSystem.entity.StudentInfo;

public interface StudentRepository extends CrudRepository<StudentInfo, Integer> {
//save to insert a new row /update
	// findById to retive using primary key
	// deleteById to delete using using primary key

	public StudentInfo findByPhoneNumber(String phoneNumber);

	public List<StudentInfo> findByJoiningDate(LocalDate date);

	public List<StudentInfo> findByPhoneNumberOrStudentName(String phoneNumber, String name);

	public List<StudentInfo> findByJoingDateGreaterThan(LocalDate date);

	public List<StudentInfo> findByJoiningDateLessThan(LocalDate date);

	public List<StudentInfo> findByJoingDateBetween(LocalDate date1, LocalDate date2);
}
