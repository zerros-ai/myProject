package com.bank.DAO;

import java.util.List;

import com.bank.VO.CustomerVO;

public interface CustomerDAO {
	public List selectAllCustomerList();
	public List selectCustomerList(CustomerVO customerVO);
	public int insertCustomer(CustomerVO customerVO);
	public int deleteCustomer(CustomerVO customerVO);
}
