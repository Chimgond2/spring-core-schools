package com.ty.school.controll;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ty.school.dto.Student;
import com.ty.school.helper.MyConfig;
import com.ty.school.service.StudentService;

public class TestDeleteStudentById {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(MyConfig.class);
	StudentService  studentService=(StudentService)applicationContext.getBean("studentService");
	boolean  result=studentService.deleteStudentById(5);
	if(result) {
		System.out.println("deleted");
	}else {
		System.out.println("no");
	}
	
	
	}

}
