package com.example.web1.student;

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
            Student edvan =  new Student(
                "Edvan",
                "edvan@gmail.com",
                LocalDate.of(2002, Month.JULY, 18)
            );

            Student maria =  new Student(
                    "Maria",
                    "maria@gmail.com",
                    LocalDate.of(1999, Month.FEBRUARY, 21)
            );

            repository.saveAll(List.of(edvan, maria));
        };
    }
}
