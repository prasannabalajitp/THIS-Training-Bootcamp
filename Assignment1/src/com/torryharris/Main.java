package com.torryharris;

public class Main {

    public static void main(String[] args) {
        int[] arr={10,10,9,8,20,30,40,9,8};

        Prog13 ob1 = new Prog13();
        System.out.println("=======================================================================\n"+"OUTPUT 13");
        ob1.duplicate(arr);

        Prog14 ob2 = new Prog14();
        System.out.println("=======================================================================\n"+"OUTPUT 14");
        ob2.rmv_duplicate(arr);

        Prog15 ob3=new Prog15();
        Integer[] list=new Integer[arr.length];
        for (int i=0;i< arr.length;i++){
            list[i]=Integer.valueOf(arr[i]);
        }
        System.out.println("=======================================================================\n"+"OUTPUT 15");
        ob3.add_ele(list);
        Prog16 ob4=new Prog16();
        System.out.println("=======================================================================\n"+"OUTPUT 16");
        for(int i=1;i<=1000;i++){
            ob4.arm_strong(i);
        }

    }
}
