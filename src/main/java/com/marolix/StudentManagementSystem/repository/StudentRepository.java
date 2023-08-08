package com.marolix.StudentManagementSystem.repository;

import org.springframework.data.repository.CrudRepository;

import com.marolix.StudentManagementSystem.entity.StudentInfo;

public interface StudentRepository  extends CrudRepository<StudentInfo, Integer>{
//save to insert a new row /update
	//findById to retive using primary key
	//deleteById to delete using using primary key
}
