package com.ilker.spring.Teacher;

import com.ilker.spring.University.Department;
import com.ilker.spring.University.Faculty;
import com.ilker.spring.University.Lesson;

import java.util.List;

public class Teacher {
    private Long id;
    private Integer teacherId;
    private String name;
    private String surName;
    private List<Lesson> lessons;
    private String role;
    private Faculty faculty;
    private Department department;

    public Teacher() {
    }

    public Teacher(Long id, Integer teacherId, String name, String surName, List<Lesson> lessons, String role, Faculty faculty, Department department) {
        this.id = id;
        this.teacherId = teacherId;
        this.name = name;
        this.surName = surName;
        this.lessons = lessons;
        this.role = role;
        this.faculty = faculty;
        this.department = department;
    }

    public Teacher(Integer teacherId, String name, String surName, List<Lesson> lessons, String role, Faculty faculty, Department department) {
        this.teacherId = teacherId;
        this.name = name;
        this.surName = surName;
        this.lessons = lessons;
        this.role = role;
        this.faculty = faculty;
        this.department = department;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
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

    public List<Lesson> getLessons() {
        return lessons;
    }

    public void setLessons(List<Lesson> lessons) {
        this.lessons = lessons;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
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
        return "Teacher{" +
                "id=" + id +
                ", teacherId=" + teacherId +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", lessons=" + lessons +
                ", role='" + role + '\'' +
                ", faculty=" + faculty +
                ", department=" + department +
                '}';
    }
}
