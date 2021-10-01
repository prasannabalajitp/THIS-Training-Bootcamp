package com.torryharris.mainpack;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<String> l1=new ArrayList<>(15);
        l1.add("Meera");
        l1.add("Mary");
        l1.add("Arjun");
        l1.add("Mythili");
        l1.add("Mythili");
        System.out.println(l1);

        l1.add(1,"Mahesh");
        System.out.println(l1);

        ArrayList<String> l2=new ArrayList<>();
        l2.add("One");
        l2.add("Two");
        l2.add("Three");
        l1.addAll(1,l2);
        System.out.println(l1);

        Iterator<String> it=l1.iterator();
        while (it.hasNext()){
            System.out.println(it.next().toUpperCase()+" ");
        }

        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> il=new ArrayList<Integer>();
        System.out.println("Enter the no. of elements : ");
        int n=sc.nextInt();
        for (int i=0;i<n;i++){
            System.out.println("Enter the element : ");
            int ele= sc.nextInt();
            il.add(ele);
        }

        int sum=0;
        Iterator<Integer> it1= il.iterator();
        while (it1.hasNext()){
            int ele1=it1.next();
            System.out.println(ele1+"  ");
            sum+=ele1;
        }
        System.out.println(sum);
        sc.close();
    }
}
