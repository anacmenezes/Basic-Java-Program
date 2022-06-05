package PrgBankAccount;

public class overdraftAccount extends checkingAccount {
	
	private double protection;

	public double getProtection() {
		return protection;
	}

	public void setProtection(double protection) {
		this.protection = protection;
	}
	
	@Override
	public String toString() {
		String data = "\nOverdraft Account ";
		data += "\nLimit: " + protection;
		return data;
	}
	
	public boolean withdraw(double value) {
		double limitBalance = this.getBalance() + protection;
		if((limitBalance - value) >= 0) {
			this.setBalance(getBalance() - value);
			return true;
		}
		return false;
	}

}
