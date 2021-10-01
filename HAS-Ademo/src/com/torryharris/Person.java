package com.torryharris;

public class Person {
    private int personId;
    private String personName;
    private Address addrs;

    public Person(int personId, String personName, Address addrs) {
        this.personId = personId;
        this.personName = personName;
        this.addrs = addrs;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personId=" + personId +
                ", personName='" + personName + '\'' +
                ", addrs=" + addrs +
                '}';
    }
}
