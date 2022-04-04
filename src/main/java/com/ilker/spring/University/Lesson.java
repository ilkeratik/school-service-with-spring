package com.ilker.spring.University;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.ilker.spring.JsonMappings.LessonDeserializer;
import org.json.JSONObject;

import java.util.Date;

@JsonDeserialize(using = LessonDeserializer.class)
public class Lesson {

    private String lessonId;
    private String lessonName;
    private Date year;
    private String term;
    private JSONObject teachers;

    public Lesson() {
    }

    public Lesson(String lessonId, String lessonName) {
        this.lessonId = lessonId;
        this.lessonName = lessonName;
    }

    public String getLessonId() {
        return lessonId;
    }

    public void setLessonId(String lessonId) {
        this.lessonId = lessonId;
    }

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    public Date getYear() {
        return year;
    }

    public void setYear(Date year) {
        this.year = year;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public JSONObject getTeachers() {
        return teachers;
    }

    public void setTeachers(JSONObject teachers) {
        this.teachers = teachers;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "lessonId='" + lessonId + '\'' +
                ", lessonName='" + lessonName + '\'' +
                ", year=" + year +
                ", term='" + term + '\'' +
                ", teachers=" + teachers +
                '}';
    }
}
