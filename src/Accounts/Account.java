package Accounts;
	// La clase abstracta Account(Cuenta) representa una cuenta bancaria genérica
public abstract class Account {
    private String accountNumber;
    private double balance;

    //Constructor de la clase Account 
    public Account(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }
    //Getters y Setters
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }
    
    // método para depositar en la cuenta
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
    // método para retirar un monto de la cuenta
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
        }
    }

    // método abstracto que deberá ser implementado según el tipo de cuenta.
    public abstract void applyInterest();
}

