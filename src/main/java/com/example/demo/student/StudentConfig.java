package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.AUGUST;
import static java.time.Month.FEBRUARY;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student nikola = new Student(
                    "Nikola",
                    "nikola94kv@gmail.com",
                    LocalDate.of(1994, AUGUST, 30));

            Student katarina = new Student(
                    "Katarina",
                    "katarina@gmail.com",
                    LocalDate.of(1999, FEBRUARY, 12));

            repository.saveAll(
                    List.of(nikola, katarina)
            );
        };

    }

}
