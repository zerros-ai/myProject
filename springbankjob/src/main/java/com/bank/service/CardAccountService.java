package com.bank.service;

import com.bank.VO.AccountVO;
import com.bank.VO.CardVO;

public interface CardAccountService {		
	public int deleteCardAccount(CardVO cardvo, AccountVO accountVO);
	//public int deleteCardAccount(AccountVO accountVO);
}
