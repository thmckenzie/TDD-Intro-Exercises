package com.thoughtworks.tddintro.account;

public class Account {

    public int updateBalance(String updateType, int balance, int amount){
        String update = updateType.toLowerCase();

        if(update == "deposit"){
            int updatedBalance = balance + amount;
            return updatedBalance;
        }else if(update == "withdraw"){
            if(balance < amount){
                return balance;
            }else{
                int updatedBalance = balance - amount;
                return updatedBalance;
            }
        }else{
            return -1;
        }
    }
}
