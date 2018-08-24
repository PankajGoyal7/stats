package com.buildsupply.stats.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.buildsupply.stats.model.Transaction;
import com.buildsupply.stats.service.TransactionService;

@RestController
@RequestMapping(value = "/transactions")
public class TransactionsController {

	@Autowired
	private TransactionService transactionServiceObj;

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<String> addTransaction(@Valid @RequestBody Transaction transaction) {
		boolean response = transactionServiceObj.addTransaction(transaction);
		if (response) {
			return new ResponseEntity<String>("", HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<String>("", HttpStatus.BAD_REQUEST);
	}
}
