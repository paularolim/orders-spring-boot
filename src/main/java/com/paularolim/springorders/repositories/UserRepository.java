package com.paularolim.springorders.repositories;

import com.paularolim.springorders.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
