package FileHandling;

import java.util.Scanner;

class AtmSystem {

    static int balance = 100;

    static void deposit(int amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount..........Failed  !!");
            return;
        }
        balance += amount;
        System.out.println(amount + " rupees is deposited successfully !!");
    }

    static void withdraw(int amount) {
        if (balance < 0) {
            System.out.println("Balance is insufficient");
            return;
        }
        balance -= amount;
        System.out.println(amount + " rupees successfully Withdraw !!");
    }

    static void checkBalance() {
        System.out.println(balance + " rupees is remaining !!");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to ATM SYSTEM !!");
        int con = 1;
        while (con == 1) {
            System.out.println("Select the Option for processing : ");
            System.out.println("Press 1 for deposit\nPress 2 for withdraw\nPress 3 for display");
            int input = sc.nextInt();
            switch (input) {
                case 1:
                    System.out.println(
                            "Enter the amount:" );
                    int amount = sc.nextInt();
                    deposit(amount);
                    break;

                case 2:
                    System.out.println("Enter the amount to withdraw : ");
                    int amount2 = sc.nextInt();
                    withdraw(amount2);
                    break;

                case 3:
                    checkBalance();
                    break;

                default:
                    System.out.println("Invalid Input !!");
            }

            System.out.println("Press 1 to continue and 0 to exit !!");
            con = sc.nextInt();
        }

    }
}
