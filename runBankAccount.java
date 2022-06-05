package PrgBankAccount;
import java.util.Scanner;

public class runBankAccount {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("***Bank Account***");
		
		checkingAccount checking = new checkingAccount();
		savingsAccount savings = new savingsAccount();
		overdraftAccount overdraft = new overdraftAccount();
		
		checking.setClientName("Caetana Mensori");
		checking.setBranch(123);
		checking.setAccount(789456);
		savings.setBalance(300);
		overdraft.setProtection(500);
		
		System.out.println(checking);	
		System.out.println(savings);	
		System.out.println(overdraft);		
	}
}
