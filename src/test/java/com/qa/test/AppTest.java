package com.qa.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.qa.system.accounts.Accounts;
import com.qa.system.service.Service;

import junit.framework.Assert;
import junit.framework.TestCase;

public class AppTest {
	
	@Test
	public void countNames()
	{
		Accounts Tom = new Accounts("Tom","Smith", 1234);
		Accounts Tom1 = new Accounts("Tom","Jones", 3546);
		
		Service userAdd = new Service();
		userAdd.addAccountsToMap(Tom);
		userAdd.addAccountsToMap(Tom1);
		
		
		int instances = userAdd.countFirstName("Tom");
		assertEquals(2,instances);
		
	}
	

}
