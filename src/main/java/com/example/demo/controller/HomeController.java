package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

  protected static final Logger LOGGER = LoggerFactory.getLogger(HomeController.class);

  @RequestMapping(value = "/", method = RequestMethod.GET)
  public String home(ModelMap map, @RequestParam(defaultValue = "Friend") String name) {
    LOGGER.info("home method executed");
    map.put("name", name);
    return "home";
  }

  @RequestMapping(value = "/sleep/", method = RequestMethod.GET)
  public String service1(ModelMap map, @RequestParam(defaultValue = "Stranger") Integer sleep) {
    LOGGER.info("service1 method executed");
    map.put("name", "Service 1");
    return "home";
  }
}