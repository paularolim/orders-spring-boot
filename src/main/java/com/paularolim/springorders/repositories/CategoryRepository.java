package com.paularolim.springorders.repositories;

import com.paularolim.springorders.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
