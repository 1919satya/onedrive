package com.bank;

import java.util.List;

public interface ClientAccountService {
	
	public String addAccount(Accounts accounts);
	
	public String deleteAccount(int accno);
	
	public List<Accounts> getAccount(int userid);
}
