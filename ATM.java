package com.Projects;

public class ATM {
    private double balance;
    private double depositeAmount;
    private double withdrawAmount;

    //Default constructor.
    public ATM(){

    }

    //getters and setters
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getDepositeAmount() {
        return depositeAmount;
    }

    public void setDepositeAmount(double depositeAmount) {
        this.depositeAmount = depositeAmount;
    }

    public double getWithdrawAmount() {
        return withdrawAmount;
    }

    public void setWithdrawAmount(double withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }
}
