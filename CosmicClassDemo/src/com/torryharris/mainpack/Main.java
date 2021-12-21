package com.torryharris.mainpack;

import com.torryharris.myDatePack.MyDate;

public class Main {

    public static void main(String[] args) {
        MyDate d1=new MyDate(27,9,21);
        MyDate d2=new MyDate(27,9,21);
        MyDate d3=d1;

        System.out.println(d1.equals(d2));
        System.out.println(d1.equals(d3));
        System.out.println(d1.hashCode());
        System.out.println(d2.hashCode());
        System.out.println(d3.hashCode());
    }
}
