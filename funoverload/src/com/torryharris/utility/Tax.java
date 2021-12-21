package com.torryharris.utility;

public class Tax {
    public double calc_tax(long amt, char status){
        return (amt*0.1);
    }
    public int calc_tax(long amt){
        return (int) (amt*0.25);
    }
}
