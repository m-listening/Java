package start_base.Test_Classes;

import start_base.Data_Classes.BankAccount;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount bA = new BankAccount(300);
        System.out.println("Balance: " + bA.getBalance());
        bA.refill(50);
        System.out.println("Balance: " + bA.getBalance());
        bA.withdrawMoney(100);
        System.out.println("Balance: " + bA.getBalance());
    }
}