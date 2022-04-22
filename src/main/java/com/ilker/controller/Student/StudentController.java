package com.ilker.controller.Student;

import com.ilker.model.Student.Student;
import com.ilker.service.Student.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
    @GetMapping()
    public List<Student> getStudents(){
        return studentService.getStudents();
    }

    @PostMapping
    public void registerNewStudent( @RequestBody Student student){
        studentService.addNewStudent(student);
    }

    @DeleteMapping(path="{studentId}")
    public void deleteStudent(@PathVariable("studentId") Long studentId){
        studentService.deleteStudent(studentId);
    }
}
