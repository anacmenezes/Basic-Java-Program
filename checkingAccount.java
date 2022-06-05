package PrgBankAccount;

import java.util.Scanner;

public class checkingAccount {

	private String clientName;
	private int branch;
	private int account;
	private double balance;
	
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public int getBranch() {
		return branch;
	}
	public void setBranch(int branch) {
		this.branch = branch;
	}
	public int getAccount() {
		return account;
	}
	public void setAccount(int account) {
		this.account = account;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		String data = "\nChecking Account ";
		data += "\nClient's Name: " + clientName;
		data += "\nBranch: " + branch;
		data += "\nAccount: " + account;
		return data;
	}
	
	public void deposit(double value, Scanner scan) {
		balance += value;
	}
	
	public boolean withdraw(double value) {
		if((balance - value) >= 0) {
			balance -= value;
			return true;
		}
		return false;
	}
}
