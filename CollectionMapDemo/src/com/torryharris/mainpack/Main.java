package com.torryharris.mainpack;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Map<Integer, String> hm= new HashMap<>();
        hm.put(100,"a");
        hm.put(101,"b");
        hm.put(102,"a");
        System.out.println(hm);

        Map<Integer, String> lhm=new LinkedHashMap<>();
        lhm.put(101,"aa");
        lhm.put(102,"bb");
        lhm.put(null,"cc");
        System.out.println(lhm);

        Map<Integer,String> thm=new TreeMap<>();
        thm.put(100,"aaa");
        thm.put(101,"bbb");
        thm.put(102,"ccc");
        thm.put(103,"ddd");
        thm.put(104,"zzz");
        System.out.println(thm);
    }
}
