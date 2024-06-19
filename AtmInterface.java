package codSoftTask;

import java.util.*;

class ki{
    Scanner sc = new Scanner(System.in);
    float balance;
    int pin;

    ki() {
        System.out.println("WELCOME TO ROBIN'S ATM INTERFACE");
    }

    public void PIN() {
        System.out.println("Enter 4 Digit Pin:");
        int count = 0;
        pin = sc.nextInt();

        while (pin != 0) {
            pin /= 10;
            count++;
        }
        if (count != 4) {
            System.out.println("Invalid PIN");
            PIN();
        } else {
            menu();
        }

    }

    public void menu() {
        System.out.println("\n1. Check Balance \n2. Withdraw Money  \n3. Deposit Money \n4. Exit");
        System.out.println();
        System.out.println("choose any one");
        int m = sc.nextInt();
        if (m == 1) accBal();
        else if (m == 2) withDraw();
        else if (m == 3) addMoney();
        else if (m == 4) exit();

    }

    void accBal() {
        System.out.println("Rs." + balance);
        System.out.println("Enter 1 to exit");
        int press = sc.nextInt();
        if (press == 1) menu();

    }

    void addMoney() {
        System.out.println("Add Amount:");
        int Add = sc.nextInt();
        balance += Add;
        System.out.println("Money Added Successfully\n new balance Rs." + balance);
        System.out.println("Enter 1 to exit");
        int press = sc.nextInt();
        if (press == 1) menu();

    }

    void withDraw() {
        System.out.println("Enter Amount:");
        int wd = sc.nextInt();
        if (wd < 10000) {
            if (balance < wd) System.out.println("Insufficient Money!!");
            else {
                balance -= wd;
                System.out.println("Withdraw Successful");
            }
        } else System.out.println("You can't withdraw more than Rs.10,000 at a time");
        System.out.println("Enter 1 to exit \n or 2 to check balance");
        int press = sc.nextInt();
        if (press == 1) menu();
        else if (press == 2) accBal();
    }

    void exit() {
        PIN();
    }
}
public class AtmInterface{
    public static void main(String[] args) {
        ki ba=new ki();
        ba.PIN();
    }
}
