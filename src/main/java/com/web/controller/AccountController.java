package com.web.controller;
import java.util.Map;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.web.model.Account;
import com.web.service.AccountService;
@Controller
public class AccountController {
	@Autowired
	private AccountService service;
		@RequestMapping("/")
	public String homePage() {
		return "home";
	}
		@RequestMapping("/account")
		public String accountForm(Model model) {
			Account account=new Account();
			model.addAttribute("account", account);
			return "newAccount";
		}
		@RequestMapping("/register")
		@ResponseBody
		public String saveAccount(@RequestParam  long act_num,@RequestParam String name,@RequestParam String password,@RequestParam String cpassword,@RequestParam double amount,@RequestParam String address,@RequestParam long mbnum, Account account, Model model) {
			String accnt=service.saveAccount( act_num,name,password,cpassword,amount,address,mbnum,account);
			model.addAttribute("bank", accnt);
			return accnt;
}
		@RequestMapping("/balance")
		public String balancePage() {
			return "Balance";
		}
		@RequestMapping("/checkbalance")
		public String checkbalance(@RequestParam long act_num,@RequestParam String name,@RequestParam String password, Account account,ModelMap model) {
		Account bank=service.checkbalance(act_num,name,password);
		if(bank!=null) {
			model.put("accounts", bank);
			return "viewbalance";
		}
		else {
			return "Wstatement";
		}
		}
		@RequestMapping("/deposit")
		public String depositPage() {
			return "Deposit";
		}
		@RequestMapping("/deposits")
		public String depositAmnt(@RequestParam long act_num,@RequestParam String name,@RequestParam String password,@RequestParam double damount,Account account,ModelMap model) {
			Account deposit=service.depositAmnt(act_num,name,password,damount);
			model.addAttribute("bank", deposit);
			double originalbal=deposit.getAmount()-damount;
			model.put("originalbal",originalbal);
			model.put("damount",damount);
			return "updateamnt";
		}
		@RequestMapping("/withdraw")
		public String withdrawPage() {
			return "withdraw";
		}
		@RequestMapping("/withdrawamnt")
		public String withdrawAmnt(@RequestParam long act_num,@RequestParam String name,@RequestParam String password,@RequestParam double wamount,Account account,ModelMap model) {
			Account withdraw=service.withdrawAmnt(act_num,name,password,wamount);
			 if(withdraw!=null) {
			model.put("bank", withdraw);
			double originalbal=withdraw.getAmount()+wamount;
			model.put("originalbal",originalbal);
			model.put("wamount", wamount);
			return "withdrawAmnt";
		}
			else {
				return "Wstatement";
			}
		}
		@RequestMapping("/transfer")
		public String tranforPage() {
			return "Transfer";
		}
		@RequestMapping("/transfers")
		public String transforAmnt(@RequestParam long act_num,@RequestParam String name,
				@RequestParam String password,@RequestParam long t_ac,@RequestParam double amount,
				Account account,ModelMap model ) {
	 Map<String,Account> accounts=service.targetAcnt(act_num,name,password,t_ac,amount);
	 if(accounts!=null) {
		Account act=accounts.get("act");
		Account tct=accounts.get("tct");
			double aftTargetbal=tct.getAmount()+amount;
			double TargetOrg=tct.getAmount();
			double aftTranact=act.getAmount()-amount;
			double actOrg=act.getAmount();
			model.put("aftTargetbal",aftTargetbal);
			model.put("TargetOrg",TargetOrg);
			model.put("aftTranact",aftTranact);
			model.put("actOrg",actOrg);
			model.put("bank",accounts);
			return "TransforAmnt";
	 }

	 else {
		 return "Wstatement";
	 }
}

@RequestMapping("/closeac")
public String closepage() {
	return "Close";
}
@RequestMapping("/closed")
public String closeAccount(@RequestParam long act_num,@RequestParam String name,@RequestParam String password,Account account,ModelMap model) {
	Account close=service.closeAccount(act_num,name,password);
	if(close!=null) {
	model.put("bank", close);
	return "closed";
	}
	else return"Wstatement";
	
}
@RequestMapping("/aboutus")
public String aboutPage() {
	return "aboutus";
}
@RequestMapping("/log")
public String logPage() {
	return "log";
}
	@RequestMapping("/login {act_num}")
	public String loginPage(@RequestParam @PathVariable long act_num,@RequestParam String password,Account account,ModelMap model) {
		Account log=service.logAccount(act_num,password);
		model.put("user",log);
		if(log.getAct_num()==act_num&&log.getPassword().equals(password)) {
			return "Statement";
		}		
		else {
			return "Wstatement";
		}
		
		
	}
	
	@RequestMapping("/chartboard")
		public String profilePage() {
		return "Help";
			
		}
	@RequestMapping("/edit")
	public String UpdatePage() {
		return "Reset";
	}
	@RequestMapping("/reset")
	public String ResetPassword(@RequestParam long act_num,String password,String cpassword,Account account,ModelMap model) {
		Account reset=service.updateAccount(act_num,password,cpassword);
		if(reset!=null) {
		return "Update";
	}
		else {
			return "Wstatement";
		}
	}

	
	}		
	








