
package com.zone.student.management.system.service;

import com.zone.student.management.system.modal.Student;
import com.zone.student.management.system.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudents(){
        //return students;
        List<Student> students = new ArrayList<>();
        studentRepository.findAll()
        .forEach(students::add);
        return students;
    }

    public Optional<Student> getStudent(Integer studentId){
        return studentRepository.findById(studentId);
    }

    public void addStudent(Student student) {
        //students.add(student);
        studentRepository.save(student);
    }

    public void updateStudent(Integer id, Student student) {
        studentRepository.save(student);
    }

    public void deleteStudent(Integer id) {
        studentRepository.deleteById(id);
    }
}
