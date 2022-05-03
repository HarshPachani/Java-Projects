package com.projectpractice;
//To get the Account details.
public class ATM {
    private double deposit;
    private double withdraw;
    private double balance;

    public ATM(){
        System.out.println("Welcome to ATM");
    }
    public void setBalance(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return this.balance;
    }

    public void setDeposit(double deposit){
        this.deposit = deposit;
    }

    public double getDeposit(){
        return this.deposit;
    }

    public void setWithdraw(double withdraw){
        this.withdraw = withdraw;
    }

    public double getWithdraw(){
        return this.withdraw;
    }
}
