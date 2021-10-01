package com.torryharris.accountpack;

public class Account {
    private static int count;
    private final long accNo;
    private String accType;
    private double balance;

    static {
        count=0;
    }
    public static long getcount(){
        return (++count);
    }

    public Account(String accType, double balance) {
        this.accNo=getcount();
        this.accType = accType;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accNo=" + accNo +
                ", accType='" + accType + '\'' +
                ", balance=" + balance +
                '}';
    }
    public double deposit(double amount){
        balance+=amount;
        return amount;
    }
    public double withDraw(double amount){
        balance-=amount;
        return amount;
    }
    public double ret_balance(double balance){
        return balance;
    }
}
