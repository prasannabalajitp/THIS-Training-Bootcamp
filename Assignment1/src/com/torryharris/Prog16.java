package com.torryharris;
import java.util.*;

public class Prog16 {
    public void arm_strong(int num){
        char[] ch= (""+num).toCharArray();
        int len=ch.length;
        int sum=0;
        for (char c:ch){
            int n=Integer.parseInt(String.valueOf(c));
            sum += Math.pow(n,len);
        }
        if (sum==num)
            System.out.println(num+" is an armstrong number");
    }
}
