package com.torryharris.mainpack;

import com.torryharris.statpack.Person;

public class Main {

    public static void main(String[] args) {
        Person p1=new Person(100,"abc");
        Person p2=new Person(101,"bcd");

        System.out.println(p1);
        System.out.println(p2);

        System.out.println(Person.getCount());
    }
}
