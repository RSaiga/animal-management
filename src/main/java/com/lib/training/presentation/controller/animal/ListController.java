package com.lib.training.presentation.controller.animal;

import com.lib.training.application.service.animal.AnimalService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/animals")
public class ListController {

  private AnimalService service;

  public ListController(AnimalService service) {
    this.service = service;
  }

  @GetMapping
  String show(Model model) {
    model.addAttribute("animals", service.searchAll());
    return "list";
  }
}
