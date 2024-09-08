package com.example.springjdbc1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.springjdbc1.dao.StudentDao;
import com.example.springjdbc1.model.Student;

@SpringBootApplication
public class Springjdbc1Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Springjdbc1Application.class, args);
		StudentDao sd = context.getBean(StudentDao.class);
		Student s1 = new Student();
		s1.setSname("Atharv");
		s1.setScity("Mumbai");
		s1.setSpercentage(90.78);
		System.out.println(sd.insertStudent(s1));
	}

}
