package com.spring;

public class Student {

	private int studentId;
	private String studentName;
	private String studentCourse;

	public int getStudentId() {

		return studentId;
	}

	public void setStudentId(int studentId) {
		System.out.println("This is getter of the studentID");
		this.studentId = studentId;
	}

	public String getStudentName() {

		return studentName;
	}

	public void setStudentName(String studentName) {
		System.out.println("This is getter of the studentName");
		this.studentName = studentName;
	}

	public String getStudentCourse() {

		return studentCourse;
	}

	public void setStudentCourse(String studentCourse) {
		System.out.println("This is getter of the studentcourse");
		this.studentCourse = studentCourse;
	}

	public Student(int studentId, String studentName, String studentCourse) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentCourse = studentCourse;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentCourse=" + studentCourse
				+ "]";
	}

}
