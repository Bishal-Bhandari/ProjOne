package com.example.ProjOne.Student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents(){
        return List.of(
                new Student(
                        1L,
                        "Bishal",
                        "bishal@gmail.com",
                        LocalDate.of(1995, Month.OCTOBER, 31),
                        28
                )
        );
    }
}
