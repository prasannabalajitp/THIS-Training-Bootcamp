package com.torryharris.mainpack;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Stack<String> st1=new Stack<String>();
        st1.push("a");
        st1.push("b");
        st1.push("c");
        st1.push("d");

        System.out.println(st1.pop());
        System.out.println(st1.peek());
        System.out.println(st1);

        st1.add(1,"z");
        System.out.println(st1);

        System.out.println(st1.search("z"));
    }
}
