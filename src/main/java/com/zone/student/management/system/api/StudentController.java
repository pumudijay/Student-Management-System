package com.zone.student.management.system.api;

import com.zone.student.management.system.modal.Student;
import com.zone.student.management.system.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/students")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }


    @RequestMapping("/students/{id}")
    public Optional<Student> getStudent(@PathVariable Integer id){
        return studentService.getStudent(id);
    }

    @RequestMapping(method= RequestMethod.POST, value="/students")
    public void addStudent (@RequestBody Student student) {
        studentService.addStudent(student);
    }

    @RequestMapping(method= RequestMethod.PUT, value="/students/{id}")
    public void updateStudent (@RequestBody Student student, @PathVariable Integer id) {
        studentService.updateStudent(id, student);
    }

    @RequestMapping(method= RequestMethod.DELETE, value="/students/{id}")
    public void deleteStudent (@PathVariable Integer id) {
        studentService.deleteStudent(id);
    }

}
