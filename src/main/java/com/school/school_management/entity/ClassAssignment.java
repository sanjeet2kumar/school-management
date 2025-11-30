package com.school.school_management.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "class_assignments")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClassAssignment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Many-to-one: one teacher can have many assignments
    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;

    // Many-to-one: one course can have many assignments
    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

    // Optional: class name or batch
    private String className;
}
