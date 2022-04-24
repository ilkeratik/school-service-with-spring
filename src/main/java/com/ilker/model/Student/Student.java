package com.ilker.model.Student;
import lombok.*;

import com.ilker.model.University.Department;
import com.ilker.model.University.Faculty;
import com.ilker.model.University.Lesson;
import com.vladmihalcea.hibernate.type.json.JsonStringType;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "students")
@TypeDef(name = "json", typeClass = JsonStringType.class)
public class Student {
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Column(name = "idStudent", nullable = false)
    private String idStudent;

    @NonNull private Integer studentNumber;
    @NonNull private String name;
    @NonNull private String surname;
    @NonNull private Integer grade;
    @Type( type = "json" )
    @Column( columnDefinition = "json" )
    @NonNull private List<Lesson> lessons;
    @NonNull private String facultyId;
    @NonNull private String departmentId;

    @Transient
    private Faculty faculty;
    @Transient
    private Department department;

}
