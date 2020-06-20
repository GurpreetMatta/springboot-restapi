package com.test.service;

import com.test.entity.ProductEN;
import com.test.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

  @Autowired private ProductRepository productRepository;

  public void add() {
    productRepository.save(new ProductEN());
  }

  public void delete(String id) {
    productRepository.deleteById(Long.valueOf(id));
  }

  public void updateProduct(String id, ProductEN product) {
    ProductEN productEN = productRepository.getOne(Long.valueOf(id));
    productEN.setProductNumber(product.getProductNumber());
    productEN.setDescription(product.getDescription());
    productRepository.save(productEN);
  }
}
