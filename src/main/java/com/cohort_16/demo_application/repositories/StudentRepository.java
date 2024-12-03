package com.cohort_16.demo_application.repositories;

import com.cohort_16.demo_application.models.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {

}
