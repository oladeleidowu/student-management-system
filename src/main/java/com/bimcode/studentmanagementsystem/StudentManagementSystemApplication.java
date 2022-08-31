package com.bimcode.studentmanagementsystem;

import com.bimcode.studentmanagementsystem.entity.Student;
import com.bimcode.studentmanagementsystem.respository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {

//		Student student1 = new Student("Oladele","Idowu","oladele@yahoo.com");
//		studentRepository.save(student1);
//
//		Student student2 = new Student("Biola","Fadare","fadare@yahoo.com");
//		studentRepository.save(student2);
//
//		Student student3 = new Student("Iniola","Oladele","ini@yahoo.com");
//		studentRepository.save(student3);
	}
}
