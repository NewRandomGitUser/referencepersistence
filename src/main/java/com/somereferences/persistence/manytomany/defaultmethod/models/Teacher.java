package com.somereferences.persistence.manytomany.defaultmethod.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "teacher_table")
public class Teacher {
    @TableGenerator(
            name = "teacher_table_generator",
            allocationSize = 1,
            initialValue = 0)
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "teacher_table_generator")
    private Long id;
    private String attributeOne;
    private String attributeTwo;
    private double attributeThree;
    private LocalDate creationDate;
    @ManyToMany(mappedBy = "teachers")
    Set<Student> students;

}
