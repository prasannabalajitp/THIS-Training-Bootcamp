package com.torryharris.circlepack;

public class Circle {
    private double radius;
    private  String color;

    public Circle() {
        this(3.5,"blue"); //invoking fully paramaterized constructor
    }

    public Circle(double radius) {
        this(radius,"brown");
    }
    public Circle(String color){
        this(6.5,color);
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
