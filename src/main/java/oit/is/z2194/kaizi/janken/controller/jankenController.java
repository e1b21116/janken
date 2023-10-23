package oit.is.z2194.kaizi.janken.controller;

import java.security.Principal;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import oit.is.z2194.kaizi.janken.model.janken;
import oit.is.z2194.kaizi.janken.model.Entry;
import oit.is.z2194.kaizi.janken.model.User;
import oit.is.z2194.kaizi.janken.model.UserMapper;
import oit.is.z2194.kaizi.janken.model.Match;
import oit.is.z2194.kaizi.janken.model.MatchMapper;

@Controller
public class jankenController {

  @Autowired
  private Entry entry;

  @Autowired
  UserMapper userMapper;

  @Autowired
  MatchMapper matchMapper;

  @GetMapping("/janken")
  public String janken_get(ModelMap model, Principal prin) {
    String loginUser = prin.getName();
    this.entry.addUser(loginUser);
    model.addAttribute("login_user", loginUser);
    ArrayList<User> users = userMapper.selectAllUsers();
    model.addAttribute("users", users);
    ArrayList<Match> matches = matchMapper.selectAllMatch();
    model.addAttribute("matches", matches);
    return "janken.html";
  }

  @GetMapping("/jankengame")
  public String jankenGame(@RequestParam String hand, ModelMap model1, ModelMap model2) {
    janken jn = new janken(hand);
    model1.addAttribute("hand", hand);
    model2.addAttribute("jankenResult", jn.getResult());
    return "janken.html";
  }


}
