package com.bank;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

/**
 * @author Dinesh.Rajput
 *
 */
public class RemoteAccountRepository   implements ClientAccountService {
	@Autowired
	protected RestTemplate restTemplate;
	
	protected String serviceUrl;
	
	public RemoteAccountRepository(String serviceUrl) {
		this.serviceUrl = serviceUrl.startsWith("http") ? serviceUrl
				: "http://" + serviceUrl;
	}

	@Override
	public String addAccount(Accounts accounts) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteAccount(int accountnum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Accounts> getAccount(int userid) {
			Accounts[] accounts= restTemplate.getForObject(serviceUrl+ "/account/getAccount/"+ userid ,Accounts[].class);
		return Arrays.asList(accounts);
	}
	
}