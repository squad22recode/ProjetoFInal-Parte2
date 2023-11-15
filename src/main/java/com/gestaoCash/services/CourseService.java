package com.gestaoCash.services;

import java.util.List;

import com.gestaoCash.model.Course;

public interface CourseService {
  void saveCourse(Course course);

  List<Course> findAllCourse();

  Course findCourseById(Long id);

  void updateCourseById(Long id, Course updatedCourse);

  void deleteCourseById(Long id);
}
