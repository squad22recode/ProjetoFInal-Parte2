package com.gestaoCash.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.gestaoCash.model.Revenue;

@Repository
public interface RevenueRepository extends JpaRepository<Revenue, Long> {

//	  @Query("select a.id, a.data, a.observacao, a.categoria, a.valor from despesa_usuario a inner join a.usuario b where b.id = :id " )
//	    List<Revenue> findRevenueByUser(@Param("id") Long id);
}
