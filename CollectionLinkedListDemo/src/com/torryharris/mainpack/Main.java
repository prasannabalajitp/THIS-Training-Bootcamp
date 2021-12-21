package com.torryharris.mainpack;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<String> l1=new LinkedList<String>();
        l1.add("Orange");
        l1.add("Apple");
        l1.add("Grapes");
        System.out.println("Is Empty : "+l1.isEmpty());
        System.out.println("Contains Grapes : "+l1.contains("Grapes"));

        ListIterator<String> it= (ListIterator<String>) l1.iterator();
        while (it.hasNext()){
            System.out.println(it.next()+" ");
        }
        System.out.println();
        while (it.hasPrevious()){
            System.out.println(it.previous()+" ");
        }

        Collections.reverse(l1);
        System.out.println(l1);
        Collections.sort(l1);
        System.out.println(l1);
        Collections.shuffle(l1);
        System.out.println(l1);
    }
}
