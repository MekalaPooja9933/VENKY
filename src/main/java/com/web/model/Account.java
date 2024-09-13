package com.web.model;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Account {
@Id
private long act_num;
private String name;
private String password;
private double amount;
private  String address;
private long mbnum;
public Account() {
	super();
}
public long getAct_num() {
	return act_num;
}
public void setAct_num(long act_num) {
	this.act_num = act_num;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public double getAmount() {
	return amount;
}
public void setAmount(double amount) {
	this.amount = amount;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public long getMbnum() {
	return mbnum;
}
public void setMbnum(long mbnum) {
	this.mbnum = mbnum;
}
@Override
public String toString() {
	return "Account [act_num=" + act_num + ", name=" + name + ", password=" + password  + ", amount=" + amount + ", address=" + address + ", mbnum=" + mbnum + "]";
}


}
