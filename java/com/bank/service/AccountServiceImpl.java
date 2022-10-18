package com.bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.DAO.AccountDAO;
import com.bank.VO.AccountVO;

@Service
public class AccountServiceImpl implements AccountService{
	@Autowired
	private AccountDAO accountDAO;

	@Override
	public int insertAccount(AccountVO accountVO) {
		// TODO Auto-generated method stub
		int result = accountDAO.insertAccount(accountVO);
		return result;
	}

	@Override
	public int deleteAccount(AccountVO accountVO) {
		// TODO Auto-generated method stub
		int result = accountDAO.deleteAccount(accountVO);
		return result;
	}

	@Override
	public List listAccounts() {
		// TODO Auto-generated method stub
		List accountsList = accountDAO.selectAllAccountList();
        return accountsList;
	}

	@Override
	public List selectAccounts(AccountVO accountVO) {
		// TODO Auto-generated method stub
		return accountDAO.selectAccountList(accountVO);
	}

}
