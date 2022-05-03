package com.projectpractice;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args){

//        AtmInterface ai = new AtmOperationImplementation();
        AtmInterface ai = new AtmOperationImplementation();

            int accNum = 1234;
            int atmPin = 1234;
            System.out.println("\t\t\t\t\t\t\t\t\t\t\tWelcome to the ATM");
            Scanner sc = new Scanner(System.in);

        System.out.println("Enter Account number :");
        int ac = sc.nextInt();
        System.out.println("Enter pin :");
        int pin = sc.nextInt();
        if((accNum == ac) && (atmPin == pin)){
            while(true){
                System.out.println("1. View Available Balance\n2.Withdraw Amount\n3.Deposit the Amount\n4.View Mini Statement\n5.Exit");
                System.out.println("Enter your choice :");
                int ch = sc.nextInt();
                switch (ch){
                    case 1:
                        ai.viewBalance();
                        break;
                    case 2:
                        System.out.println("Enter an amount to withdraw :");
                        double withdraw = sc.nextDouble();
                        ai.withdrawAmount(withdraw);
                        break;

                    case 3:
                        System.out.println("Enter an amount to deposit :");
                        double depo = sc.nextDouble();
                        ai.depositAmount(depo);
                        break;
                    case 4:

                        break;
                    case  5:
                        System.out.println("You Exited Successfully!");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Enter correct choice!");
                }
            }
        }
        else {
            System.out.print("Entered wrong Account number or Pin! ");
        }
    }
}
