package com.test.controller;

import com.test.entity.RuleEN;
import com.test.repository.RuleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/rules")
public class RuleController {

    @Autowired
    private RuleRepository ruleRepository;

    @GetMapping(path = "/add")
    public String add(){
        ruleRepository.save(new RuleEN());
        return "redirect:/";
    }

    @PostMapping(path = "/delete/{id}")
    public String delete(@PathVariable String id){
        ruleRepository.deleteById(Long.valueOf(id));
        return "redirect:/";
    }

}
