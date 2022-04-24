package com.ilker.config.Student;

import com.ilker.model.Student.Student;
import com.ilker.model.University.Department;
import com.ilker.model.University.Faculty;
import com.ilker.model.University.Lesson;
import com.ilker.repository.Student.StudentRepository;
import com.ilker.repository.University.DepartmentRepository;
import com.ilker.repository.University.FacultyRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository sRepository, FacultyRepository facultyRepository, DepartmentRepository departmentRepository){
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

            System.out.println(mark.toString());
            facultyRepository.saveAll(List.of(new Faculty(ilker.getFacultyId(), "Muhendislik"), new Faculty(mark.getFacultyId(), "Muhendislik")));
            departmentRepository.saveAll(List.of(new Department(ilker.getDepartmentId(), "Yazilim"), new Department(mark.getDepartmentId(), "Yazilim")));
            sRepository.saveAll(
                    List.of(ilker,mark)
            );
            };
        }

}
