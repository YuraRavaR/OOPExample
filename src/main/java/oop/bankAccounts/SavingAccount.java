package oop.bankAccounts;

public class SavingAccount extends BankAccount {


    @Override
    public String getAccountType() {
        return "Saving Account";
    }

    public SavingAccount(String fullName, double balance) {
        super(fullName, balance);
        rateDeposit = 3;
    }


}
