package com.ilker.spring.Student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository
        extends JpaRepository<Student,Long> {

    @Query("SELECT s FROM Student s WHERE s.idStudent = ?1")
    Optional<Student> findStudentById(Long id);
}
