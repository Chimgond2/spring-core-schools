package com.ty.school.controll;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ty.school.dto.Teacher;
import com.ty.school.helper.MyConfig;
import com.ty.school.service.TeacherService;

public class TestValidateTeacher {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
		TeacherService teacherService = (TeacherService) applicationContext.getBean("teacherService");
		//System.out.println(teacherService);
		Teacher teacher = teacherService.validateTeacher("ashwini@gmdail.com", "ash123");
		if (teacher!= null) {
	
			System.out.println("teacher name is : " + teacher.getName());
			System.out.println("teacher gender is : " + teacher.getGender());
			System.out.println("teacher id is : " + teacher.getId());
			System.out.println("teacher address is : " + teacher.getAddress());
			System.out.println("teacher age is : " + teacher.getAge());
			System.out.println("teacher email is : " + teacher.getEmail());
			System.out.println("teacher password is : " + teacher.getPassword());
			System.out.println("teacher phone is : " + teacher.getPhone());
			System.out.println("teacher qualification is : " + teacher.getQualification());
			System.out.println("teacher subject is : " + teacher.getSubject());
			
		} else {
			System.out.println("id is not present");
		}
	}

}
