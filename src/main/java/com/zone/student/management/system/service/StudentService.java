package com.zone.student.management.system.service;

import com.zone.student.management.system.modal.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {
    private List<Student> students = new ArrayList<>(Arrays.asList(
            new Student(1,"Kamal",30,"12/B, High Level Road, Maharagama"),
            new Student(2,"Mala",22, "20,Colombo 07")
    ));
    public List<Student> getAllStudents(){
        return students;
    }

    public Student getStudent(String name){
        return students.stream().filter(s -> s.getStudentFirstName().equals(name)).findFirst().get();
    }

    public Student getStudent(Integer studentId){
        return students.stream().filter(s -> s.getStudentId().equals(studentId)).findFirst().get();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void updateStudent(Integer id, Student student) {
        for (int i = 0; i < students.size(); i++){
            Student s = students.get(i);
            if(s.getStudentId().equals(id)){
                students.set(i, student);
                return;
            }
        }
    }

    public void deleteStudent(Integer id) {
        students.removeIf(s -> s.getStudentId().equals(id));
    }
}
