package com.gestaoCash.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sobre")
public class AboutController {

  @GetMapping
  public String about() {

    return "sobre.html";
  }
}
