package com.bank;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ClientController {

	@Autowired
	ClientUserService clientUserService;
	
	@Autowired
	ClientAccountService clientAccountService;
	
	@RequestMapping("/home")
	public ModelAndView home(ModelAndView model) {
		model.addObject("user" , new User());
		model.setViewName("login");
		return model;
	}
	
	@RequestMapping("/Authenticate")
	public ModelAndView loginAuthrntication(@ModelAttribute User user) {
		String result = clientUserService.login(user);
		if (result.equals("Login Successfull")) {
			return new ModelAndView("accounthome");
		}
		if (result.equals("Invalid Credentials")) {
			return new ModelAndView("login");
		} return null;
			
	}
	@RequestMapping("/UserAccounts")
	public  ModelAndView getAccount(ModelAndView model) {
		List<Accounts> accounts=clientAccountService.getAccount(1);
		model.addObject("Accounts",accounts);
		model.setViewName("account");
		return model;
	}
}
