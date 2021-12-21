package com.torryharris;
import java.util.*;

public class Prog13 {
    public void duplicate(int[] arr){
        Arrays.sort(arr);
        int prev=arr[0]-1;
        int count=0;
        System.out.println("The duplicate elements are : ");
        for (int j : arr) {
            if (j == prev) {
                System.out.print(j + "\t");
                ++count;
            } else
                prev = j;
        }
        System.out.println();
        System.out.println(count);
    }
}
