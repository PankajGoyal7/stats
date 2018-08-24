package com.buildsupply.stats.service;

import org.springframework.stereotype.Service;

import com.buildsupply.stats.model.Stats;
import com.buildsupply.stats.model.Transaction;

@Service
public interface TransactionService {

	public boolean addTransaction(Transaction transaction);
	
	public Stats getTransactionStats();
}
