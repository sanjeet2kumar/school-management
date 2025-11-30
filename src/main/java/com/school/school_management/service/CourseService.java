package com.school.school_management.service;

import com.school.school_management.entity.Course;

import java.util.List;

public interface CourseService
{
    List<Course> getAllCourses();
    Course getCourseById(Long id);
    Course saveCourse(Course course);
    Course updateCourse(Long id, Course course);
    void deleteCourse(Long id);
}
