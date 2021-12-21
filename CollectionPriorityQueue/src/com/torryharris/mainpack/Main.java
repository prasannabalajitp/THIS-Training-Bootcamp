package com.torryharris.mainpack;

import com.torryharris.ipack.Item;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Queue<Item> pq=new PriorityQueue<Item>();
        pq.add(new Item(100,"Java"));
        pq.add(new Item(56,"Git"));
        pq.add(new Item(10,"OS"));
        pq.add(new Item(40,"PHP"));
        pq.add(new Item(100,"HTML"));

        for (Item i:pq){
            System.out.println(i);
        }
        System.out.println("***************************************");
        System.out.println(pq.poll());
        System.out.println("***************************************");

        for (Item i:pq){
            System.out.println(i);
        }
    }
}
