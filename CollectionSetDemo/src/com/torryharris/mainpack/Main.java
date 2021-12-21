package com.torryharris.mainpack;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Set s1=new HashSet();
        s1.add("Set");
        s1.add(1);
        s1.add('A');
        s1.add("Mixed");
        System.out.println(s1);

        Set<String> s2=new HashSet<String>();
        s2.add("This");
        s2.add("Is");
        s2.add("A");
        s2.add("23");
        s2.add("23");
        s2.add("String");
        s2.add("Set");
        System.out.println(s2);

        Set<String> s3=new LinkedHashSet<String>();
        s3.add("abc");
        s3.add("abc");
        s3.add("qwe");
        s3.add("xyz");
        s3.add("qwe");
        System.out.println(s3);

        Set<String> s4=new TreeSet<String>();
        s4.add("Shivakumar");
        s4.add("Hombal");
        s4.add("Varun");
        s4.add("Aishwarya");
        System.out.println(s4);
    }
}
