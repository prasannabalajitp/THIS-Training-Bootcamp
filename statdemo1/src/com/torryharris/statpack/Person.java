package com.torryharris.statpack;

public class Person {
    private static int count;
    private int pId;
    private String pName;

    static {
        count=0;
    }

    public Person(int pId, String pName) {
        this.pId=pId;
        this.pName=pName;
        ++count;
    }

    @Override
    public String toString() {
        return "Person{" +
                "pId=" + pId +
                ", pName=" + pName +
                '}';
    }

    public static int getCount() {
        return count;
    }
}
