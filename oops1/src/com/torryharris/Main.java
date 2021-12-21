package com.torryharris;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /*Book book1=new Book(3300, "Java", 500);
        System.out.println(book1);*/
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of books to be entered");
        int n=sc.nextInt();
        Book[] arrbook = new Book[n];
        for (int i=0;i<n;i++){
            System.out.println("Enter the contents of book : "+(i+1));
            int bookId=sc.nextInt();
            sc.nextLine();
            String bookName=sc.nextLine();
            int bookPrice=sc.nextInt();
            arrbook[i]=new Book(bookId,bookName,bookPrice);
        }
        System.out.println("==================================================");
        for (Book book:arrbook){
            System.out.println(book);
            System.out.println("------------------------------------------------");
        }
    }
}