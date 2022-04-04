package com.ilker.spring.Student;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ilker.spring.University.Department;
import com.ilker.spring.University.Faculty;
import com.ilker.spring.University.Lesson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/student")
public class StudentController {
    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService){
        this.studentService= studentService;
    }
    @GetMapping
    public List<Student> getStudents(){
        return studentService.getStudents();
    }

    @PostMapping
    public void registerNewStudent( @RequestBody Student student){
        studentService.addNewStudent(student);
    }
}
