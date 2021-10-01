package com.torryharris.mainpack;

import com.torryharris.spack.Student;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        File file2=new File("C:\\Users\\shivakumar_hombal\\Desktop\\file3.txt");
        try(FileOutputStream output=new FileOutputStream(file2);
            ObjectOutputStream out=new ObjectOutputStream(output);

            FileInputStream input=new FileInputStream(file2);
            ObjectInputStream in=new ObjectInputStream(input)){
            Student s1=new Student(10,"aaa",80);
            out.writeObject(s1);
            Student s2=new Student(11,"bbb",95);
            out.writeObject(s2);
            System.out.println("Students record written to file");

            while (input.available()>0){
                Student s=(Student) in.readObject();
                System.out.println(s);
            }
        } catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
