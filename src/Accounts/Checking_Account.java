package Accounts;

// La cuenta corriente se extiende (Hereda) de la Clase Cuenta
public class Checking_Account extends Account {
	private double overdraftLimit;
	private double interestRate; 
	
	//constructor de la clase Cuenta corriente 
    public Checking_Account(String accountNumber, double initialBalance, double overdraftLimit, double interestRate) {
        super(accountNumber, initialBalance);
        this.overdraftLimit = overdraftLimit;
        this.interestRate = interestRate;
    }
    
    //Getters y Setters
    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }
    
    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    // método sobreescrito de la clase Account
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (getBalance() + overdraftLimit >= amount)) {
            super.withdraw(amount);
        }
        else {
        	System.out.println("Lo sentimos, no se puede retirar más del límite de esta cuenta que son: "+ (getBalance() + overdraftLimit) +" dólares, intente de nuevo.");
        }
    }
    
    // Sobrecarga del método withdraw con un parámetro adicional 'fee' para aplicar tarifas
    public void withdraw(double amount, double fee) {
        if (amount > 0 && (getBalance() + overdraftLimit >= amount + fee)) {
            super.withdraw(amount + fee);
        }
    }
    
    // al ser un método abstracto se debe implementar la lógica de forma obligada para la cuenta corriente
	@Override
	public void applyInterest() {
		if (getBalance() >0 ) {
			double interest = getBalance()*(interestRate / 100);
			deposit(interest);
		}
		
	}
}
