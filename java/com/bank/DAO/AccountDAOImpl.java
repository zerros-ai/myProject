package com.bank.DAO;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bank.VO.AccountVO;

@Repository
public class AccountDAOImpl implements AccountDAO{
	@Autowired
	SqlSession sqlSession;
	String namespace = "account.";
	
	@Override
	public int insertAccount(AccountVO accountVO) {
		// TODO Auto-generated method stub
		int result = sqlSession.insert(namespace+"insertAccount", accountVO);
		
		return result;
	}

	@Override
	public int deleteAccount(AccountVO accountVO) {
		// TODO Auto-generated method stub
		int result = sqlSession.delete(namespace+"deleteAccount", accountVO);
		return result;
	}

	@Override
	public List selectAllAccountList() {
		// TODO Auto-generated method stub
		List result = sqlSession.selectList(namespace+"selectAllAccountList");
        return result;
	}

	@Override
	public List selectAccountList(AccountVO accountVO) {
		// TODO Auto-generated method stub
		return sqlSession.selectList(namespace+"selectAccountList",accountVO);
	}

	@Override
	public int deleteAccountbyCustno(AccountVO accountVO) {
		// TODO Auto-generated method stub
		return sqlSession.delete(namespace+"deleteAccountbycustno", accountVO);
	}

}
