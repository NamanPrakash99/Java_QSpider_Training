package Encapsulation;

public class Task2 {
    private int balance;

    public void deposit(int amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }

    public int getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        
    }
}