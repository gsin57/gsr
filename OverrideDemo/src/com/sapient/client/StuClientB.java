package com.sapient.client;

import com.sapient.beans.Student;

public class StuClientB {

	public static void main(String[] args) {
		Student stu =new Student(1001,"ram",89);
		
		Student stu2 =new Student(1001,"ram",89);
		stu =null;
		stu2 =null;
		System.gc();
		System.out.println("line3");
		System.out.println("line4");
	}

}
