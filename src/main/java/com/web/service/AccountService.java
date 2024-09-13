package com.web.service;

import java.util.List;
import java.util.Map;

import com.web.model.Account;

public interface AccountService {
		    public Account saveAccount(Account account);
		    public Account updateAccount(String password,String cpassword,Account account);
		    public void deleteAccount(Long act_num);
		    public Account getAccount(long act_num);
		    public List<Account>getAll();
			public Account checkbalance(long act_num, String name, String password);
			public Account depositAmnt(long act_num, String name, String password, double damount);
			public Account withdrawAmnt(long act_num, String name, String password, double wamount);
			public Account closeAccount(long act_num, String name, String password);
			public Map<String, Account> targetAcnt(long act_num, String name, String password, long t_ac, double amount);
			public String saveAccount(long act_num, String name, String password, String cpassword, double amount,
					String address, long mbnum, Account account);
			public Account logAccount(long act_num, String password);
			public Account updateAccount(long act_num, String password, String cpassword);
			
			

		    
		}



    

