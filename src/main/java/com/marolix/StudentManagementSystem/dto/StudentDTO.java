package com.marolix.StudentManagementSystem.dto;

import java.time.LocalDate;
import java.util.List;

import com.marolix.StudentManagementSystem.entity.AdmissionType;

public class StudentDTO {
	private Integer studentId;
	private String studentName;
	private String fatherName;
	private Character grade;
	private String poneNumber;
	private LocalDate joiningDate;
	private AdmissionType type;
	private StudentLoginDetailsDTO loginDTO;
	private List<StudentAddressDTO> addressDTO;

	public StudentDTO(Integer studentId, String studentName, String fatherName, Character grade, String poneNumber,
			LocalDate joiningDate, AdmissionType type, StudentLoginDetailsDTO loginDTO) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.fatherName = fatherName;
		this.grade = grade;
		this.poneNumber = poneNumber;
		this.joiningDate = joiningDate;
		this.type = type;
		this.loginDTO = loginDTO;
	}

	public StudentDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentLoginDetailsDTO getLoginDTO() {
		return loginDTO;
	}

	public List<StudentAddressDTO> getAddressDTO() {
		return addressDTO;
	}

	public void setAddressDTO(List<StudentAddressDTO> addressDTO) {
		this.addressDTO = addressDTO;
	}

	public void setLoginDTO(StudentLoginDetailsDTO loginDTO) {
		this.loginDTO = loginDTO;
	}

	public LocalDate getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(LocalDate joiningDate) {
		this.joiningDate = joiningDate;
	}

	public AdmissionType getType() {
		return type;
	}

	public void setType(AdmissionType type) {
		this.type = type;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public Character getGrade() {
		return grade;
	}

	public void setGrade(Character grade) {
		this.grade = grade;
	}

	public String getPoneNumber() {
		return poneNumber;
	}

	public void setPoneNumber(String poneNumber) {
		this.poneNumber = poneNumber;
	}

	@Override
	public String toString() {
		return "StudentDTO [studentId=" + studentId + ", studentName=" + studentName + ", fatherName=" + fatherName
				+ ", grade=" + grade + ", poneNumber=" + poneNumber + ", joiningDate=" + joiningDate + ", type=" + type
				+ ", loginDTO=" + loginDTO + "]";
	}

}
