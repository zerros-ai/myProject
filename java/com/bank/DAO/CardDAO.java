package com.bank.DAO;

import java.util.List;

import com.bank.VO.CardVO;

public interface CardDAO {
	public List selectAllCardList();
	public List selectCardList(CardVO cardVO);
	public int insertCard(CardVO cardVO);
	public int deleteCard(CardVO cardVO);
	public int deleteCardbyCustno(CardVO cardVO);
}
