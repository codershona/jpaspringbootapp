package com.jpaspringbootapptask.jpaspringbootapp.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.jpaspringbootapptask.jpaspringbootapp.course.Course;
import com.jpaspringbootapptask.jpaspringbootapp.course.jdbc.CourseJdbcRepository;
import com.jpaspringbootapptask.jpaspringbootapp.course.jpa.CourseJpaRepository;
import com.jpaspringbootapptask.jpaspringbootapp.course.springdatajpa.CourseSpringDataJpaRepository;


@Component
public class CourseCommandLineRunner implements CommandLineRunner{
	
//	@Autowired
//	private CourseJdbcRepository repository;

	
//	@Autowired
//	private CourseJpaRepository repository;
	
	@Autowired
	private CourseSpringDataJpaRepository repository;
	
	
//	@Override
//	public void run(String... args) throws Exception {
//		// TODO Auto-generated method stub
//		
//		// inserting data
//		repository.insert(new Course(1, "Learn JPA", "inJPCourse"));
//		repository.insert(new Course(2, "Learn EnitytManager, Inserting and Deleting Data ", "Spring JDBC"));
//		repository.insert(new Course(3, "JPA Inserting Hardcorded Data", "JDBC/JPA"));
//		repository.insert(new Course(4, "JPA H2 Console", "Course Table"));
//		
//
//		// deleting data
//		repository.deleteById(1);
//		
//		// querying data 
//		System.out.println(repository.findById(2));
//		System.out.println(repository.findById(3));
//	}
	
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		// inserting data
		repository.save(new Course(1, "Learn JPA", "inJPCourse"));
		repository.save(new Course(2, "Learn EnitytManager, Inserting and Deleting Data ", "inJPCourse"));
		repository.save(new Course(3, "JPA Inserting Hardcorded Data", "JDBC/JPA"));
		repository.save(new Course(4, "JPA H2 Console", "Course Table"));
		

		// deleting data
		repository.deleteById(1l);
		
		// querying data 
		System.out.println(repository.findById(2l));
		System.out.println(repository.findById(3l));
		
		System.out.println(repository.findAll());
		System.out.println(repository.count());
		
		System.out.println(repository.findByAuthor(""));
		System.out.println(repository.findByAuthor("inJPCourse"));
		
		
		System.out.println(repository.findByName(""));
		System.out.println(repository.findByName("Learn JPA"));
	}

}
