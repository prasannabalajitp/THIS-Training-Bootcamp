package com.torryharris;

import com.torryharris.circlepack.Circle;

public class Main {

    public static void main(String[] args) {
        Circle c1=new Circle();
        Circle c2=new Circle("Red");
        Circle c3=new Circle(5);
        Circle c4=new Circle(7,"Green");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
    }
}
