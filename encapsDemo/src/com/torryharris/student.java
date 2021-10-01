package com.torryharris;

public class student {
    private int regno;
    private String name;
    private int sub1;
    private int sub2;
    private int sub3;

    public student(int regno, String name, int sub1, int sub2, int sub3) {
        this.regno = regno;
        this.name = name;
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
    }

    private double calc_perc(){
        return (sub1+sub2+sub3)/3;
    }

    @Override
    public String toString() {
        return "student{" +
                "regno=" + regno +
                ", name='" + name + '\'' +
                ", sub1=" + sub1 +
                ", sub2=" + sub2 +
                ", sub3=" + sub3 +
                ", Percentage=" + calc_perc() +
                '}';
    }
}
