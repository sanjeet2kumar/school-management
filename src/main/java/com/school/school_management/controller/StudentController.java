package com.school.school_management.controller;

import com.school.school_management.entity.Student;
import com.school.school_management.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class StudentController {
    private final StudentService studentService;

    @GetMapping
    public List<Student> list(){
        return studentService.getAllStudents();
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Long id){
        return studentService.getStudentById(id);
    }

    @PostMapping
    public Student create(@RequestBody Student student){
        return studentService.createStudent(student);
    }
   @PutMapping("/{id}")
    public Student updateStudent(@PathVariable Long id, @RequestBody Student student){
        return studentService.updateStudent(id,student);

    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        studentService.deleteStudentById(id);
    }
}
