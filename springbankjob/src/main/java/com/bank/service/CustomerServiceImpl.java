package com.bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.bank.DAO.CustomerDAO;
import com.bank.VO.CustomerVO;

@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerDAO customerDAO;

	@Override
	public List listCustomers() throws DataAccessException {
		List customersList = customerDAO.selectAllCustomerList();
		return customersList;
	}

	@Override
	public List selectCustomers(CustomerVO customerVO) {
		// TODO Auto-generated method stub
		return customerDAO.selectCustomerList(customerVO);

	}

	@Override
	public int insertCustomer(CustomerVO customerVO) {
		// TODO Auto-generated method stub
		int result = customerDAO.insertCustomer(customerVO);
		return result;
	}

	@Override
	public int deleteCustomer(CustomerVO customerVO) {
		// TODO Auto-generated method stub
		int result = customerDAO.deleteCustomer(customerVO);
		return result;
	}

}
