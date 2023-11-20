package com.gestaoCash.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gestaoCash.model.Course;
import com.gestaoCash.services.CourseService;

@Controller
@RequestMapping("/cursos")
public class CourseController {

  @Autowired
  private CourseService courseService;

  @GetMapping
  public String listAllCourses(Model model) {
    var courses = this.courseService.findAllCourse();
    model.addAttribute("cursos", courses);

    return "";
  }

  @GetMapping("/novo")
  public String showForm(Model model) {
    var course = new Course();
    model.addAttribute("curso", course);

    return "";
  }

  @PostMapping("/save")
  public String saveCourse(@ModelAttribute("curso") Course course) {
    this.courseService.saveCourse(course);

    return "redirect:/cursos";
  }

  @GetMapping("/editar/{id}")
  public String showEditForm(@PathVariable Long id, Model model) {
    var course = this.courseService.findCourseById(id);
    model.addAttribute("curso", course);

    return "";
  }

  @PostMapping("/editar/{id}")
  public String updateCourse(@ModelAttribute("curso") Course updatedCourse, @PathVariable Long id) {
    this.courseService.updateCourseById(id, updatedCourse);

    return "redirect:/cursos";
  }

  @GetMapping("/excluir/{id}")
  public String deleteCourse(@PathVariable Long id) {
    this.courseService.deleteCourseById(id);

    return "redirect:/cursos";
  }
}
