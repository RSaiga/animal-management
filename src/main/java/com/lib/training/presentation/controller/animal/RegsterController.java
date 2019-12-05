package com.lib.training.presentation.controller.animal;

import com.lib.training.application.service.animal.AnimalService;
import com.lib.training.domain.model.animal.Animal;
import com.lib.training.domain.model.animal.AnimalType;
import com.lib.training.domain.model.animal.GenderType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/animal")
public class RegsterController {

  private static final String[] accept =
      {
          "name",
          "type",
          "birthDay",
          "gender",
          "feedingFee"
      };

  @InitBinder
  public void initBinder(WebDataBinder binder) {
    binder.setAllowedFields(accept);
  }

  AnimalService service;

  public RegsterController(AnimalService service) {
    this.service = service;
  }

  @ModelAttribute("genders")
  List<GenderType> getGenders() {
    return Arrays.asList(GenderType.values());
  }

  @ModelAttribute("animals")
  List<AnimalType> getAnimals() {
    return Arrays.asList(AnimalType.values());
  }

  @GetMapping
  String show(Model model) {
    model.addAttribute("animal", new Animal());
    return "register";
  }

  @RequestMapping("/register")
  String register(Model model, @ModelAttribute("animal") Animal animal) {
    service.register(animal);
    model.addAttribute("animal", new Animal());
    return "register";
  }
}
