package com.alvin.batch_oracle.config;

import org.springframework.batch.item.ItemProcessor;

import com.alvin.batch_oracle.student.Student;

public class StudentProcessor implements ItemProcessor<Student, Student> {
	
	@Override
	public Student process (Student student) throws Exception {
		// all the business logic goes here
		// test change1
		student.setId(null);
		return student;
	}

}
