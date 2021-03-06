package com.Projects.atm;

import java.util.Scanner;

//Description of this Program:-
//Made This using :- Inbuilt 3 Classes :- 1. Scanner class and 2.Hash class 3.Hash Map class
//                :- 1 Interface :- ATMInterface
//                :- 3 UserDefined class :- 1. MainClass 2. ATM class 3. AtmOperationImplement class.
//                                     :-  1. Main class holds all the main User ui Section.
//                                     :-  2. ATM class holds 1 Constructor and getters and setters to return the amounts.
//                                     :-  3. AtmoperationImplement class implemented by the interface class ATMInterface.
public class MainClass {
    public static void main(String[] args){

        ATMInterface op = new AtmOperationImplement();
        int atmNum = 1234;
        int atmPin = 1234;
        System.out.println("\t\t\t\t\t\t\t\t\t\t\tWelcome to ATM Machine");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Account number : ");
        int atm = sc.nextInt();
        System.out.println("Enter Pin:");
        int pin = sc.nextInt();

        if((atmNum == atm) && (atmPin==pin) )
        {
            while (true){
                System.out.println("1. View Available Balance\n2.Withdraw Amount\n3.Deposit the Amount\n4.View Mini Statement\n5.Exit");
                System.out.println("Enter your choice :");
                int ch = sc.nextInt();
                if(ch == 1){
                    op.viewBalance();
                }
                else if (ch == 2) {
                    System.out.println("Enter Amount to Withdraw : ");
                    double withdrawAmount = sc.nextDouble();
                    op.withdrawAmount(withdrawAmount);
                }
                else if (ch == 3) {
                    System.out.println("Enter the Amount to deposite :");
                    double depo = sc.nextDouble();
                    op.depositAmount(depo);
                }
                else if (ch == 4) {
                    op.viewMiniStatement();
                }
                else if (ch == 5) {
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
            System.out.println("Incorrect Account number or Pin!");
        }

        System.out.println("Thank you!");
    }
}
