package com.bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.DAO.CardDAO;
import com.bank.VO.CardVO;

@Service
public class CardServiceImpl implements CardService{
	@Autowired 
	private CardDAO cardDAO;

	@Override
	public int insertCard(CardVO cardVO) {
		// TODO Auto-generated method stub
		int result = cardDAO.insertCard(cardVO);
		return result;
	}

	@Override
	public int deleteCard(CardVO cardVO) {
		// TODO Auto-generated method stub
		int result = cardDAO.deleteCard(cardVO);
		return result;
	}

	@Override
	public List listCards() {
		// TODO Auto-generated method stub
		List cardsList = cardDAO.selectAllCardList();
        return cardsList;
	}

	@Override
	public List selectCards(CardVO cardVO) {
		// TODO Auto-generated method stub
		return cardDAO.selectCardList(cardVO);
	}

}
