package com.gestaoCash.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestaoCash.model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

}
