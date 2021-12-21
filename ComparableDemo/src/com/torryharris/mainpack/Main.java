package com.torryharris.mainpack;

import com.torryharris.spack.Student;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> slist=new ArrayList<>();
        slist.add(new Student(10,"aaa",75));
        slist.add(new Student(20,"bbb",65));
        slist.add(new Student(30,"ccc",85));
        slist.add(new Student(40,"ddd",55));
        slist.add(new Student(50,"eee",75));
        System.out.println("Before Sorting");
        for (Student s:slist){
            System.out.println(s);
        }
        Collections.sort(slist);
        System.out.println("After Sorting");
        for (Student s:slist){
            System.out.println(s);
        }
    }
}
