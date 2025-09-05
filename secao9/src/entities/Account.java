package entities;

public class Account {
    private int number;
    private String name;
    private double balance;

    public Account(int number, String name, double initialDeposit) {
        this.number = number;
        this.name = name;
        deposit(initialDeposit);
    }

    public Account(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public int getNumber() {
        return  number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount + 5;
    }

    @Override
    public String toString() {
        return "Account Data: \n" +
                "Account = " + number + ", Holder = " + name + ", Balance = $" + balance;
    }


}
