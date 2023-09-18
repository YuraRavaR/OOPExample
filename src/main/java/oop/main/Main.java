package oop.main;

import oop.bankAccounts.BankAccount;
import oop.bankAccounts.SavingAccount;
import oop.bankAccounts.StudentAccount;

public class Main {
    public static void main(String[] args) {
        BankAccount savingAccount = new SavingAccount("Yura", 10);

        System.out.println(savingAccount.getAllInfoAboutBalance());

        BankAccount studentAccount = new StudentAccount("Student", 0, 21);
        System.out.println(studentAccount.getAllInfoAboutBalance());

        studentAccount.deposit(100.5);
        savingAccount.withdraw(5.5);
        System.out.println(savingAccount.getAllInfoAboutBalance());
        System.out.println(studentAccount.getAllInfoAboutBalance());
    }
}
