package com.somereferences.persistence.manytomany.defaultmethod.repository;

import com.somereferences.persistence.manytomany.defaultmethod.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
