package com.ilker.controller.Student;

import com.ilker.model.Student.Student;
import com.ilker.service.Student.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class StudentViewController {
    private StudentService studentService;

    @Autowired
    public StudentViewController(StudentService studentService){
        this.studentService= studentService;
    }

    @RequestMapping("/students")
    public String getStudents(Model model){
        List<Student> res = studentService.getStudents();
        model.addAttribute("students", res);
        return "students_details";
    }
}
