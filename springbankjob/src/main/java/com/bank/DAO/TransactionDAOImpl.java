package com.bank.DAO;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bank.VO.TransactionVO;

@Repository
public class TransactionDAOImpl implements TransactionDAO{
	@Autowired
    SqlSession sqlSession;
    
    String namespace = "transaction.";
	@Override
	public int insertTransaction(TransactionVO transactionVO) {
		// TODO Auto-generated method stub
		int result = sqlSession.insert(namespace+"insertTransaction",transactionVO);		
		return result;
	}
	@Override
	public int deleteTransaction(TransactionVO transactionVO) {
		// TODO Auto-generated method stub
		String cancelno;
		int result = sqlSession.delete(namespace+"deleteTransaction",transactionVO);
		System.out.println("1:"+result);

		return result;
	}
	@Override
	public List selectAllTransactionList() {
		// TODO Auto-generated method stub
		List result = sqlSession.selectList(namespace+"selectAllTransactionList");
        return result;
	}
	@Override
	public List selectTransactionList(TransactionVO transactionVO) {
		// TODO Auto-generated method stub
		return sqlSession.selectList(namespace+"selectTransactionList",transactionVO);
	}

}
