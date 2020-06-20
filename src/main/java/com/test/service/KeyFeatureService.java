package com.test.service;

import com.test.entity.KeyFeatureEN;
import com.test.repository.KeyFeatureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class KeyFeatureService {
  @Autowired private KeyFeatureRepository keyFeatureRepository;

  public void add() {
    KeyFeatureEN keyFeature = new KeyFeatureEN();
    keyFeatureRepository.save(keyFeature);
  }

  public List<String> getFeatureIds() {
    return keyFeatureRepository.findAll().stream().map(keyFeatureEN -> String.valueOf(keyFeatureEN.getId())).collect(Collectors.toList());
  }

  public void delete(String id) {
    keyFeatureRepository.deleteById(Long.valueOf(id));
  }

  public void update(KeyFeatureEN keyFeature,String id) {
    KeyFeatureEN keyFeatureEN = keyFeatureRepository.getOne(Long.valueOf(id));
    keyFeatureEN.setName(keyFeature.getName());
    keyFeatureRepository.save(keyFeatureEN);
  }
}
