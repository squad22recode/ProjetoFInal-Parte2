package com.gestaoCash.controllers.render;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/area-cliente")
public class ClientAreaController {

  @GetMapping
  public String clientArea() {

    return "area-cliente.html";
  }
}
