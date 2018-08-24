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
	public int countFirstName(String compare) {
		// TODO Auto-generated method stub
		int counter1 = 0;
		
		
		
	for(int i=1; i <= accountsMap.size(); i++) {
		if(accountsMap.get(i).getFirstName().equals(compare)) {
			counter1++;
			
		}
		
	}
		return counter1;
	}

		
}

