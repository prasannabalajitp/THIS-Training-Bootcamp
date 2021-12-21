package com.torryharris;

public class Main {

    public static void main(String[] args) {
        Address adrs=new Address(10,"East West college road","Bangalore","Karnataka",560091);
        Person prs=new Person(101,"Shivakumar",adrs);
        System.out.println(prs);
    }
}
