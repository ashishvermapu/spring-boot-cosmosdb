package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

  @RequestMapping(value = "/", method = RequestMethod.GET)
  public String home(ModelMap map, @RequestParam(defaultValue = "Stranger") String name) {
    map.put("name", name);
    return "home";
  }

  @RequestMapping(value = "/service1", method = RequestMethod.GET)
  public String service1(ModelMap map, @RequestParam(defaultValue = "Stranger") String name) {
    map.put("name", "Service 1");
    return "home";
  }

  @RequestMapping(value = "/service2", method = RequestMethod.GET)
  public String service2(ModelMap map, @RequestParam(defaultValue = "Stranger") String name) {
    map.put("name", "Service 2");
    return "home";
  }
}