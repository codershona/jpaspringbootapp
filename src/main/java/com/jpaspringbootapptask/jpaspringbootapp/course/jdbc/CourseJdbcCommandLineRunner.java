package com.jpaspringbootapptask.jpaspringbootapp.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.jpaspringbootapptask.jpaspringbootapp.course.Course;


@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner{
	
	@Autowired
	private CourseJdbcRepository repository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		// inserting data
		repository.insert(new Course(1, "Learn AWS", "inJPCourse"));
		repository.insert(new Course(2, "Learn Inserting and Deleting Data ", "Spring JDBC"));
		repository.insert(new Course(3, "Inserting Hardcorded Data", "JDBC/JPA"));
		repository.insert(new Course(4, "H2 Console", "Course Table"));
		

		// deleting data
		repository.deleteById(1);
		
		// querying data 
		System.out.println(repository.findById(2));
		System.out.println(repository.findById(3));
	}

}
