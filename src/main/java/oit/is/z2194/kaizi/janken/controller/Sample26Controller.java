package oit.is.z2194.kaizi.janken.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import oit.is.z2194.kaizi.janken.model.Score;

@Controller
@RequestMapping("/sample26")
public class Sample26Controller {

  @GetMapping
  public String sample26() {
    return "sample26.html";
  }

}
