package application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account acc;


        System.out.print("Enter account number: ");
        int number = sc.nextInt();

        System.out.print("Enter account name: ");
        String name = sc.next();

        System.out.println("Is there an initial deposit (y/n)? ");
        char response = sc.next().charAt(0);
        double amount = 0;
        if (response == 'y') {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            acc = new Account(number, name, initialDeposit);
        } else {
            acc = new Account(number, name);
        }


        System.out.println(acc.toString());;

        System.out.println("Enter a deposit value: ");
        amount = sc.nextDouble();
        acc.deposit(amount);

        System.out.println("Updated " +
                acc.toString());

        System.out.println("Enter a withdraw value: ");
        amount = sc.nextDouble();
        acc.withdraw(amount);

        System.out.println("Updated " +
                acc.toString());


        sc.close();
    }
}