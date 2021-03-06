package com.paularolim.springorders.repositories;

import com.paularolim.springorders.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
