package com.bank.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bank.VO.AccountVO;
import com.bank.VO.CardVO;
import com.bank.VO.CustomerVO;
import com.bank.service.CustCardAccountService;
import com.bank.service.CustomerService;

@Controller
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	@Autowired
	private CustCardAccountService cca;

	@RequestMapping(value = "/listCustomer", method = RequestMethod.GET)

	public ModelAndView listCustomers(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		List customersList = customerService.listCustomers();
		System.out.println("customersList:" + customersList);
		mav.addObject("customersList", customersList);
		mav.setViewName("listCustomer");
		return mav;
	}

	@GetMapping("/selectCustomer")
	public String listCustomers() throws Exception {
		return "selectCustomer";
	}

	@PostMapping("/showcust")
	public ModelAndView showcust(CustomerVO customerVO) throws Exception {

		ModelAndView mav = new ModelAndView();
		List customersList = customerService.selectCustomers(customerVO);
		System.out.println(customersList);
		mav.addObject("customersList", customersList);
		mav.setViewName("selectCustomer");

		return mav;
	}

	@GetMapping("/insertCustomer")
	public String insertCustomer() throws Exception {
		return "insertCustomer";
	}

	@PostMapping("/addCustomer")
	public String addCustomer(CustomerVO customerVO) throws Exception {
		int result = customerService.insertCustomer(customerVO);
		if (result == 1)
			return "redirect:/";
		else
			return "insertCustomer";
	}

	@GetMapping("/deleteCustomer")
	public String deleteCustomer() throws Exception {
		return "deleteCustomer";
	}

	@PostMapping("/subCustomer")
	public String subCustomer(CustomerVO customerVO, CardVO cardVO, AccountVO accountVO) throws Exception {
		int result = cca.deleteCustCardAccount(customerVO, cardVO, accountVO);

		if (result != 1)
			return "redirect:/";
		else
			return "/home";
	}

}
