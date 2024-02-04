package com.ty.school.controll;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ty.school.dto.Student;
import com.ty.school.helper.MyConfig;
import com.ty.school.service.StudentService;

public class TestUpdateStudentById {
	public static void main(String[] args) {
	Student student=new Student();
	student.setName("deepak");
	student.setGender("male");
	student.setAddress("mp");
	student.setAge(25);
	student.setPhone(659852);
	student.setEmail("deepak@gmail.com");
	student.setPassword("dee123");
	
	
	ApplicationContext applicationContext=new AnnotationConfigApplicationContext(MyConfig.class);
	StudentService studentService=(StudentService)applicationContext.getBean("studentService");
	
	Student student2=studentService.updateStudentById(student, 3);
	if(student2!=null) {
		System.out.println("student is updated");
	}else {
		System.out.println("there is no id to update");
	}
	
	}

}
