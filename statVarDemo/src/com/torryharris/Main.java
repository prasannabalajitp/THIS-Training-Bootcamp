package com.torryharris;

import com.torryharris.accountpack.Account;

public class Main {

    public static void main(String[] args) {

        Account per1=new Account("Savings",5000);
        System.out.println(per1);
        System.out.println("Amount Deposited : "+per1.deposit(6000));
        System.out.println("Account status : "+per1);
        System.out.println("Amount with drawn : "+per1.withDraw(1000));
        System.out.println("Current Account Status : "+per1);
    }
}
