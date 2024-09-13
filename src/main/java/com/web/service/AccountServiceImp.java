package com.web.service;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.web.controller.AccountController;
import com.web.model.Account;
import com.web.repository.AccountRepo;
@Service
public class AccountServiceImp implements AccountService {
@Autowired
private AccountRepo repo;
	@Override
	public Account saveAccount(Account account) {
		Account a=repo.save(account);
		return a;
	}

	@Override
	public Account updateAccount(String password,String cpassword,Account account) {
		if(password==cpassword) {
			account.setPassword(cpassword);
            repo.save(account);	
		return account;
	}
		return null;
	}
	@Override
	public void deleteAccount(Long act_num) {
		// TODO Auto-generated method stub

	}

  @Override
	public Account getAccount(long act_num) {
	  Account get=repo.findById(act_num).get();
		return get;
	}

	@Override
	public List<Account> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
@Override
	public Account checkbalance(long act_num, String name, String password) {
		Account account=repo.findById(act_num).get();
		if(account.getAct_num()==act_num&&account.getName().equalsIgnoreCase(name)&&account.getPassword().equals(password)) {
			return account;
		}
		else {
		return null;
	}

}

@Override
public Account depositAmnt(long act_num, String name, String password, double damount) {
	Account account=repo.findById(act_num).get();
	if(account.getAct_num()==act_num&&account.getName().equalsIgnoreCase(name)&&account.getPassword().equals(password)) {
	account.setAmount(account.getAmount()+damount);
	repo.save(account);
	return account;
}
	return null;
}

@Override
public Account withdrawAmnt(long act_num, String name, String password, double wamount) {
	
	Account account=repo.findById(act_num).get();
	if(account.getAct_num()==act_num&&account.getName().equalsIgnoreCase(name)&&account.getPassword().equals(password)) {
		account.setAmount(account.getAmount()-wamount);
		repo.save(account);
		return account;
	}
		return null;
	}

	@Override
	public Account closeAccount(long act_num, String name, String password) {
		Account account=repo.findById(act_num).get();
		if(account.getAct_num()==act_num&&account.getName().equalsIgnoreCase(name)&&account.getPassword().equals(password)) {
			return account;
		}	return null;
	}

	@Override
	public Map<String, Account> targetAcnt(long act_num, String name, String password, long t_ac, double amount) {
		Account act=repo.findById(act_num).get();
		Account tct=null;
		if(act.getAct_num()==act_num&&act.getName().equalsIgnoreCase(name)&&act.getPassword().equals(password)) {
	     act.setAmount(act.getAmount()-amount);
		tct= repo.findById(t_ac).get();
		tct.setAmount(tct.getAmount()+amount);
		repo.save(tct);
		repo.save(act);
		Map<String,Account> abc = new HashMap<>();
		abc.put("act", act);
		abc.put("tct", tct);
		return abc;
	}
		
		return null;
	}

	@Override
	public String saveAccount(long act_num, String name, String password, String cpassword, double amount,
			String address, long mbnum, Account account) {
		boolean b=repo.existsById(act_num);
		if(b!=true) {
			if(password.equals(cpassword)) {
				repo.save(account);
				return "success";
			}
			else {
				return "password and conform password not same";
			}
			
		 }
			return "already exist plese login";

	}

	@Override
	public Account logAccount(long act_num, String password) {
		Account acnt=repo.findById(act_num).get();
		/*if(acnt.getAct_num()==act_num&&acnt.getPassword().equals(password)) {
				return acnt;
			
			}*/
		return acnt;
	}

	@Override
	public Account updateAccount(long act_num, String password, String cpassword) {
		 Account act=repo.findById(act_num).get();
	        if(act_num==act.getAct_num()&&password.equals(cpassword)) {
	        	act.setPassword(password);
	        	repo.save(act);
	        }
		return act;
	}
}


	

	