package com.ilker.spring.Student;

import com.ilker.spring.University.Department;
import com.ilker.spring.University.Faculty;
import com.ilker.spring.University.Lesson;
import com.vladmihalcea.hibernate.type.json.JsonStringType;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "student_jpa")
@TypeDef(name = "json", typeClass = JsonStringType.class)
public class Student {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long idStudent;

    private Integer studentNumber;
    private String name;
    private String surname;
    private Integer grade;
    @Type( type = "json" )
    @Column( columnDefinition = "json" )
    private List<Lesson> lessons;
    private String facultyId;
    private String departmentId;

    @Transient
    private Faculty faculty;
    @Transient
    private Department department;

    public Student() {
    }

    public Student(Long idStudent, Integer studentNumber, String name, String surname, Integer grade, List<Lesson> lessons, String facultyId, String departmentId) {
        this.idStudent = idStudent;
        this.studentNumber = studentNumber;
        this.name = name;
        this.surname = surname;
        this.grade = grade;
        this.lessons = lessons;
        this.facultyId = facultyId;
        this.departmentId = departmentId;
    }

    public Student(Integer studentNumber, String name, String surname, Integer grade, List<Lesson> lessons, String facultyId, String departmentId) {
        this.studentNumber = studentNumber;
        this.name = name;
        this.surname = surname;
        this.grade = grade;
        this.lessons = lessons;
        this.facultyId = facultyId;
        this.departmentId = departmentId;
    }

    public Long getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(Long idStudent) {
        this.idStudent = idStudent;
    }

    public Integer getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(Integer studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public List<Lesson> getLessons() {
        return lessons;
    }

    public void setLessons(List<Lesson> lessons) {
        this.lessons = lessons;
    }

    public String getfacultyId() {return facultyId;}

    public void setfacultyId(String facultyId) {
        this.facultyId = facultyId;
    }

    public String getdepartmentId() {
        return departmentId;
    }

    public void setdepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName(){
        return new Department(this.departmentId).getName(); // TO-DO: Add Service instead.
    }
    @Override
    public String toString() {
        return "Student{" +
                "id=" + idStudent +
                ", studentNumber=" + studentNumber +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", grade=" + grade +
                ", lessons=" + lessons +
                ", facultyId=" + facultyId +
                ", departmentId=" + departmentId +
                '}';
    }
}
