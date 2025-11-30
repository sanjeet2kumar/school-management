package com.school.school_management.controller;

import com.school.school_management.entity.ClassAssignment;
import com.school.school_management.service.ClassAssignmentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/assignments")
@CrossOrigin(origins = "*")
public class ClassAssignmentController {

    private final ClassAssignmentService classAssignmentService;

    public ClassAssignmentController(ClassAssignmentService classAssignmentService) {
        this.classAssignmentService = classAssignmentService;
    }

    @GetMapping
    public List<ClassAssignment> getAllAssignments() {
        return classAssignmentService.getAllAssignments();
    }

    @GetMapping("/{id}")
    public ClassAssignment getAssignmentById(@PathVariable Long id) {
        return classAssignmentService.getAssignmentById(id);
    }

    @PostMapping
    public ClassAssignment addAssignment(@RequestBody ClassAssignment assignment) {
        return classAssignmentService.saveAssignment(assignment);
    }

    @PutMapping("/{id}")
    public ClassAssignment updateAssignment(@PathVariable Long id, @RequestBody ClassAssignment assignment) {
        return classAssignmentService.updateAssignment(id, assignment);
    }

    @DeleteMapping("/{id}")
    public void deleteAssignment(@PathVariable Long id) {
        classAssignmentService.deleteAssignment(id);
    }
}
