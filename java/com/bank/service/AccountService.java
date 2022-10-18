package com.bank.service;

import java.util.List;

import com.bank.VO.AccountVO;

public interface AccountService {
	public List listAccounts();
	public List selectAccounts(AccountVO accountVO);
	public int insertAccount(AccountVO accountVO);
	public int deleteAccount(AccountVO accountVO);
}
