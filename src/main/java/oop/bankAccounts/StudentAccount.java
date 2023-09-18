package oop.bankAccounts;

public class StudentAccount extends BankAccount {
    private int age;


    public StudentAccount(String fullName, double balance, int age) {
        super(fullName, balance);
        rateDeposit = 5;
        if (ageValidation(age)) {
            this.age = age;
        } else throw new IllegalArgumentException("Age not suitable");
    }


    private boolean ageValidation(int age) {
        return age >= 18 && age <= 26;
    }

    @Override
    public String getAllInfoAboutBalance() {

        return super.getAllInfoAboutBalance() + ", Age=" + age;
    }

    @Override
    public String getAccountType() {
        return "Student account";
    }
}
