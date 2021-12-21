package com.torryharris.mainpack;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Vector<String> v1=new Vector<String>();
        v1.add("Seetha");
        v1.add("Geetha");
        v1.add("Mohan");
        v1.add("Vijay");
        v1.add("Arun");

        Enumeration<String> e= v1.elements();
        while (e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
        System.out.println();
        Iterator<String> it1= v1.iterator();
        while (it1.hasNext()){
            System.out.println(it1.next());
        }
    }
}
