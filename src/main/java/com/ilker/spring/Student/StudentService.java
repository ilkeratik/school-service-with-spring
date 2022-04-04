package com.ilker.spring.Student;


import com.ilker.spring.University.Lesson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents(){
        return studentRepository.findAll();
    }

    public List<Student> getExampleStudent(){
        return List.of(
                new Student(1L,180290050,"Ilker","Atik",4,
                        List.of(new Lesson("YMU101","Yazilim Giris"),
                                new Lesson("ATA101","Ataturk Ilkeleri")),
                        "290","290")
        );
    }

    public void addNewStudent(Student student) {
        Optional<Student> studentById = studentRepository.findStudentById(student.getIdStudent());
        if(studentById.isPresent()){
            throw new IllegalStateException(
                    "There is already a Student with the given id!");
        }
        System.out.println(student.getLessons());
        studentRepository.save(student);
        System.out.println(student);
    }
}
