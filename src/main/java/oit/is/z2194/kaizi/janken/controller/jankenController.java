package oit.is.z2194.kaizi.janken.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import oit.is.z2194.kaizi.janken.model.janken;

@Controller
public class jankenController {

  @GetMapping("/login")
  public String login(@RequestParam String name, ModelMap model) {
    model.addAttribute("name", name);
    return "janken.html";
  }

  @GetMapping("/gu")
  public String gu(ModelMap model) {
    String user="ぐー";
    String cpu="ぐー";
    String result="Draw";
    model.addAttribute("user",user);
    model.addAttribute("cpu",cpu);
    model.addAttribute("result",result);
    return "janken.html";
  }

  @GetMapping("/tyoki")
  public String tyoki(ModelMap model) {
    String user="ちょき";
    String cpu="ぐー";
    String result="You Lose";
    model.addAttribute("user",user);
    model.addAttribute("cpu",cpu);
    model.addAttribute("result",result);
    return "janken.html";
  }

  @GetMapping("/pa")
  public String pa(ModelMap model){
    String user="ぱー";
    String cpu="ぐー";
    String result="You Win";
    model.addAttribute("user",user);
    model.addAttribute("cpu",cpu);
    model.addAttribute("result",result);
    return "janken.html";
  }

}
