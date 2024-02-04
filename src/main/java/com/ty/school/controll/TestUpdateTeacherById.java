package com.ty.school.controll;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ty.school.dto.Teacher;
import com.ty.school.helper.MyConfig;
import com.ty.school.service.TeacherService;

public class TestUpdateTeacherById {
	public static void main(String[] args) {
		Teacher teacher = new Teacher();
		teacher.setName("ganga");
		teacher.setGender("female");
		teacher.setEmail("ganga@gmail.com");
		teacher.setAge(32);
		teacher.setAddress("bidar");
		teacher.setPhone(1125525);
		teacher.setQualification("BA and BED");
		teacher.setSubject("drawing");
		teacher.setPassword("gan123");
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
		TeacherService teacherService = (TeacherService) applicationContext.getBean("teacherService");
		Teacher teacher1 = teacherService.updateTeacherById(teacher, 3);
		if (teacher1 != null) {
			System.out.println("teacher is updated");
		} else {
			System.out.println("teacher is not updated");
		}
	}

}
