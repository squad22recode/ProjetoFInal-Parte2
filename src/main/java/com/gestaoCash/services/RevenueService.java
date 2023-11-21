package com.gestaoCash.services;

import java.util.List;

import com.gestaoCash.model.Revenue;

public interface RevenueService {
  void saveRevenue(Revenue revenue);

  List<Revenue> findAllRevenues();

  Revenue findRevenueById(Long id);
  

  void updateRevenueById(Long id, Revenue updatedRevenue);

  void deleteRevenueById(Long id);
}
