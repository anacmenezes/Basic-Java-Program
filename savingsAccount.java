package PrgBankAccount;

import java.util.Calendar;

public class savingsAccount extends checkingAccount{
	
	private double dayRate;
	private double yieldRate;
	
	public double getDayRate() {
		return dayRate;
	}
	public void setDayRate(double dayRate) {
		this.dayRate = dayRate;
	}
	
	@Override
	public String toString() {
		String data = "\nSavings Account ";
		data += "\nDay Rate: " + dayRate;
		data += "\nBalance: " + this.getBalance();
		return data;
	}
	
	public boolean newBalance(double yieldRate) {
		Calendar today = Calendar.getInstance();
		if (dayRate == today.get(Calendar.DAY_OF_MONTH)) {
			this.setBalance(this.getBalance() + (this.getBalance() * yieldRate));
			return true;
		}
		return false;
	}
}
