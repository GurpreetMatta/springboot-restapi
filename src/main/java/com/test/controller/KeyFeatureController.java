package com.test.controller;

import com.test.entity.KeyFeatureEN;
import com.test.service.KeyFeatureService;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Log
@Controller
@RequestMapping(path = "/keyfeature")
public class KeyFeatureController {

  @Autowired private KeyFeatureService keyFeatureService;

  @GetMapping(path = "/add")
  public String addKeyFeature() {
    keyFeatureService.add();
    return "redirect:/";
  }

  @PostMapping(path = "/delete/{id}")
  public String delete(@PathVariable String id) {
    keyFeatureService.delete(id);
    return "redirect:/";
  }

  @PostMapping(path = "/create/{id}")
  public String create(@PathVariable String id, KeyFeatureEN keyFeature) {
    keyFeatureService.update(keyFeature,id);
    return "redirect:/";
  }
}
