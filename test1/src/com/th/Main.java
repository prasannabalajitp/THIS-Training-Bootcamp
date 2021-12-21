package com.th;
import com.sun.jnlp.PreverificationClassLoader;
import com.sun.org.apache.xpath.internal.objects.XString;

import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        /*
        int n= sc.nextInt();
        int m= sc.nextInt();
        int sum=n+m;
        System.out.println(sum);

        int i = 10;
        System.out.println(++i +" "+ i++ +" "+ i++ );*/

        /*
        int n=sc.nextInt();
        int rem=0, revnum=0;
        while(n!=0){
            rem = n%10;
            revnum = revrem * 10 + rem;
            n = n/10;
        }
        System.out.println(revnum);
         */
        /*
        int n=sc.nextInt();
        System.out.println(reverseNum(n));
        */
        /*
        int num=sc.nextInt();
        String str= String.valueOf(num);
        StringBuffer sb= new StringBuffer(str);
        sb = sb.reverse();
        str = sb.toString();
        System.out.println(str);
         */
        /*
        for(int n=0;n<=100;n++) {
            if (n % 2 == 0 || n % 3 == 0 || n % 5 == 0 || n % 7 == 0 || n % 11 == 0 || n % 13 == 0 || n % 17 == 0 || n % 19 == 0) {
                System.out.println(n + " is not a prime number");
            } else
                System.out.println(n + " is a prime number");
        }
         */
        /*
        int n=sc.nextInt();
        int m=0,flag=0;
        m=n/2;
        for (int i=2;i<=m;i++){
            if (n%i ==0){
                System.out.println(n+" is not a prime number");
                flag=1;
                break;
            }
        }
        if (flag==0)
            System.out.println(n+" is a prime number");

         */
        /*
        int n= sc.nextInt();
        int fact=factorial(n);
        System.out.println(fact);
        */
        /*
        System.out.println("Enter the month number: ");
        int n=sc.nextInt();
        String days = tofinddays(n);
        System.out.println(days);
         */
        int n=sc.nextInt();
        int sum=0;
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        System.out.println("Sum of elements in array : "+sum);
    }
    public static int factorial(int num){
        if (num == 1 || num == 0){
            return 1;
        }
        else
            return num*(factorial(num-1));
    }
    public static String tofinddays(int num){
        String days="";
        switch (num){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = "Has 31 Days";
                break;
            case 2:
                days = "Has 28 or 29 daya";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = "Has 30 days";
            default:
                days = "Invalid input";
        }
        return days;
    }
}
