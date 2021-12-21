package com.torryharris.cpack;

import com.torryharris.exceptionpack.InvalidAgeException;

public class Citizen {
    private int aadharNo;
    private String name;
    private int age;

    public Citizen(int aadharNo, String name, int age) {
        this.aadharNo = aadharNo;
        this.name = name;
        this.age = age;
    }

    public String getLicence() throws InvalidAgeException {
        if (age<18){
            throw new InvalidAgeException("Licence cannot be issued to minor children!!");
        }
        else
            if((age<=75)&&(age>18))
                return ("Congrats...........Licence Issued");
            else
                throw new InvalidAgeException("Licence cannot be issued to Senior Citizens");
    }

    @Override
    public String toString() {
        return "Citizen{" +
                "aadharNo=" + aadharNo +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
