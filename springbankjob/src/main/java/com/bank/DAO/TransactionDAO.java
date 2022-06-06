package com.bank.DAO;

import java.util.List;


import com.bank.VO.TransactionVO;

public interface TransactionDAO {
	public List selectAllTransactionList();
	public List selectTransactionList(TransactionVO transactionVO);
	public int insertTransaction(TransactionVO transactionVO);
	public int deleteTransaction(TransactionVO transactionVO);
}
