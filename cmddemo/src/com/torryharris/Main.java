package com.torryharris;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= Integer.parseInt(args[0]);
        int[] arr=new int[n];
        for (int i=0;i< arr.length;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Sorted array is :");
        for (int i=0;i< arr.length-1;i++){
            for (int j=0;j< arr.length-i-1;j++){
                if (arr[j]>arr[j+1]){
                    int sw = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=sw;
                }
            }
        }
        for (int j : arr) {
            System.out.print(j + "\t");
        }
    }
}
