package com.somereferences.persistence.manytomany.defaultmethod.dboperations;

import com.somereferences.persistence.manytomany.defaultmethod.models.Student;
import com.somereferences.persistence.manytomany.defaultmethod.repository.StudentRepository;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class StudentPopulator {

    private final StudentRepository studentRepository;

    public StudentPopulator(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> createStudentList() {
        return Arrays.asList(
            Student.builder()
                 .attributeOne("James")
                 .attributeTwo("Jones")
                 .attributeThree(123.3)
                 .creationDate(LocalDate.now())
                 .build(),
            Student.builder()
                   .attributeOne("James")
                   .attributeTwo("Jones")
                   .attributeThree(123.3)
                   .creationDate(LocalDate.now())
                   .build(),
            Student.builder()
                    .attributeOne("James")
                    .attributeTwo("Jones")
                    .attributeThree(123.3)
                    .creationDate(LocalDate.now())
                    .build(),
            Student.builder()
                    .attributeOne("James")
                    .attributeTwo("Jones")
                    .attributeThree(123.3)
                    .creationDate(LocalDate.now())
                    .build(),
            Student.builder()
                    .attributeOne("James")
                    .attributeTwo("Jones")
                    .attributeThree(123.3)
                    .creationDate(LocalDate.now())
                    .build()
        );
    }

}
