package com.school.school_management.service;

import com.school.school_management.entity.Student;
import com.school.school_management.exception.StudentNotFoundException;
import com.school.school_management.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student getStudentById(Long id){
        return studentRepository.findById(id).orElseThrow(()->new StudentNotFoundException(id));
    }

    public  Student createStudent(Student s){
        return studentRepository.save(s);
    }

    public Student updateStudent(Long id, Student s){
        Student existingStudent=getStudentById(id);
        existingStudent.setFirstName(s.getFirstName());
        existingStudent.setLastName(s.getLastName());
        existingStudent.setEmail(s.getEmail());
        existingStudent.setEmail(s.getEmail());

        return studentRepository.save(existingStudent);

    }

    public void deleteStudentById(Long id){
        studentRepository.deleteById(id);
    }
}
