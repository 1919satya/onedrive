package com.bank;

import java.util.List;

/**
 * @author Dinesh.Rajput
 *
 */
public class RemoteAccountRepository   implements ClientAccountService {
	
	
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
		// TODO Auto-generated method stub
		return null;
	}
	
}