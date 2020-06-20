package com.test.controller;

import com.test.entity.KeyFeatureEN;
import com.test.entity.OverviewEN;
import com.test.entity.ProductEN;
import com.test.helper.Helper;
import com.test.repository.KeyFeatureRepository;
import com.test.repository.OverviewRepository;
import com.test.repository.ProductRepository;
import com.test.repository.RuleRepository;
import com.test.service.KeyFeatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

@Controller
public class HomeController {

  @Autowired
  private KeyFeatureRepository keyFeatureRepository;

  @Autowired
  private KeyFeatureService keyFeatureService;

  @Autowired
  private OverviewRepository overviewRepository;

  @Autowired
  private ProductRepository productRepository;

  @Autowired
  private RuleRepository ruleRepository;

  @GetMapping(path = "/")
  public ModelAndView home(@RequestParam Optional<Long> overviewId) {
    ModelAndView modelAndView = new ModelAndView("index");
    modelAndView.addObject("breadcrumbs", Arrays.asList("home","main page","add page"));
    modelAndView.addObject("productId", UUID.randomUUID().toString().toUpperCase());
    modelAndView.addObject("revisedOn", Helper.getDateWithoutTime(new Date()));
    modelAndView.addObject("revision", new Random().nextInt(10));
    modelAndView.addObject("revisedBy","John Doe");
    modelAndView.addObject("brands",Arrays.asList("Brand1","Brand2","Brand3","Brand4"));
    modelAndView.addObject("products",Arrays.asList("Product1","Product2","Product3","Product4"));
    modelAndView.addObject("productsList",productRepository.findAll());
    modelAndView.addObject("productIds",productRepository.findAll().stream().map(productEN -> productEN.getId()).collect(Collectors.toList()));
    modelAndView.addObject("featureIds",keyFeatureService.getFeatureIds());
    modelAndView.addObject("keyFeatures",keyFeatureRepository.findAll());
    modelAndView.addObject("keyFeature",new KeyFeatureEN());
    modelAndView.addObject("product",new ProductEN());
    modelAndView.addObject("rules",ruleRepository.findAll());
    if (overviewId.isPresent()){
      modelAndView.addObject("overview",overviewRepository.getOne(overviewId.get()));
    }else {
      modelAndView.addObject("overview",new OverviewEN());
    }
    return modelAndView;
  }
}
