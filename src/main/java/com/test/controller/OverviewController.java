package com.test.controller;

import com.test.entity.OverviewEN;
import com.test.repository.OverviewRepository;
import com.test.service.OverviewService;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Log
@Controller
@RequestMapping(path = "/overview")
public class OverviewController {

  @Autowired private OverviewService overviewService;

  @PostMapping(path = "/create")
  public String createOrUpdate(@RequestParam("collage") MultipartFile[] files, OverviewEN overviewEN) {
    OverviewEN overview = overviewService.createOverview(overviewEN, files);
    return "redirect:/?overviewId="+overview.getId();
  }
}
