package com.bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.DAO.AccountDAO;
import com.bank.DAO.CardDAO;
import com.bank.DAO.CustomerDAO;
import com.bank.VO.AccountVO;
import com.bank.VO.CardVO;
import com.bank.VO.CustomerVO;

@Service
public class CustCardAccountServiceImpl implements CustCardAccountService {

	@Autowired
	CustomerDAO customerDAO;
	@Autowired
	CardDAO cardDAO;
	@Autowired
	AccountDAO accountDAO;

	@Override
	public int deleteCustCardAccount(CustomerVO custVO, CardVO cardvo, AccountVO accountVO) {
		// TODO Auto-generated method stub
		int result1 = customerDAO.deleteCustomer(custVO);
		int result2 = cardDAO.deleteCardbyCustno(cardvo);
		int result3 = accountDAO.deleteAccountbyCustno(accountVO);
		return result3;
	}

}
