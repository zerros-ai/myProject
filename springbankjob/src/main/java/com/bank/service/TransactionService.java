package com.bank.service;

import java.util.List;

import com.bank.VO.TransactionVO;

public interface TransactionService {
	public List listTransactions();
	public List selectTransactions(TransactionVO transactionVO);
	public int insertTransaction(TransactionVO transactionVO);
	public int deleteTransaction(TransactionVO transactionVO);
}
