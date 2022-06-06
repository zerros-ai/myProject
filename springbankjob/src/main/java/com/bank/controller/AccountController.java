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
import com.bank.service.AccountService;
import com.bank.service.CardAccountService;

@Controller
public class AccountController {
	@Autowired
	private AccountService accountService;
	@Autowired
	private CardAccountService cardaccountService;

	@GetMapping("/insertAccount")
	public String insertAccount() throws Exception {
		return "insertAccount";
	}

	@PostMapping("/addAccount")
	public String addAccount(AccountVO accountVO) throws Exception {
		int result = accountService.insertAccount(accountVO);
		if (result == 1)
			return "redirect:/";
		else
			return "insertAccount";
	}

	@GetMapping("/deleteCardAccount")
	public String deleteCardAccount() throws Exception {
		return "deleteCardAccount";
	}

	@PostMapping("/subCardAccount")

	public String subCardAccount(CardVO cardVO, AccountVO accountVO) throws Exception {

		int result = cardaccountService.deleteCardAccount(cardVO, accountVO);

		if (result != 1)
			return "redirect:/";
		else
			return "/home";
	}

	@RequestMapping(value = "/listAccount", method = RequestMethod.GET)

	public ModelAndView listAccounts(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		List accountsList = accountService.listAccounts();
		System.out.println("accountsList:" + accountsList);
		mav.addObject("accountsList", accountsList);
		mav.setViewName("listAccount");
		return mav;
	}

	@GetMapping("/selectAccount")
	public String listAccounts() throws Exception {
		return "selectAccount";
	}

	@PostMapping("/showaccount")
	public ModelAndView showaccount(AccountVO accountVO) throws Exception {

		ModelAndView mav = new ModelAndView();
		List accountsList = accountService.selectAccounts(accountVO);
		System.out.println(accountsList);
		mav.addObject("accountsList", accountsList);
		mav.setViewName("selectAccount");

		return mav;
	}

}
