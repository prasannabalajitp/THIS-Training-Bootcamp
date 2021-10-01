package com.torryharris.mainpack;

import com.torryharris.tpack.Test;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> ilist=new ArrayList<>();
        ilist.add(10);
        ilist.add(20);
        ilist.add(30);
        ilist.add(40);
        ilist.add(50);
        System.out.println(Test.sumOfList(ilist));

        ArrayList<Integer> dlist=new ArrayList<>();
        dlist.add(10);
        dlist.add(10);
        dlist.add(10);
        dlist.add(10);
        dlist.add(10);
    }
}
