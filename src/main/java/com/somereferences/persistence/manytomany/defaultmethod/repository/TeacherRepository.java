package com.somereferences.persistence.manytomany.defaultmethod.repository;

import com.somereferences.persistence.manytomany.defaultmethod.models.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {
}
