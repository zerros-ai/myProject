package com.bank.service;

import java.util.List;

import com.bank.VO.CustomerVO;

public interface CustomerService {
	public List listCustomers();
	public List selectCustomers(CustomerVO customerVO);
	public int insertCustomer(CustomerVO customerVO);
	public int deleteCustomer(CustomerVO customerVO);
}


