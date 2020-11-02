package com.zone.student.management.system.repository;

import com.zone.student.management.system.modal.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Integer> {
}
