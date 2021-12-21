package com.torryharris.mainpack;

import com.torryharris.cpack.Citizen;
import com.torryharris.exceptionpack.InvalidAgeException;

public class Main {

    public static void main(String[] args) {
        Citizen c1=new Citizen(100,"abc",16);
        try {
            c1.getLicence();
        } catch (InvalidAgeException e) {
            System.out.println(e);
        }
    }
}
