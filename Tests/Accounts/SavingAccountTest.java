package Accounts;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SavingAccountTest {

	// test para cuenta de ahorros, aplicando intereses del 2%
	@Test
	void testApplyInterest() {
		String accountNumber = "12345";
		double initialBalance = 1000;
		double interestRate = 2;
		
		Saving_Account savingAccount = new Saving_Account(accountNumber, initialBalance, interestRate);
		
		savingAccount.applyInterest();
		
		assertEquals(1020, savingAccount.getBalance(),2);
	}
	
	@Test
	void testWitdraw() {
		String accountNumber = "12345";
		double initialBalance = 1000;
		double interestRate = 2;
		double mountToWitdraw = 850;
		
		
		Saving_Account savingAccount = new Saving_Account(accountNumber, initialBalance, interestRate);
		
		savingAccount.withdraw(mountToWitdraw);
		
		assertEquals(150, savingAccount.getBalance());
	}
	
	

}
