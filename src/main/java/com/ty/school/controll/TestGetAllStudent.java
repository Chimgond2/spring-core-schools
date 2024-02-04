package com.ty.school.controll;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ty.school.dto.Student;
import com.ty.school.helper.MyConfig;
import com.ty.school.service.StudentService;

public class TestGetAllStudent {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
		StudentService studentService = (StudentService) applicationContext.getBean("studentService");
		List<Student> students = studentService.getAllStudent();
		if (students != null) {
			for (Student student : students) {
				System.out.println("id is " + student.getId());
				System.out.println("name is " + student.getName());
				System.out.println("age is " + student.getAge());
				System.out.println("gender is " + student.getGender());
				System.out.println("address is " + student.getAddress());
				System.out.println("email is " + student.getEmail());
				System.out.println("password is " + student.getPassword());
				System.out.println("phone is " + student.getPhone());

				System.out.println("---------------------------------------");
			}
		} else {
			System.out.println("student id is not present");
		}

	}
}
