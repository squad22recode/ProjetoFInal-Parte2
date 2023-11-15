package com.gestaoCash.controllers.render;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/duvidas")
public class DoubtsController {

  public String doubts() {

    return "duvidas.html";
  }
}
