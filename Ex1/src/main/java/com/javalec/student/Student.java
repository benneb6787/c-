package com.javalec.student;

public class Student {
	private String name;
	private String age;
	private String gradeNum;
	private String classNum;
	
	public String getName() {
		return name;
	}

	public String getAge() {
		return age;
	}

	public String getGradeNum() {
		return gradeNum;
	}

	public String getClassNum() {
		return classNum;
	}

	public Student(String name, String age, String gradeNum, String classNum) {
		this.name = name;
		this.age = age;
		this.gradeNum = gradeNum;
		this.classNum = classNum;
	}
}
