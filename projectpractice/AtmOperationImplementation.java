package com.projectpractice;

public class AtmOperationImplementation implements AtmInterface{
    ATM atm = new ATM();

    @Override
    public void viewBalance() {
        System.out.println("Available balance is :"+atm.getBalance());
    }

    @Override
    public void withdrawAmount(double withdrawAmount) {
        if(withdrawAmount % 500 == 0){
            if(withdrawAmount <= atm.getBalance()){
                System.out.println("collect the "+withdrawAmount + " Cash (●'◡'●)");
                atm.setBalance(atm.getBalance() - withdrawAmount);
                viewBalance();
            }
            else {
                System.out.println("Insufficient Balance !!");
            }
        }
    }

    @Override
    public void depositAmount(double depositAmount) {
        System.out.println(depositAmount + " Deposited Successfully");
        atm.setBalance(atm.getBalance() + depositAmount);
        viewBalance();
    }

    @Override
    public void viewMiniStat() {
        System.out.print("Hello");
    }
}
