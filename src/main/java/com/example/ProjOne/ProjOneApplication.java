package com.example.ProjOne;

import com.example.ProjOne.Student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class ProjOneApplication {

	public static void main(String[] args) {

		SpringApplication.run(ProjOneApplication.class, args);
	}

	@GetMapping
	public List<Student> Say(){
		return List.of(
			new Student(
					1L, "Bishal", "bishal@gmail.com", LocalDate.of(1995, Month.OCTOBER, 31),
					28
			)
		);
	}
}
