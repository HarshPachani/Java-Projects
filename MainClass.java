package com.Projects;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args){

        ATMInterface op = new AtmOperationImplement();
        int atmNum = 1234;
        int atmPin = 1234;
        System.out.println("\t\t\t\t\t\t\t\t\t\t\tWelcome to ATM Machine");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter ATM number : ");
        int atm = sc.nextInt();
        System.out.println("Enter Pin:");
        int pin = sc.nextInt();

        if((atmNum == atm) && (atmPin==pin) )
        {
            while (true){
                System.out.println("1. View Available Balance\n2.Withdraw Amount\n3.Deposite the Amount\n4.View Mini Statement\n5.Exit");
                System.out.println("Enter your choice :");
                int ch = sc.nextInt();
                if(ch == 1){
                    op.viewBalance();
                } else if (ch == 2) {
                    System.out.println("Enter Amount to Withdraw : ");
                    double withdrawAmount = sc.nextDouble();
                    op.withdrawAmount(withdrawAmount);
                }else if (ch == 3) {
                    System.out.println("Enter the Amount to deposite :");
                    double depo = sc.nextDouble();
                    op.depositeAmount(depo);
                }else if (ch == 4) {
                    op.viewMiniStatement();
                }else if (ch == 5) {
                    System.out.println("You Exitted Successfully!");
                    System.out.println("Collect your ATM card!");
                    System.exit(0);
                }
                else {
                    System.out.println("Enter Correct choice!");
                }
            }
        }
        else {
            System.out.println("Incorrect ATM number or Pin!");
        }

        System.out.println("Thank you!");
    }
}
