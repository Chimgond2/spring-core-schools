package com.ty.school.controll;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import com.ty.school.dto.Student;
import com.ty.school.helper.MyConfig;
import com.ty.school.service.StudentService;

@Component
public class TestSaveStudent {
	
	public static void main(String[] args) {
		Student student=new Student();
		student.setName("raghav");
		student.setGender("male");
		student.setAddress("rajajinagar");
		student.setAge(25);
		student.setPhone(9555529);
		student.setEmail("raghav@gmail.com");
		student.setPassword("rag123");
		
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(MyConfig.class);
		StudentService studentService=(StudentService)applicationContext.getBean("studentService");
		studentService.saveStudent(student);
		
	}

}
