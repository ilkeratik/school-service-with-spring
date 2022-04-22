package com.ilker.config.Student;

import com.ilker.model.Student.Student;
import com.ilker.model.University.Lesson;
import com.ilker.repository.Student.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository){
        return args-> {
            Student ilker = new Student(
                    180290050,
                    "Ilker","Atik",4,
                    List.of(new Lesson("YMU404","Yazilim Proje Yonetimi"),
                            new Lesson("ATA201","Ataturk Ilkeleri 2")),
                    "290","290");

            Student mark = new Student(
                    180290051,
                    "Mark","Turn",2,
                    List.of(new Lesson("YMU101","Yazilim Giris"),
                            new Lesson("ATA101","Ataturk Ilkeleri")),
                    "290","290");

            repository.saveAll(
                    List.of(ilker,mark)
            );
            };
        }

}
