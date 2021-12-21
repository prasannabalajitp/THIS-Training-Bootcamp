package com.torryharris.mainpack;

import com.torryharris.custpack.Customer;

import java.util.*;

import static javax.swing.UIManager.get;

public class Main {

    public static void main(String[] args) {
        /*Map<String, Integer> hm=new HashMap<>();
        hm.put("Sofa",5000);
        hm.put("Table",3000);
        hm.put("Lamp",2000);
        System.out.println(hm.keySet());
        System.out.println(hm.values());
        System.out.println(hm.entrySet());

        for (String key:hm.keySet()){
            System.out.println(key+" "+hm.keySet());
        }
        int totalamt=0;
        for (String key:hm.keySet()){
            totalamt+=hm.get(key);
        }
        System.out.println(totalamt);*/

        HashMap<Customer, Integer> custmap=new HashMap<Customer,Integer>();
        custmap.put(new Customer(10,"aaa"),10000);
        custmap.put(new Customer(10,"bbb"),7000);
        custmap.put(new Customer(10,"ccc"),15000);
        int totalamt=0;
        for (Customer str:custmap.keySet()){
            totalamt+=custmap.get(str);
        }
        System.out.println(totalamt);

    }
}
