package Accounts;

public class Checking_Account extends Account {
	private double overdraftLimit;

    public Checking_Account(String accountNumber, double initialBalance, double overdraftLimit) {
        super(accountNumber, initialBalance);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (getBalance() + overdraftLimit >= amount)) {
            super.withdraw(amount);
        }
    }
	@Override
	public void applyInterest() {
		// TODO Auto-generated method stub
		
	}
}
