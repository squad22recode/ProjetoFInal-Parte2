package com.gestaoCash.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestaoCash.model.Revenue;

@Repository
public interface RevenueRepository extends JpaRepository<Revenue, Long> {

}
