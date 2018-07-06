package com.example.JingXiShoppingMall.repository;

import com.example.JingXiShoppingMall.entity.LogisticsRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogisticsRecordRepository extends JpaRepository<LogisticsRecord, Long> {
}
