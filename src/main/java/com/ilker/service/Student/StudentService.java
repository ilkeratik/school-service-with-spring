package com.ilker.service.Student;


import com.ilker.model.Student.Student;
import com.ilker.model.University.Lesson;
import com.ilker.repository.Student.StudentRepository;
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
                new Student(180290050,"Ilker","Atik",4,
                        List.of(new Lesson("YMU101","Yazilim Giris"),
                                new Lesson("ATA101","Ataturk Ilkeleri")),
                        "290","290")
        );
    }

    public void addNewStudent(Student student) {
        Optional<Student> studentByNumber = studentRepository.findStudentByNumber(student.getStudentNumber());
        if(studentByNumber.isPresent()){
            throw new IllegalStateException(
                    "There is already a Student with the given id!");
        }
        System.out.println(student.getLessons());
        studentRepository.save(student);
        System.out.println(student);
    }

    public void deleteStudent(Long studentId) {
        boolean exist =studentRepository.existsById(studentId);
        if(!exist){
            throw new IllegalStateException(
                    "student with id="+ studentId+ " does not exist!");
        }
        studentRepository.deleteById(studentId);
    }

    public void deleteStudentByNumber(Integer studentNumber) {
        boolean exist =studentRepository.existsStudentByStudentNumber(studentNumber);
        if(!exist){
            throw new IllegalStateException(
                    "student with number="+ studentNumber+ " does not exist!");
        }
        studentRepository.deleteStudentByNumber(studentNumber);
    }
}

