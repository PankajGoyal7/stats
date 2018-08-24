package com.buildsupply.stats.repository;


import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.buildsupply.stats.model.Stats;
import com.buildsupply.stats.model.Transaction;

@Repository
@Scope(value="request")
public interface TransactionsDAO extends JpaRepository<Transaction,Long>{
	
	@Query("SELECT  new com.buildsupply.stats.model.Stats(count(t.id) as count ,max(t.amount) as max ,min(t.amount) as min ,sum(t.amount) as sum ,avg(t.amount) as avg) FROM Transaction as t  where t.timestamp >= :timestamp")
	public List<Stats> getTransactionStats(@Param("timestamp") long timestamp);
}
