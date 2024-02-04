package com.ty.school.controll;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ty.school.dto.Teacher;
import com.ty.school.helper.MyConfig;
import com.ty.school.service.TeacherService;

public class TestSaveTeacher {
	public static void main(String[] args) {
		Teacher   teacher=new Teacher();
		teacher.setName("vittalla");
		teacher.setGender("male");
		teacher.setEmail("vittalla@gmail.com");
		teacher.setAge(32);
		teacher.setAddress("bidar");
		teacher.setPhone(1125525);
		teacher.setQualification("BA and BED");
		teacher.setSubject("kannada");
		teacher.setPassword("vit123");
		
		ApplicationContext  applicationContext=new AnnotationConfigApplicationContext(MyConfig.class);
	TeacherService teacherService=(TeacherService)applicationContext.getBean("teacherService");
	
		Teacher teacher2=teacherService.saveTeacher(teacher);
		if(teacher2!=null) {
			System.out.println("teacher is saved");
	}else {
		System.out.println("not saved");
		
	}
	
	}

}
