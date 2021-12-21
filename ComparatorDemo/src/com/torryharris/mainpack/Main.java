package com.torryharris.mainpack;

import com.torryharris.comparatorpack.AgeComparator;
import com.torryharris.ppack.Person;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<Person> plist=new ArrayList<>();
        plist.add(new Person(10,"abc",18));
        plist.add(new Person(11,"aaa",25));
        plist.add(new Person(12,"bbb",16));
        plist.add(new Person(13,"ccc",30));
        plist.add(new Person(14,"ddd",45));
        plist.add(new Person(15,"eee",62));
        System.out.println(plist);
        System.out.println("After Sorting through age");

        Collections.sort(plist,new AgeComparator());
        System.out.println(plist);
    }
}
