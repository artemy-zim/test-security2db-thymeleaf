package com.company.testsecurity2dbthymeleaf.repository;

import com.company.testsecurity2dbthymeleaf.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
