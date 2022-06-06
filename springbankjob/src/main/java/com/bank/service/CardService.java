package com.bank.service;

import java.util.List;

import com.bank.VO.CardVO;
import com.bank.VO.TransactionVO;

public interface CardService {
	public List listCards();
	public List selectCards(CardVO cardVO);
	public int insertCard(CardVO cardVO);
	public int deleteCard(CardVO cardVO);
}
