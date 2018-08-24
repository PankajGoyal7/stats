package com.buildsupply.stats.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.buildsupply.stats.model.Stats;
import com.buildsupply.stats.service.TransactionService;

@RestController
@RequestMapping(value="/statistics")
public class StatisticsController {
	
	@Autowired
	private TransactionService transactionServiceObj;
	
	@RequestMapping(method=RequestMethod.GET)
	public Stats getStatistics() {
		return transactionServiceObj.getTransactionStats();
	}
	
}
