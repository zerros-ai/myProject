package com.bank.DAO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bank.VO.CustomerVO;

@Repository
public class CustomerDAOImpl implements CustomerDAO {
    @Autowired
    SqlSession sqlSession;
    
    
    String namespace = "customer.";
    
    @Override
    public List selectAllCustomerList() {
        List result = sqlSession.selectList(namespace+"selectAllCustomerList");
        return result;
    }
    
    @Override
    public List selectCustomerList(CustomerVO customerVO) {
    	
    	return sqlSession.selectList(namespace+"selectCustomerList", customerVO);
        
        
    }

	@Override
	public int insertCustomer(CustomerVO customerVO) {
		// TODO Auto-generated method stub
		int result = sqlSession.insert(namespace+"insertCustomer", customerVO);
		return result;
	}

	@Override
	public int deleteCustomer(CustomerVO customerVO) {
		// TODO Auto-generated method stub
		int result = sqlSession.delete(namespace+"deleteCustomer", customerVO);
		return result;
	}
}

