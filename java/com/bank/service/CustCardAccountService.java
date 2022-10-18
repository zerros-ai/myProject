package com.bank.service;

import com.bank.VO.AccountVO;
import com.bank.VO.CardVO;
import com.bank.VO.CustomerVO;

public interface CustCardAccountService {
	public int deleteCustCardAccount(CustomerVO custVO,CardVO cardvo, AccountVO accountVO);
}
