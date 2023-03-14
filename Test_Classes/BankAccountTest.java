package Test_Classes;

import Data_Classes.BankAccount;
import Data_Classes.MethodOverloading;

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