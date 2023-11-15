package com.gestaoCash.servicesImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gestaoCash.model.Course;
import com.gestaoCash.repositories.CourseRepository;
import com.gestaoCash.services.CourseService;

import jakarta.persistence.EntityNotFoundException;

@Service
public class CourseServiceImpl implements CourseService {

  @Autowired
  private CourseRepository courseRepository;

  @Override
  public void saveCourse(Course course) {
    this.courseRepository.save(course);
  }

  @Override
  @Transactional(readOnly = true)
  public List<Course> findAllCourse() {
    var courses = this.courseRepository.findAll();

    return courses;
  }

  @Override
  @Transactional(readOnly = true)
  public Course findCourseById(Long id) {
    var optionalCourse = this.courseRepository.findById(id);

    if (optionalCourse.isPresent()) {
      var course = optionalCourse.get();
      return course;
    } else {
      throw new EntityNotFoundException();
    }
  }

  @Override
  @Transactional
  public void updateCourseById(Long id, Course updatedCourse) {
    Optional<Course> optionalCourse = this.courseRepository.findById(id);

    if (optionalCourse.isPresent()) {
      var course = optionalCourse.get();
      course.setId(updatedCourse.getId());
      course.setNomeCurso(updatedCourse.getNomeCurso());
      course.setDescricao(updatedCourse.getDescricao());
      course.setUrl(updatedCourse.getUrl());
    } else {
      throw new EntityNotFoundException();
    }
  }

  @Override
  public void deleteCourseById(Long id) {
    this.courseRepository.deleteById(id);
  }

}
