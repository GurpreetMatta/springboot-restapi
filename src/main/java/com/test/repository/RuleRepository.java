package com.test.repository;

import com.test.entity.RuleEN;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RuleRepository extends JpaRepository<RuleEN,Long> {
}
