package com.buildsupply.stats.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.buildsupply.stats.model.Stats;
import com.buildsupply.stats.model.Transaction;
import com.buildsupply.stats.repository.TransactionsDAO;

@Component
public class TransactionServiceImpl implements TransactionService {
	
	// 60 seconds 
	private static final Long LAST_SECONDS_TIME = 60000L;
	
	@Autowired
	private TransactionsDAO dao;
	
	@Override
	public boolean addTransaction(Transaction transaction) {

		// take a gap of 1 second till request came from another service/server 
		if(transaction.getTimestamp() < (System.currentTimeMillis() - 10000))
			return false;
		
		dao.saveAndFlush(transaction);
		return true;
	}
	
	@Override
	public Stats getTransactionStats() {
		return dao.getTransactionStats(System.currentTimeMillis() - LAST_SECONDS_TIME).get(0);
	}
	
}
