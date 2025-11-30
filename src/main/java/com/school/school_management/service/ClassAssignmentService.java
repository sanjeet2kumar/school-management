package com.school.school_management.service;

import com.school.school_management.entity.ClassAssignment;

import java.util.List;

public interface ClassAssignmentService {
    List<ClassAssignment> getAllAssignments();
    ClassAssignment getAssignmentById(Long id);
    ClassAssignment saveAssignment(ClassAssignment assignment);
    ClassAssignment updateAssignment(Long id, ClassAssignment assignment);
    void deleteAssignment(Long id);
}
