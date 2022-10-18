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

import com.bank.VO.TransactionVO;
import com.bank.service.TransactionService;

@Controller
public class TransactionController {
	@Autowired
	private TransactionService transactionService;

	@GetMapping("/insertTransaction")
	public String insertTransaction() throws Exception {
		return "insertTransaction";
	}

	@PostMapping("/addTransaction")
	public String addTransaction(TransactionVO transactionVO) throws Exception {
		int result = transactionService.insertTransaction(transactionVO);
		if (result == 1)
			return "redirect:/";
		else
			return "insertTransaction";
	}

	@GetMapping("/deleteTransaction")
	public String deleteTransaction() throws Exception {
		return "deleteTransaction";
	}

	@PostMapping("/subTransaction")
	public String subTransaction(TransactionVO transactionVO) throws Exception {
		int result = transactionService.deleteTransaction(transactionVO);

		if (result == 1)
			return "redirect:/";
		else
			return "/home";
	}

	@RequestMapping(value = "/listTransaction", method = RequestMethod.GET)

	public ModelAndView listCustomers(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		List transactionsList = transactionService.listTransactions();
		System.out.println("transactionsList:" + transactionsList);
		mav.addObject("transactionsList", transactionsList);
		mav.setViewName("listTransaction");
		return mav;
	}

	@GetMapping("/selectTransaction")
	public String listTransactions() throws Exception {
		return "selectTransaction";
	}

	@PostMapping("/showTrans")
	public ModelAndView showTrans(TransactionVO transactionVO) throws Exception {

		ModelAndView mav = new ModelAndView();
		List transactionsList = transactionService.selectTransactions(transactionVO);
		System.out.println(transactionsList);
		mav.addObject("transactionsList", transactionsList);
		mav.setViewName("selectTransaction");

		return mav;
	}
}
