package com.cy.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cy.util.GetLogistics;
import com.cy.pojo.Log;

@Controller
public class TransportController {
	
	@RequestMapping("toAlreadyBought")
	public String toAlreadyBought() {
		return "wuliu";
	}
	
	@RequestMapping("toDetailsOfTransport")
	public String toDetailsOfTransport(String num,String company,Model model) {
		GetLogistics log = new  GetLogistics();
		Log logistics = log.getLogistics(company, num);
		model.addAttribute("log",logistics.getTraces());
		System.out.println(logistics);
		return "wuliu";
		
	}
	
}
































