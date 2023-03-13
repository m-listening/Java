package Data_Classes;

public class BankAccount {
    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void withdrawMoney(int total) {
        balance -= total;
    }

    public void refill(int total) {
        balance += total;
    }
}
