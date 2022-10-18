package com.bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.DAO.AccountDAO;
import com.bank.DAO.CardDAO;
import com.bank.VO.AccountVO;
import com.bank.VO.CardVO;

@Service
public class CardAccountServiceImpl implements CardAccountService{
	@Autowired 
	private CardDAO cardDAO;
	@Autowired
	private AccountDAO accountDAO;
	
	
	@Override
	public int deleteCardAccount(CardVO cardVO,AccountVO accountVO) {
		// TODO Auto-generated method stub
		int result1 = accountDAO.deleteAccount(accountVO);
		int result2 = cardDAO.deleteCard(cardVO);
				
		return result1;
	}
	
	/*
	@Override
	public int deleteCardAccount(AccountVO accountVO) {
		// TODO Auto-generated method stub
		int result1 = accountDAO.deleteAccount(accountVO);
		//int result2 = cardDAO.deleteCard(cardVO);
				
		return result1;
	}
	 */
}
