package com.test.repository;

import com.test.entity.ProductEN;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEN,Long> {
}
