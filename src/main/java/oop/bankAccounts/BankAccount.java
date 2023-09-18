package oop.bankAccounts;

import java.util.Objects;

public abstract class BankAccount {
    private int accountId;
    private static int initialAccountID = 1;
    private String fullName;
    private double balance;

    protected double rateDeposit;

    public abstract String getAccountType();


    BankAccount(String fullName, double balance) {
        if (isValidFullName(fullName) && isValidBalance(balance)) {
            this.accountId = initialAccountID++;
            this.fullName = fullName;
            this.balance = balance;
        } else throw new IllegalArgumentException("No valid bank details");
    }

    private boolean isValidFullName(String fullName) {
        return fullName.length() >= 2;
    }

    private boolean isValidBalance(double balance) {
        return balance >= 0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankAccount that = (BankAccount) o;
        return accountId == that.accountId && Double.compare(that.balance, balance) == 0 && Double.compare(that.rateDeposit, rateDeposit) == 0 && fullName.equals(that.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountId, fullName, balance, rateDeposit);
    }

    public String getAllInfoAboutBalance() {
        return "BankAccount:" +
                "accountId=" + accountId +
                ", fullName='" + fullName + '\'' +
                ", balance=" + balance +
                ", rateDeposit=" + rateDeposit +
                ", accountType='" + getAccountType() + '\'';
    }

    public int getAccountId() {
        return accountId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getBalance() {
        return balance;
    }

}
