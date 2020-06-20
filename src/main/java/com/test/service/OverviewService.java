package com.test.service;

import com.test.entity.OverviewEN;
import com.test.repository.OverviewRepository;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

@Log
@Service
public class OverviewService {

  @Autowired private OverviewRepository overviewRepository;

  public OverviewEN createOverview(OverviewEN overviewEN, MultipartFile[] files) {
    if (Objects.nonNull(files)) {
      try {
        File file = convertMultiPartToFile(files[0]);
        overviewEN.setImgages(file.getAbsolutePath());
      } catch (IOException e) {
        log.info(e.getMessage());
      }
    }
    return overviewRepository.save(overviewEN);
  }

  private File convertMultiPartToFile(MultipartFile file) throws IOException {
    File convFile = new File(file.getOriginalFilename());
    FileOutputStream fos = new FileOutputStream(convFile);
    fos.write(file.getBytes());
    fos.close();
    return convFile;
  }
}
