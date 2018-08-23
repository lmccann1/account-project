package com.qa.accountapplication.account;

import com.qa.system.accounts.Accounts;
import com.qa.system.service.Service;

/**
 * Hello world!
 *
 */

public class App {
	public static void main(String args[]) {
		System.out.println("Hello world to the standard out");
		
		Accounts Tom = new Accounts("Tom","Smith",1234);
		Service userAdd = new Service();
        userAdd.addAccountsToMap(Tom);
        
        
        System.out.println(userAdd.getAccountsFromMap(1).toString());

 
	}

}
