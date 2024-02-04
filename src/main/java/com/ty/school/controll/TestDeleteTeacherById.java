package com.ty.school.controll;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ty.school.dto.Teacher;
import com.ty.school.helper.MyConfig;
import com.ty.school.service.TeacherService;

public class TestDeleteTeacherById {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(MyConfig.class);
	
	TeacherService teacherService=(TeacherService)applicationContext.getBean("teacherService");
	boolean result=teacherService.deleteTeacherById(3);
	if(result) {
		System.out.println("s deleted");
	}else {
		System.out.println("no");
	}
	
	}

}
