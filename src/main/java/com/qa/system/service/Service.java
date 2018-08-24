package com.qa.system.service;

import java.util.HashMap;
import java.util.Map;

import com.qa.system.accounts.Accounts;

public class Service {
	private Map<Integer, Accounts> accountsMap;
	private Integer counter = 1;
	
	public Service() {
		accountsMap = new HashMap<>();
		
	}
	public void addAccountsToMap(Accounts accountsToAdd) {
		accountsMap.put(counter, accountsToAdd);
		counter++;
	}
		
	public Accounts getAccountsFromMap(Integer accountsToAdd) {
		
		return accountsMap.get(accountsToAdd);
	}

		
}

