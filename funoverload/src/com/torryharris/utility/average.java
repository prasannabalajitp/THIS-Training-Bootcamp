package com.torryharris.utility;

public class average {
    public double calc_avg(int ...numbers){
        int sum = 0;
        for (int n:numbers){
            sum += n;
        }
        return (sum/ numbers.length);
    }
    public float calc_avg(int a, float b){
        return (a+b)/2;
    }

}
