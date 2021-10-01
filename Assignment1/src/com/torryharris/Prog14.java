package com.torryharris;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class Prog14 {
    public void rmv_duplicate(int[] arr){
        Arrays.sort(arr);
        LinkedHashSet<Integer> set=new LinkedHashSet<>();
        for (int i:arr){
            set.add(i);
        }
        System.out.println(set);
    }
}
