package com.th;

public class Main {

    public static void main(String[] args) {
        /*
        for (int i = 0; i++ <= 10; i++) {
            System.out.println(i);
        }

         */
        int[] arr= {11,26,133,47,55};
        int max=arr[0];
        int min=arr[0];
        for (int i=1;i< arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
            if (arr[i]<min) {
                min = arr[i];
            }
        }
        System.out.println("Max no. is : "+max);
        System.out.println("Min no. is : "+min);
    }
}
