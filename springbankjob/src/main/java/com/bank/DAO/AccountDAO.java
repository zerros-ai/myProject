package com.bank.DAO;

import java.util.List;

import com.bank.VO.AccountVO;

public interface AccountDAO {
	public List selectAllAccountList();
	public List selectAccountList(AccountVO accountVO);
	public int insertAccount(AccountVO accountVO);
	public int deleteAccount(AccountVO accountVO);
	public int deleteAccountbyCustno(AccountVO accountVO);
}
