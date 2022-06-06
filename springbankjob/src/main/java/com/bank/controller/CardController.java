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

import com.bank.VO.CardVO;
import com.bank.service.CardService;

@Controller
public class CardController {
	@Autowired
	private CardService cardService;

	@GetMapping("/insertCard")
	public String insertCard() throws Exception {
		return "insertCard";
	}

	@PostMapping("/addCard")
	public String addCard(CardVO cardVO) throws Exception {
		int result = cardService.insertCard(cardVO);
		if (result == 1)
			return "redirect:/";
		else
			return "insertCard";
	}

	@RequestMapping(value = "/listCard", method = RequestMethod.GET)

	public ModelAndView listCustomers(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		List cardsList = cardService.listCards();
		System.out.println("cardsList:" + cardsList);
		mav.addObject("cardsList", cardsList);
		mav.setViewName("listCard");
		return mav;
	}

	@GetMapping("/selectCard")
	public String listCards() throws Exception {
		return "selectCard";
	}

	@PostMapping("/showcard")
	public ModelAndView showcard(CardVO cardVO) throws Exception {

		ModelAndView mav = new ModelAndView();
		List cardsList = cardService.selectCards(cardVO);
		System.out.println(cardsList);
		mav.addObject("cardsList", cardsList);
		mav.setViewName("selectCard");

		return mav;
	}
}
