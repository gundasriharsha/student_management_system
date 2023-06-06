package com.sriharsha.student_management_system;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController  //In this class, we will be writing end points
public class StudentController {

    HashMap<Integer, Student>hashmap=new HashMap<>();

    @PostMapping("/registerStudent")
    public void addStudent(@RequestBody Student student){
        int key=student.getRollNo();
        hashmap.put(key,student);
    }

    @GetMapping("/getStudentInfo")
    public Student getStudent(@RequestParam("rollNo") Integer rollNo){
        Student student=hashmap.get(rollNo);
        return student;
    }

}
