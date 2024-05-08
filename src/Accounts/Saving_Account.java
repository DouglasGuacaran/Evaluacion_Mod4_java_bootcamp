package Accounts;

public class Saving_Account extends Account{

    private double interestRate;
    
    public Saving_Account(String accountNumber, double initialBalance, double interestRate) {
        super(accountNumber, initialBalance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

 // Sobrecarga del método withdraw con un parámetro adicional 'fee'
    public void withdraw(double amount, double fee) {
        if (amount > 0 && (getBalance() >= amount + fee)) {
            super.withdraw(amount + fee);
        }
    }
    @Override
    public void applyInterest() {
        double interest = getBalance() * (interestRate / 100);
        deposit(interest);
    }
}
