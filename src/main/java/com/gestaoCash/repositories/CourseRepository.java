package com.gestaoCash.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestaoCash.model.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
