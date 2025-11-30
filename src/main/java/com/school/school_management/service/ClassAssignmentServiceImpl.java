package com.school.school_management.service;

import com.school.school_management.entity.ClassAssignment;
import com.school.school_management.repository.ClassAssignmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassAssignmentServiceImpl implements ClassAssignmentService {

    private final ClassAssignmentRepository classAssignmentRepository;

    public ClassAssignmentServiceImpl(ClassAssignmentRepository classAssignmentRepository) {
        this.classAssignmentRepository = classAssignmentRepository;
    }

    @Override
    public List<ClassAssignment> getAllAssignments() {
        return classAssignmentRepository.findAll();
    }

    @Override
    public ClassAssignment getAssignmentById(Long id) {
        return classAssignmentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Assignment not found"));
    }



    @Override
    public ClassAssignment saveAssignment(ClassAssignment assignment) {
        return classAssignmentRepository.save(assignment);
    }

    @Override
    public ClassAssignment updateAssignment(Long id, ClassAssignment assignment) {
        ClassAssignment existing = getAssignmentById(id);
        existing.setTeacher(assignment.getTeacher());
        existing.setCourse(assignment.getCourse());
        existing.setClassName(assignment.getClassName());
        return classAssignmentRepository.save(existing);
    }

    @Override
    public void deleteAssignment(Long id) {
        classAssignmentRepository.deleteById(id);
    }
}