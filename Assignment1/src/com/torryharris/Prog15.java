package com.torryharris;
import java.util.*;

public class Prog15 {
    public void add_ele(Integer[] arr){
        List<Integer> list=new ArrayList<>(Arrays.asList(arr));
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the position of the array : ");
        int pos=sc.nextInt();
        System.out.println("Enter the value : ");
        int ele= sc.nextInt();
        list.add(pos-1,ele);
        arr=list.toArray(arr);
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}
