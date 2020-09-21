package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.ExchangeValue;

public interface ExchangevalueRepository extends JpaRepository<ExchangeValue, Integer> {
      ExchangeValue findByFromAndTo(String from,String to);
}
