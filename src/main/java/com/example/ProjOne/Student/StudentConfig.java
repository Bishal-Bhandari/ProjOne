package com.example.ProjOne.Student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student Bishal = new Student(
                    "Bishal",
                    "bishal@xyz.io",
                    LocalDate.of(2000, Month.JANUARY,5)
            );
            Student Alex = new Student(
                    "Alex",
                    "Alex@xyz.io",
                    LocalDate.of(2005, Month.JANUARY,5)
            );
            repository.saveAll(
                    List.of(Bishal, Alex)
            );
        };
    }
}
