package com.bank.DAO;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bank.VO.CardVO;

@Repository
public class CardDAOImpl implements CardDAO{
	@Autowired
    SqlSession sqlSession;
    
    String namespace = "card.";
	@Override
	public int insertCard(CardVO cardVO) {
		// TODO Auto-generated method stub
		int result = sqlSession.insert(namespace+"insertCard",cardVO);
		return result;
	}
	@Override
	public int deleteCard(CardVO cardVO) {
		// TODO Auto-generated method stub
		int result = sqlSession.delete(namespace+"deleteCard",cardVO);
		return result;
	}
	@Override
	public List selectAllCardList() {
		// TODO Auto-generated method stub
		 List result = sqlSession.selectList(namespace+"selectAllCardList");
	        return result;
	}
	@Override
	public List selectCardList(CardVO cardVO) {
		// TODO Auto-generated method stub
		return sqlSession.selectList(namespace+"selectCardList",cardVO);
	}
	@Override
	public int deleteCardbyCustno(CardVO cardVO) {
		// TODO Auto-generated method stub
		return sqlSession.delete(namespace+"deleteCardbycustno",cardVO);
	}

}
