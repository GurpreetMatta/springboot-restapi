package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;

@Controller
public class MenuController {

  @GetMapping(path = "/menu1")
  public ModelAndView menu1() {
    ModelAndView modelAndView = new ModelAndView("menu-layout/menu1");
    modelAndView.addObject("breadcrumbs", Arrays.asList("home","menu1"));
    return modelAndView;
  }

  @GetMapping(path = "/menu2")
  public ModelAndView menu2() {
    ModelAndView modelAndView = new ModelAndView("menu-layout/menu2");
    modelAndView.addObject("breadcrumbs", Arrays.asList("home","menu2"));
    return modelAndView;
  }

  @GetMapping(path = "/menu3")
  public ModelAndView menu3() {
    ModelAndView modelAndView = new ModelAndView("menu-layout/menu3");
    modelAndView.addObject("breadcrumbs", Arrays.asList("home","menu3"));
    return modelAndView;
  }

  @GetMapping(path = "/menu4")
  public ModelAndView menu4() {
    ModelAndView modelAndView = new ModelAndView("menu-layout/menu4");
    modelAndView.addObject("breadcrumbs", Arrays.asList("home","menu4"));
    return modelAndView;
  }
}
