package com.Projects.atm;

import java.util.HashMap;
import java.util.Map;

public class AtmOperationImplement implements ATMInterface{
    ATM atm = new ATM();//Created object of the ATM class.

    Map<Double,String> miniStat = new HashMap<>();

    @Override
    public void viewBalance() {
        System.out.println("Available balance is :"+atm.getBalance());
    }

    @Override
    public void withdrawAmount(double withdrawAmount) {
        if((withdrawAmount % 500)== 0){     //Here added the condition that user can only take cash in the Round figure number.
                if(withdrawAmount <= atm.getBalance() ){
                miniStat.put(withdrawAmount," Amount Withdrawn");
                System.out.println("Collect the " + withdrawAmount + "Cash ");
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
        miniStat.put(depositAmount," Amount Deposited");
        System.out.println(depositAmount+" Deposited Successfully !!");
        atm.setBalance(atm.getBalance() + depositAmount);
        viewBalance();
    }

    @Override
    public void viewMiniStatement() {
        for (Map.Entry<Double,String> m:miniStat.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
