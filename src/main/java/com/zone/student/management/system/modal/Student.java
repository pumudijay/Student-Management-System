package com.zone.student.management.system.modal;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

    @Id
    private Integer studentId;
    private String studentFirstName;
    private Integer age;
    private String address;

    public Student() {
    }

    public Student(Integer studentId, String studentFirstName, Integer age, String address) {
        this.studentId = studentId;
        this.studentFirstName = studentFirstName;
        this.age = age;
        this.address = address;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentFirstName() {
        return studentFirstName;
    }

    public void setStudentFirstName(String studentFirstName) {
        this.studentFirstName = studentFirstName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
