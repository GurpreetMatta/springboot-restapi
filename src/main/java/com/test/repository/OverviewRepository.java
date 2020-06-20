package com.test.repository;

import com.test.entity.OverviewEN;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OverviewRepository extends JpaRepository<OverviewEN,Long> {
}
