package com.gestaoCash.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gestaoCash.model.Revenue;
import com.gestaoCash.repositories.RevenueRepository;
import com.gestaoCash.services.RevenueService;

import jakarta.persistence.EntityNotFoundException;

@Service
public class RevenueServiceImpl implements RevenueService {

  @Autowired
  private RevenueRepository revenueRepository;

  @Override
  public void saveRevenue(Revenue revenue) {
    this.revenueRepository.save(revenue);
  }

  @Override
  @Transactional(readOnly = true)
  public List<Revenue> findAllRevenues() {
    return this.revenueRepository.findAll();
  }

  @Override
  @Transactional(readOnly = true)
  public Revenue findRevenueById(Long id) {
    var optionalRevenue = this.revenueRepository.findById(id);

    if (optionalRevenue.isPresent()) {
      var revenue = optionalRevenue.get();
      return revenue;
    } else {
      throw new EntityNotFoundException();
    }
  }

  @Override
  public void updateRevenueById(Long id, Revenue updatedRevenue) {
    this.saveRevenue(updatedRevenue);
  }

  @Override
  public void deleteRevenueById(Long id) {
    this.revenueRepository.deleteById(id);
  }
}
