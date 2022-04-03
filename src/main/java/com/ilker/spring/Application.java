package com.ilker.spring;

import com.ilker.spring.Student.Student;
import com.ilker.spring.University.Department;
import com.ilker.spring.University.Faculty;
import com.ilker.spring.University.Lesson;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @GetMapping
    public List<Student> hello(){
        return List.of(
                new Student(1L,180290050,"Ilker","Atik",4,
                        List.of(new Lesson("YMU101","Yazilim Giris"),
                                new Lesson("ATA101","Ataturk Ilkeleri")),
                        new Faculty(290,"Muhendislik"),
                        new Department(290, "Yazilim Muhendisligi"))
        );
    }

}
