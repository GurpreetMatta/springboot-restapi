package com.test.controller;

import com.test.entity.ProductEN;
import com.test.service.ProductService;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Log
@Controller
@RequestMapping(path = "/products")
public class ProductController {

  @Autowired private ProductService productService;

  @GetMapping(path = "/add")
  public String add() {
    productService.add();
    return "redirect:/";
  }

  @PostMapping(path = "/delete/{id}")
  public String delete(@PathVariable String id) {
    productService.delete(id);
    return "redirect:/";
  }

  @PostMapping(path = "/create/{id}")
  public String updateProduct(@PathVariable String id, ProductEN productEN) {
    productService.updateProduct(id, productEN);
    return "redirect:/";
  }
}
