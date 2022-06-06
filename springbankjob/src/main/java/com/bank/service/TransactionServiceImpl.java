package com.bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.DAO.TransactionDAO;
import com.bank.VO.TransactionVO;

@Service
public class TransactionServiceImpl implements TransactionService{
	@Autowired
	private TransactionDAO transactionDAO;

	@Override
	public int insertTransaction(TransactionVO transactionVO) {
		// TODO Auto-generated method stub
		int result = transactionDAO.insertTransaction(transactionVO);
		return result;
	}

	@Override
	public int deleteTransaction(TransactionVO transactionVO) {
		// TODO Auto-generated method stub
		int result = transactionDAO.deleteTransaction(transactionVO);
		return result;
	}

	@Override
	public List listTransactions() {
		// TODO Auto-generated method stub
		List transactionsList = transactionDAO.selectAllTransactionList();
        return transactionsList;
	}

	@Override
	public List selectTransactions(TransactionVO transactionVO) {
		// TODO Auto-generated method stub
		return transactionDAO.selectTransactionList(transactionVO);
	}

}
