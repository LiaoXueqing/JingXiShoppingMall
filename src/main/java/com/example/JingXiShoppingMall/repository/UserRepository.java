package com.example.JingXiShoppingMall.repository;

import com.example.JingXiShoppingMall.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
