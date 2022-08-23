package com.javaguides.sms;

import com.javaguides.sms.entity.Student;
import com.javaguides.sms.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SmsApplication implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(SmsApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {

//		Student student1 = new Student("Timmy","Ramaifo","Tim.2@gmail.com");
//		studentRepository.save(student1);
//
//		Student student2 = new Student("masai","Ramaifo","masai.2@gmail.com");
//		studentRepository.save(student2);
//
//		Student student3 = new Student("Tipe","Nyems","Tipe.2@gmail.com");
//		studentRepository.save(student3);
	}
}
