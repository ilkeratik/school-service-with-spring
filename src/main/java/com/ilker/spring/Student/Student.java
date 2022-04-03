package com.ilker.spring.Student;

import com.ilker.spring.University.Department;
import com.ilker.spring.University.Faculty;
import com.ilker.spring.University.Lesson;

import java.util.List;

public class Student {

    private Long id;
    private Integer studentId;
    private String name;
    private String surName;
    private Integer grade;
    private List<Lesson> lessons;
    private Faculty faculty;
    private Department department;


    public Student() {
    }

    public Student(Long id, Integer studentId, String name, String surName, Integer grade, List<Lesson> lesson, Faculty faculty, Department department) {
        this.id = id;
        this.studentId = studentId;
        this.name = name;
        this.surName = surName;
        this.grade = grade;
        this.lessons = lesson;
        this.faculty = faculty;
        this.department = department;
    }

    public Student(Integer studentId, String name, String surName, Integer grade, List<Lesson> lesson, Faculty faculty, Department department) {
        this.studentId = studentId;
        this.name = name;
        this.surName = surName;
        this.grade = grade;
        this.lessons = lesson;
        this.faculty = faculty;
        this.department = department;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public List<Lesson> getLesson() {
        return lessons;
    }

    public void setLesson(List<Lesson> lesson) {
        this.lessons = lesson;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", studentId=" + studentId +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", grade=" + grade +
                ", lesson=" + lessons +
                ", faculty=" + faculty +
                ", department=" + department +
                '}';
    }
}
