package Main;

import static org.junit.jupiter.api.Assertions.fail;

import Accounts.Checking_Account;
import Accounts.Saving_Account;

public class Main {

	public static void main(String[] args) {
		
		//**** Probemos que podemos utilizar la sobrecarga de metodos al cambiar  
		//**** a false o true si se usa cajero automático para retirar de la cuenta
		
		//instanciamos una nueva cuenta corriente
		Checking_Account myAccount = new Checking_Account("123456789", 1000, 100, 0.5);
		double amountToWithdraw = 200;
        double atmFee = 3;
        boolean useATM = false;  // Cambia esto para probar el retiro con/sin tarifa 
        
        // Esta lógica permite utilizar los métodos de retiro de la clase Cuenta Corriente
        if (useATM) {
            // Retirar con tarifa
            myAccount.withdraw(amountToWithdraw, atmFee);
        } else {
            // Retirar sin tarifa.
            myAccount.withdraw(amountToWithdraw);
        }

		System.out.println("Saldo en dólares después del retiro de "+ amountToWithdraw + " dólares a la cuenta corriente: " + myAccount.getBalance()+"\n");
		
		//Ahora probemos si podemos retirar más de 500 dólares a la cuenta corriente
		
		double amountToWidraw = 950; //Esta cantidad supera el sobregiro de 100 dolares + el saldo de la cuenta que para este momento es de 800 dólares
		myAccount.withdraw(amountToWidraw);	
		
		//**** 
		// Instanciamos una nueva cuenta de ahorros con saldo  
		Saving_Account mySavingAccount = new Saving_Account("2345", 2000, 3);
		double amountToDeposit = 150;
		
		mySavingAccount.deposit(amountToDeposit);

		System.out.println("Saldo en dólare después del depósito de "+amountToDeposit +" dólares a la cuenta de ahorros: " + mySavingAccount.getBalance()+"\n");
		
		
		//****
	}

}
